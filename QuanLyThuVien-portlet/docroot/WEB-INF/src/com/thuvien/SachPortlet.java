package com.thuvien;

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
import com.thuvien.model.Sach;
import com.thuvien.model.Theloai;
import com.thuvien.model.impl.SachImpl;
import com.thuvien.model.impl.TheloaiImpl;
import com.thuvien.service.SachLocalServiceUtil;
import com.thuvien.service.TheloaiLocalServiceUtil;

/**
 * Portlet implementation class SachPortlet
 */
public class SachPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res) throws SystemException{
		int cur = ParamUtil.getInteger(req, "cur", 1);
		int delta = ParamUtil.getInteger(req, "delta", 5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = SachLocalServiceUtil.getSachsCount();
		String ten = ParamUtil.getString(req, "ten","");
		String ma = ParamUtil.getString(req, "ma","");
		long theloai = ParamUtil.getLong(req, "theloai", 0);
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SachImpl.class, PortalClassLoaderUtil.getClassLoader());
		DynamicQuery q1 = DynamicQueryFactoryUtil.forClass(TheloaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Theloai> theLoai = TheloaiLocalServiceUtil.dynamicQuery(q1);
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("ten").like("%"+ten+"%"));
		}
		if(!ma.equals("")){
			q.add(PropertyFactoryUtil.forName("maSach").eq(ma));
		}
		if(theloai!=0){
			q.add(PropertyFactoryUtil.forName("theLoai").eq(theloai));
		}
		q.setLimit(batDau, ketThuc);
		List<Sach> data = SachLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		req.setAttribute("theLoai", theLoai);
		res.setRenderParameter("jspPage", "/html/sach/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(TheloaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Theloai> theLoai = TheloaiLocalServiceUtil.dynamicQuery(q);
		req.setAttribute("theLoai", theLoai);
		if(id!=0){
			Sach sach = SachLocalServiceUtil.getSach(id);
			req.setAttribute("sach", sach);
		}else{
			Sach sach = new SachImpl();
			req.setAttribute("sach", sach);
		}
		res.setRenderParameter("jspPage", "/html/sach/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res) throws PortalException, SystemException, IOException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			Sach sach = SachLocalServiceUtil.getSach(id);
			sach.setTen(ParamUtil.getString(req, "ten"));
			sach.setMaSach(ParamUtil.getString(req, "maSach"));
			sach.setKe(ParamUtil.getString(req, "ke"));
			sach.setTang(ParamUtil.getString(req, "tang"));
			sach.setTacGia(ParamUtil.getString(req, "tacGia"));
			sach.setNhaXuatBan(ParamUtil.getString(req, "nhaXuatBan"));
			sach.setSoLuong(ParamUtil.getLong(req, "soLuong"));
			sach.setSoLuongConlai(ParamUtil.getLong(req, "soLuong"));
			sach.setTheLoai(ParamUtil.getLong(req, "theloai"));
			SachLocalServiceUtil.updateSach(sach);
		}else{
			Sach sach = new SachImpl();
			sach.setId(CounterLocalServiceUtil.increment("sach"));
			sach.setTen(ParamUtil.getString(req, "ten"));
			sach.setMaSach(ParamUtil.getString(req, "maSach"));
			sach.setKe(ParamUtil.getString(req, "ke"));
			sach.setTang(ParamUtil.getString(req, "tang"));
			sach.setTacGia(ParamUtil.getString(req, "tacGia"));
			sach.setNhaXuatBan(ParamUtil.getString(req, "nhaXuatBan"));
			sach.setSoLuong(ParamUtil.getLong(req, "soLuong"));
			sach.setSoLuongConlai(ParamUtil.getLong(req, "soLuong"));
			sach.setTheLoai(ParamUtil.getLong(req, "theloai"));
			SachLocalServiceUtil.addSach(sach);
		}
		res.sendRedirect("http://localhost:8080/web/guest/sach?p_p_id=sach_WAR_QuanLyThuVienportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_sach_WAR_QuanLyThuVienportlet_javax.portlet.action=danhSach");
	}
	public void delete(ActionRequest req, ActionResponse res) throws PortalException, SystemException, IOException{
		Sach sach = SachLocalServiceUtil.getSach(ParamUtil.getLong(req, "id"));
		SachLocalServiceUtil.deleteSach(sach);
		res.sendRedirect("http://localhost:8080/web/guest/sach?p_p_id=sach_WAR_QuanLyThuVienportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_sach_WAR_QuanLyThuVienportlet_javax.portlet.action=danhSach");
	}
	public void detail(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		Sach sach  = SachLocalServiceUtil.getSach(ParamUtil.getLong(req, "id"));
		req.setAttribute("sach", sach);
		res.setRenderParameter("jspPage", "/html/sach/chitietsach.jsp");
	}

}
