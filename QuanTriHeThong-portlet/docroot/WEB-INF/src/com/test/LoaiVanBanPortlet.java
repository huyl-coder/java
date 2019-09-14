package com.test;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.loaivanban;
import com.test.model.impl.loaivanbanImpl;
import com.test.service.loaivanbanLocalServiceUtil;

/**
 * Portlet implementation class ChucDanhPortlet
 */
public class LoaiVanBanPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException {
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = loaivanbanLocalServiceUtil.getloaivanbansCount();
		List<loaivanban> data = loaivanbanLocalServiceUtil.getloaivanbans(batDau, ketThuc);
		
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
			loaivanban loaiVanBan = loaivanbanLocalServiceUtil.getloaivanban(ParamUtil.getLong(req, "id"));
			req.setAttribute("loaiVanBan", loaiVanBan);
		}else if(ParamUtil.getLong(req, "id")==0){
			loaivanban loaiVanBan = new loaivanbanImpl();
			req.setAttribute("loaiVanBan", loaiVanBan);
		}
		res.setRenderParameter("jspPage", "/html/loaivanban/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			loaivanban loaiVanBan = loaivanbanLocalServiceUtil.getloaivanban(ParamUtil.getLong(req, "id"));
			loaiVanBan.setTen(ParamUtil.getString(req, "ten"));
			loaivanbanLocalServiceUtil.updateloaivanban(loaiVanBan);
		}else{
			loaivanban loaiVanBan = new loaivanbanImpl();
			loaiVanBan.setId(CounterLocalServiceUtil.increment("loaivanban"));
			loaiVanBan.setTen(ParamUtil.getString(req, "ten"));
			loaivanbanLocalServiceUtil.addloaivanban(loaiVanBan);
			res.setRenderParameter("jspPage", "/html/loaivanban/input.jsp");
		}
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		loaivanbanLocalServiceUtil.deleteloaivanban(ParamUtil.getLong(req, "id"));
	}
}
