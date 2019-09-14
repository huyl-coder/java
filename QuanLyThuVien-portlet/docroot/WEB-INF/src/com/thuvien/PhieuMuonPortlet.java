package com.thuvien;

import java.io.IOException;
import java.text.ParseException;
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
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thuvien.model.Phieumuon;
import com.thuvien.model.Sach;
import com.thuvien.model.Theloai;
import com.thuvien.model.impl.PhieumuonImpl;
import com.thuvien.model.impl.TheloaiImpl;
import com.thuvien.service.PhieumuonLocalServiceUtil;
import com.thuvien.service.SachLocalServiceUtil;
import com.thuvien.service.TheloaiLocalServiceUtil;

/**
 * Portlet implementation class PhieuMuonPortlet
 */
public class PhieuMuonPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res) throws SystemException, ParseException{
		int cur = ParamUtil.getInteger(req, "cur", 1);
		int delta = ParamUtil.getInteger(req, "delta",10);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = PhieumuonLocalServiceUtil.getPhieumuonsCount();
		long xacNhan = ParamUtil.getLong(req, "xacNhan",-1); 
		long sach = ParamUtil.getLong(req, "sach" ,0);
		long soLuong = ParamUtil.getLong(req, "soLuong",0);
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		String ngayMuonToStr = ParamUtil.getString(req, "ngayMuonTo");
		String ngayMuonFormStr = ParamUtil.getString(req, "ngayMuonFrom");
		String ngayTraToStr = ParamUtil.getString(req, "ngayTraTo");
		String ngayTraFormStr = ParamUtil.getString(req, "ngayTraFrom");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(PhieumuonImpl.class, PortalClassLoaderUtil.getClassLoader());
		if(xacNhan>=0){
			q.add(PropertyFactoryUtil.forName("xacNhan").eq(xacNhan));
		}
		if(sach!=0){
			q.add(PropertyFactoryUtil.forName("sach").eq(sach));
		}
		if(soLuong!=0){
			q.add(PropertyFactoryUtil.forName("soLuong").eq(soLuong));
		}
		if(!ngayMuonToStr.equals("")&&!ngayMuonFormStr.equals("")){
			Date ngayMuonTo = sm.parse(ngayMuonToStr);
			Date ngayMuonForm = sm.parse(ngayMuonFormStr);
			q.add(PropertyFactoryUtil.forName("ngayMuon").ge(ngayMuonTo));
			q.add(PropertyFactoryUtil.forName("ngayMuon").le(ngayMuonForm));
		}
		if(!ngayTraToStr.equals("")&&!ngayTraFormStr.equals("")){
			Date ngayTraTo = sm.parse(ngayTraToStr);
			Date ngayTraForm = sm.parse(ngayTraFormStr);
			q.add(PropertyFactoryUtil.forName("ngayTra").ge(ngayTraTo));
			q.add(PropertyFactoryUtil.forName("ngayTra").le(ngayTraForm));
		}
		q.setLimit(batDau, ketThuc);
		List<Theloai> data = PhieumuonLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/phieumuon/view.jsp");
	}
	public void duyetMuon(ActionRequest req, ActionResponse res) throws PortalException, SystemException, IOException{
		Phieumuon phieuMuon = PhieumuonLocalServiceUtil.getPhieumuon(ParamUtil.getLong(req, "id"));
		phieuMuon.setXacNhan(1);
		if(ParamUtil.getLong(req, "yes")==0){
			phieuMuon.setDuyetMuon(0);
			Sach sach = SachLocalServiceUtil.getSach(phieuMuon.getSach());
			sach.setSoLuongConlai(sach.getSoLuongConlai()+phieuMuon.getSoLuong());
			SachLocalServiceUtil.updateSach(sach);
		}else{
			phieuMuon.setDuyetMuon(1);
		}
		PhieumuonLocalServiceUtil.updatePhieumuon(phieuMuon);
		res.sendRedirect("http://localhost:8080/web/guest/phieu-muon?p_p_id=phieumuon_WAR_QuanLyThuVienportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_phieumuon_WAR_QuanLyThuVienportlet_javax.portlet.action=danhSach");
	}
	public void detail(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		Phieumuon phieuMuon = PhieumuonLocalServiceUtil.getPhieumuon(ParamUtil.getLong(req, "id"));
		req.setAttribute("phieuMuon", phieuMuon);
		res.setRenderParameter("jspPage", "/html/phieumuon/chitiet.jsp");
	}

}
