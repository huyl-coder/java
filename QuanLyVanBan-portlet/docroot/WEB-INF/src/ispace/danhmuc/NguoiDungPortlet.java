package ispace.danhmuc;


import ispace.model.NguoiDung;
import ispace.model.impl.NguoiDungImpl;
import ispace.service.NguoiDungLocalServiceUtil;

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
 * Portlet implementation class NguoiDungPortlet
 */
public class NguoiDungPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException{
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong =  NguoiDungLocalServiceUtil.getNguoiDungsCount();
		String ten = ParamUtil.get(req, "ten", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(NguoiDungImpl.class, PortalClassLoaderUtil.getClassLoader());
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("ten").like("%"+ten+"%"));
		}
		q.setLimit(batDau, ketThuc);
		List<NguoiDung> data = NguoiDungLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/nguoidung/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")!=0){
			NguoiDung nguoiDung = NguoiDungLocalServiceUtil.getNguoiDung(ParamUtil.getLong(req, "id"));
			req.setAttribute("nguoiDung", nguoiDung);
		}else if(ParamUtil.getLong(req, "id")==0){
			NguoiDung nguoiDung = new NguoiDungImpl();
			req.setAttribute("nguoiDung", nguoiDung);
		}
		res.setRenderParameter("jspPage", "/html/nguoidung/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			NguoiDung nguoiDung=NguoiDungLocalServiceUtil.getNguoiDung(ParamUtil.getLong(req, "id"));
			nguoiDung.setTen(ParamUtil.getString(req, "ten"));
			NguoiDungLocalServiceUtil.updateNguoiDung(nguoiDung);
		}else{
			NguoiDung nguoiDung= new NguoiDungImpl();
			nguoiDung.setId(CounterLocalServiceUtil.increment("nguoidung"));
			nguoiDung.setTen(ParamUtil.getString(req, "ten"));
			NguoiDungLocalServiceUtil.addNguoiDung(nguoiDung);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		NguoiDung nguoiDung = NguoiDungLocalServiceUtil.getNguoiDung(ParamUtil.getLong(req, "id"));
		NguoiDungLocalServiceUtil.deleteNguoiDung(nguoiDung);
		res.setRenderParameter("jspPage", "");
	}

}
