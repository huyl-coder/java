package com.test;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.nhanvien;
import com.test.model.impl.nhanvienImpl;
import com.test.service.nhanvienLocalServiceUtil;

/**
 * Portlet implementation class ChucDanhPortlet
 */
public class NhanVienPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException {
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = nhanvienLocalServiceUtil.getnhanviensCount();
		List<nhanvien> data = nhanvienLocalServiceUtil.getnhanviens(batDau,ketThuc);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/nhanvien/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")!=0){
			nhanvien nhanVien = nhanvienLocalServiceUtil.getnhanvien(ParamUtil.getLong(req, "id"));
			req.setAttribute("nhanVien", nhanVien);
		}else if(ParamUtil.getLong(req, "id")==0){
			nhanvien nhanVien = new nhanvienImpl();
			req.setAttribute("nhanVien", nhanVien);
		}
		res.setRenderParameter("jspPage", "/html/nhanvien/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			nhanvien nhanVien=nhanvienLocalServiceUtil.getnhanvien(ParamUtil.getLong(req, "id"));
			nhanVien.setTen(ParamUtil.getString(req, "ten"));
			nhanvienLocalServiceUtil.updatenhanvien(nhanVien);
		}else{
			nhanvien nhanVien = new nhanvienImpl();
			nhanVien.setId(CounterLocalServiceUtil.increment("nhanvien"));
			nhanVien.setTen(ParamUtil.getString(req, "ten"));
			nhanvienLocalServiceUtil.addnhanvien(nhanVien);
			res.setRenderParameter("jspPage", "/html/nhanvien/input.jsp");
		}
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		nhanvienLocalServiceUtil.deletenhanvien(ParamUtil.getLong(req, "id"));
	}
}
