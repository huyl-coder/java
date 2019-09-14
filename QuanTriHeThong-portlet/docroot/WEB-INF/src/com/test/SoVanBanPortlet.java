package com.test;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.sovanban;
import com.test.model.impl.sovanbanImpl;
import com.test.service.sovanbanLocalServiceUtil;

/**
 * Portlet implementation class ChucDanhPortlet
 */
public class SoVanBanPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException {
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = sovanbanLocalServiceUtil.getsovanbansCount();
		List<sovanban> data = sovanbanLocalServiceUtil.getsovanbans(batDau, ketThuc);
		
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
			sovanban soVanBan = sovanbanLocalServiceUtil.getsovanban(ParamUtil.getLong(req, "id"));
			req.setAttribute("soVanBan", soVanBan);
		}else if(ParamUtil.getLong(req, "id")==0){
			sovanban soVanBan = new sovanbanImpl();
			req.setAttribute("soVanBan", soVanBan);
		}
		res.setRenderParameter("jspPage", "/html/sovanban/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			sovanban soVanBan = sovanbanLocalServiceUtil.getsovanban(ParamUtil.getLong(req, "id"));
			soVanBan.setTen(ParamUtil.getString(req, "ten"));
			sovanbanLocalServiceUtil.updatesovanban(soVanBan);
		}else{
			sovanban soVanBan = new sovanbanImpl();
			soVanBan.setId(CounterLocalServiceUtil.increment("sovanban"));
			soVanBan.setTen(ParamUtil.getString(req, "ten"));
			sovanbanLocalServiceUtil.addsovanban(soVanBan);
			res.setRenderParameter("jspPage", "/html/sovanban/input.jsp");
		}
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		sovanbanLocalServiceUtil.deletesovanban(ParamUtil.getLong(req, "id"));
	}
}
