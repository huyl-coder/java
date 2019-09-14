package ispace.danhmuc;

import ispace.model.LoaiVanBan;
import ispace.model.impl.LoaiVanBanImpl;
import ispace.service.LoaiVanBanLocalServiceUtil;

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
 * Portlet implementation class LoaiVanBanPortlet
 */
public class LoaiVanBanPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException{
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong =  LoaiVanBanLocalServiceUtil.getLoaiVanBansCount();
		String ten = ParamUtil.get(req, "ten", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(LoaiVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("ten").like("%"+ten+"%"));
		}
		q.setLimit(batDau, ketThuc);
		List<LoaiVanBan> data = LoaiVanBanLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/loaivanban/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")!=0){
			LoaiVanBan loaiVanBan = LoaiVanBanLocalServiceUtil.getLoaiVanBan(ParamUtil.getLong(req, "id"));
			req.setAttribute("loaiVanBan", loaiVanBan);
		}else if(ParamUtil.getLong(req, "id")==0){
			LoaiVanBan loaiVanBan = new LoaiVanBanImpl();
			req.setAttribute("loaiVanBan", loaiVanBan);
		}
		res.setRenderParameter("jspPage", "/html/loaivanban/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			LoaiVanBan loaiVanBan=LoaiVanBanLocalServiceUtil.getLoaiVanBan(ParamUtil.getLong(req, "id"));
			loaiVanBan.setTen(ParamUtil.getString(req, "ten"));
			LoaiVanBanLocalServiceUtil.updateLoaiVanBan(loaiVanBan);
		}else{
			LoaiVanBan loaiVanBan= new LoaiVanBanImpl();
			loaiVanBan.setId(CounterLocalServiceUtil.increment("loaivanban"));
			loaiVanBan.setTen(ParamUtil.getString(req, "ten"));
			LoaiVanBanLocalServiceUtil.addLoaiVanBan(loaiVanBan);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		LoaiVanBan loaiVanBan = LoaiVanBanLocalServiceUtil.getLoaiVanBan(ParamUtil.getLong(req, "id"));
		LoaiVanBanLocalServiceUtil.deleteLoaiVanBan(loaiVanBan);
		res.setRenderParameter("jspPage", "");
	}
}
