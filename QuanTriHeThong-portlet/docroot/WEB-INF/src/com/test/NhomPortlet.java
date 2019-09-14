package com.test;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.nhom;
import com.test.model.impl.nhomImpl;
import com.test.service.nhomLocalServiceUtil;

/**
 * Portlet implementation class ChucDanhPortlet
 */
public class NhomPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException {
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong = nhomLocalServiceUtil.getnhomsCount();
		List<nhom> data = nhomLocalServiceUtil.getnhoms(batDau, ketThuc);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/nhom/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")!=0){
			nhom Nhom = nhomLocalServiceUtil.getnhom(ParamUtil.getLong(req, "id"));
			req.setAttribute("Nhom", Nhom);
		}else if(ParamUtil.getLong(req, "id")==0){
			nhom Nhom = new nhomImpl();
			req.setAttribute("Nhom", Nhom);
		}
		res.setRenderParameter("jspPage", "/html/nhom/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			nhom Nhom = nhomLocalServiceUtil.getnhom(ParamUtil.getLong(req, "id"));
			Nhom.setTen(ParamUtil.getString(req, "ten"));
			nhomLocalServiceUtil.updatenhom(Nhom);
		}else{
			nhom Nhom = new nhomImpl();
			Nhom.setId(CounterLocalServiceUtil.increment("nhom"));
			Nhom.setTen(ParamUtil.getString(req, "ten"));
			nhomLocalServiceUtil.addnhom(Nhom);
			res.setRenderParameter("jspPage", "/html/nhom/input.jsp");
		}
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		nhomLocalServiceUtil.deletenhom(ParamUtil.getLong(req, "id"));
	}
}
