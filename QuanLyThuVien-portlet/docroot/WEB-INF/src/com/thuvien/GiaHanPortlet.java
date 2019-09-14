package com.thuvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thuvien.model.Theloai;
import com.thuvien.model.impl.PhieumuonImpl;
import com.thuvien.service.PhieumuonLocalServiceUtil;

/**
 * Portlet implementation class GiaHanPortlet
 */
public class GiaHanPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res) throws SystemException, ParseException{
		int cur = ParamUtil.getInteger(req, "cur", 1);
		int delta = ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = PhieumuonLocalServiceUtil.getPhieumuonsCount();
		long sach = ParamUtil.getLong(req, "sach" ,0);
		long soLuong = ParamUtil.getLong(req, "soLuong",0);
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		String ngayMuonToStr = ParamUtil.getString(req, "ngayMuonTo");
		String ngayMuonFormStr = ParamUtil.getString(req, "ngayMuonFrom");
		String ngayTraToStr = ParamUtil.getString(req, "ngayTraTo");
		String ngayTraFormStr = ParamUtil.getString(req, "ngayTraFrom");
		ThemeDisplay td =(ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY); 
		User userId = td.getUser();
		long duyetMuon = 1;
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(PhieumuonImpl.class, PortalClassLoaderUtil.getClassLoader()).add(PropertyFactoryUtil.forName("duyetMuon").eq(duyetMuon))
					.add(PropertyFactoryUtil.forName("nguoiDung").eq(userId.getUserId()));
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
		res.setRenderParameter("jspPage", "/html/giahan/view.jsp");
	}
	public void giaHan(ActionRequest req, ActionResponse res){
		res.setRenderParameter("jspPage", "/html/giahan/giahan.jsp");
	}

}
