package com.test;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.phongban;
import com.test.model.impl.phongbanImpl;
import com.test.service.phongbanLocalServiceUtil;

/**
 * Portlet implementation class ChucDanhPortlet
 */
public class PhongBanPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException {
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong =  phongbanLocalServiceUtil.getphongbansCount();
		List<phongban> data = phongbanLocalServiceUtil.getphongbans(batDau,ketThuc);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/phongban/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")!=0){
			phongban phongBan = phongbanLocalServiceUtil.getphongban(ParamUtil.getLong(req, "id"));
			req.setAttribute("phongBan", phongBan);
		}else if(ParamUtil.getLong(req, "id")==0){
			phongban phongBan = new phongbanImpl();
			req.setAttribute("phongBan", phongBan);
		}
		res.setRenderParameter("jspPage", "/html/phongban/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			phongban phongBan=phongbanLocalServiceUtil.getphongban(ParamUtil.getLong(req, "id"));
			phongBan.setTen(ParamUtil.getString(req, "ten"));
			phongbanLocalServiceUtil.updatephongban(phongBan);
		}else{
			phongban phongBan= new phongbanImpl();
			phongBan.setId(CounterLocalServiceUtil.increment("phongban"));
			phongBan.setTen(ParamUtil.getString(req, "ten"));
			phongbanLocalServiceUtil.addphongban(phongBan);
			res.setRenderParameter("jspPage", "/html/phongban/input.jsp");
		}
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		phongbanLocalServiceUtil.deletephongban(ParamUtil.getLong(req, "id"));
	}
}
