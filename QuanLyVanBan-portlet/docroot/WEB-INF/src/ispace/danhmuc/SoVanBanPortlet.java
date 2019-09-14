package ispace.danhmuc;



import ispace.model.SoVanBan;
import ispace.model.impl.SoVanBanImpl;
import ispace.service.SoVanBanLocalServiceUtil;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class SoVanBanPortlet
 */
public class SoVanBanPortlet extends MVCPortlet {

	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException{
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong =  SoVanBanLocalServiceUtil.getSoVanBansCount();
		String ten = ParamUtil.get(req, "ten", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SoVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("ten").like("%"+ten+"%"));
		}
		q.setLimit(batDau, ketThuc);
		List<SoVanBan> data = SoVanBanLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/sovanban/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")!=0){
			SoVanBan soVanBan = SoVanBanLocalServiceUtil.getSoVanBan(ParamUtil.getLong(req, "id"));
			req.setAttribute("soVanBan", soVanBan);
		}else if(ParamUtil.getLong(req, "id")==0){
			SoVanBan soVanBan = new SoVanBanImpl();
			req.setAttribute("soVanBan", soVanBan);
		}
		res.setRenderParameter("jspPage", "/html/sovanban/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			SoVanBan soVanBan=SoVanBanLocalServiceUtil.getSoVanBan(ParamUtil.getLong(req, "id"));
			soVanBan.setTen(ParamUtil.getString(req, "ten"));
			SoVanBanLocalServiceUtil.updateSoVanBan(soVanBan);
		}else{
			SoVanBan soVanBan= new SoVanBanImpl();
			soVanBan.setId(CounterLocalServiceUtil.increment("sovanban"));
			soVanBan.setTen(ParamUtil.getString(req, "ten"));
			SoVanBanLocalServiceUtil.addSoVanBan(soVanBan);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		SoVanBan soVanBan = SoVanBanLocalServiceUtil.getSoVanBan(ParamUtil.getLong(req, "id"));
		SoVanBanLocalServiceUtil.deleteSoVanBan(soVanBan);
		res.setRenderParameter("jspPage", "");
	}

}
