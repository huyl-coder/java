package com.danhmuc;

import java.io.IOException;
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
import com.thuvien.model.Theloai;
import com.thuvien.model.impl.TheloaiImpl;
import com.thuvien.service.TheloaiLocalServiceUtil;

/**
 * Portlet implementation class TheLoaiPortlet
 */
public class TheLoaiPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res) throws SystemException{
		int cur = ParamUtil.getInteger(req, "cur", 1);
		int delta = ParamUtil.getInteger(req, "delta", 5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = TheloaiLocalServiceUtil.getTheloaisCount();
		String ten = ParamUtil.getString(req, "ten", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(TheloaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("ten").like("%"+ten+"%"));
		}
		q.setLimit(batDau, ketThuc);
		List<Theloai> data = TheloaiLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/theloai/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			Theloai theloai = TheloaiLocalServiceUtil.getTheloai(id);
			req.setAttribute("theloai", theloai);
		}else{
			Theloai theloai = new TheloaiImpl();
			req.setAttribute("theloai", theloai);
		}
		res.setRenderParameter("jspPage", "/html/theloai/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res) throws PortalException, SystemException, IOException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			Theloai theloai = TheloaiLocalServiceUtil.getTheloai(id);
			theloai.setTen(ParamUtil.getString(req, "ten"));
			TheloaiLocalServiceUtil.updateTheloai(theloai);
		}else{
			Theloai theloai = new TheloaiImpl();
			theloai.setId(CounterLocalServiceUtil.increment("theloai"));
			theloai.setTen(ParamUtil.getString(req, "ten"));
			TheloaiLocalServiceUtil.addTheloai(theloai);
		}
		res.sendRedirect("http://localhost:8080/web/guest/the-loai?p_p_id=theloai_WAR_QuanLyThuVienportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_theloai_WAR_QuanLyThuVienportlet_javax.portlet.action=danhSach");
	}
	public void delete(ActionRequest req, ActionResponse res) throws PortalException, SystemException, IOException{
		Theloai theloai = TheloaiLocalServiceUtil.getTheloai(ParamUtil.getLong(req, "id"));
		TheloaiLocalServiceUtil.deleteTheloai(theloai);
		res.sendRedirect("http://localhost:8080/web/guest/the-loai?p_p_id=theloai_WAR_QuanLyThuVienportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_theloai_WAR_QuanLyThuVienportlet_javax.portlet.action=danhSach");
	}

}
