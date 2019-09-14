package com.test;

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
import com.test.model.chucdanh;
import com.test.model.impl.chucdanhImpl;
import com.test.service.chucdanhLocalServiceUtil;

/**
 * Portlet implementation class ChucDanhPortlet
 */
public class ChucDanhPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException {
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong =  chucdanhLocalServiceUtil.getchucdanhsCount();
		String ten = ParamUtil.get(req, "ten", "");
		String ma = ParamUtil.get(req, "ma", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(chucdanhImpl.class, PortalClassLoaderUtil.getClassLoader());
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("ten").like("%"+ten+"%"));
		}
		if(!ma.equals("")){
			q.add(PropertyFactoryUtil.forName("ma").like("%"+ma+"%"));
		}
		List<chucdanh> data = chucdanhLocalServiceUtil.dynamicQuery(q);
		//List<chucdanh> data = chucdanhLocalServiceUtil.getchucdanhs(batDau,ketThuc);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/chucdanh/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")!=0){
			chucdanh chucDanh = chucdanhLocalServiceUtil.getchucdanh(ParamUtil.getLong(req, "id"));
			req.setAttribute("chucDanh", chucDanh);
		}else if(ParamUtil.getLong(req, "id")==0){
			chucdanh chucDanh = new chucdanhImpl();
			req.setAttribute("chucDanh", chucDanh);
		}
		res.setRenderParameter("jspPage", "/html/chucdanh/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		if(ParamUtil.getLong(req, "id")>0){
			chucdanh chucDanh=chucdanhLocalServiceUtil.getchucdanh(ParamUtil.getLong(req, "id"));
			chucDanh.setTen(ParamUtil.getString(req, "ten"));
			chucDanh.setMa(ParamUtil.getString(req, "ma"));
			chucdanhLocalServiceUtil.updatechucdanh(chucDanh);
		}else{
			chucdanh chucDanh= new chucdanhImpl();
			chucDanh.setId(CounterLocalServiceUtil.increment("chucdanh"));
			chucDanh.setTen(ParamUtil.getString(req, "ten"));
			chucDanh.setMa(ParamUtil.getString(req, "ma"));
			chucdanhLocalServiceUtil.addchucdanh(chucDanh);
			res.setRenderParameter("jspPage", "");
		}
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		chucdanhLocalServiceUtil.deletechucdanh(ParamUtil.getLong(req, "id"));
	}
}
