package com.thuvien;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thuvien.model.Phieumuon;
import com.thuvien.model.Sach;
import com.thuvien.model.Theloai;
import com.thuvien.model.impl.PhieumuonImpl;
import com.thuvien.model.impl.SachImpl;
import com.thuvien.model.impl.TheloaiImpl;
import com.thuvien.service.PhieumuonLocalServiceUtil;
import com.thuvien.service.SachLocalServiceUtil;
import com.thuvien.service.TheloaiLocalServiceUtil;

/**
 * Portlet implementation class TimKiemSachPortlet
 */
public class TimKiemSachPortlet extends MVCPortlet {
 
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
		res.setRenderParameter("jspPage", "/html/timkiemsach/view.jsp");
	}
	public void detail(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		Sach sach = SachLocalServiceUtil.getSach(ParamUtil.getLong(req, "id"));
		req.setAttribute("sach", sach);
		res.setRenderParameter("jspPage", "/html/timkiemsach/chitiet.jsp");
	}
	public void phieuMuon(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		Sach sach = SachLocalServiceUtil.getSach(ParamUtil.getLong(req, "id"));
		req.setAttribute("sach", sach);
		res.setRenderParameter("jspPage", "/html/timkiemsach/phieumuon.jsp");
	}
	public void dangKiPhieuMuon(ActionRequest req, ActionResponse res) throws SystemException, PortalException, IOException{
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		Phieumuon phieuMuon = new PhieumuonImpl();
		phieuMuon.setId(CounterLocalServiceUtil.increment("phieumuon"));
		phieuMuon.setNguoiDung(ParamUtil.getLong(req, "nguoiDung"));
		phieuMuon.setNgayMuon(ParamUtil.getDate(req, "ngayMuon", sm));
		phieuMuon.setNgayTra(ParamUtil.getDate(req, "ngayTra", sm));
		phieuMuon.setSach(ParamUtil.getLong(req, "id"));
		phieuMuon.setXacNhan(0);
		phieuMuon.setTrangThai(0);
		phieuMuon.setSoLuong(ParamUtil.getLong(req, "soLuong"));
		PhieumuonLocalServiceUtil.addPhieumuon(phieuMuon);
		Sach sach = SachLocalServiceUtil.getSach(ParamUtil.getLong(req, "id"));
		long soLuong = sach.getSoLuongConlai();
		sach.setSoLuongConlai(soLuong-ParamUtil.getLong(req, "soLuong"));
		SachLocalServiceUtil.updateSach(sach);
		res.sendRedirect("http://localhost:8080/web/guest/tim-kiem-sach?p_p_id=timkiemsach_WAR_QuanLyThuVienportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_timkiemsach_WAR_QuanLyThuVienportlet_javax.portlet.action=danhSach");
	}

}
