package ispace.vanban;


import ispace.model.LoaiVanBan;
import ispace.model.NguoiDung;
import ispace.model.SoVanBan;
import ispace.model.VanBanDen;
import ispace.model.impl.LoaiVanBanImpl;
import ispace.model.impl.NguoiDungImpl;
import ispace.model.impl.SoVanBanImpl;
import ispace.model.impl.VanBanDenImpl;
import ispace.service.LoaiVanBanLocalServiceUtil;
import ispace.service.NguoiDungLocalServiceUtil;
import ispace.service.SoVanBanLocalServiceUtil;
import ispace.service.VanBanDenLocalServiceUtil;

import java.text.DateFormat;
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

/**
 * Portlet implementation class VanBanDenPortlet
 */
public class VanBanDenPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException, ParseException{
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong =  VanBanDenLocalServiceUtil.getVanBanDensCount();
		String soKiHieu = ParamUtil.get(req, "soKiHieu", "");
		long soVanBan = ParamUtil.getLong(req, "soVanBan", 0);
		long loaiVanBan = ParamUtil.getLong(req, "loaiVanBan", 0);
		long nguoiKi = ParamUtil.getLong(req, "nguoiKi", 0);
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		String dateStartStr = ParamUtil.getString(req, "dateStart");
		String dateEndStr = ParamUtil.getString(req, "dateEnd");
		
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(VanBanDenImpl.class, PortalClassLoaderUtil.getClassLoader());
		if(!soKiHieu.equals("")){
			q.add(PropertyFactoryUtil.forName("soKiHieu").like("%"+soKiHieu+"%"));
		}
		if(soVanBan!=0){
			q.add(PropertyFactoryUtil.forName("soVanBanId").eq(soVanBan));
		}
		if(loaiVanBan!=0){
			q.add(PropertyFactoryUtil.forName("loaiVanBanId").eq(loaiVanBan));
		}
		if(nguoiKi!=0){
			q.add(PropertyFactoryUtil.forName("nguoiKiId").eq(nguoiKi));
		}
		if(!dateStartStr.equals("")&&!dateEndStr.equals("")){
			Date dateStart = sm.parse(dateStartStr);
			Date dateEnd = sm.parse(dateEndStr);
			q.add(PropertyFactoryUtil.forName("date").ge(dateStart));
			q.add(PropertyFactoryUtil.forName("date").le(dateEnd));
		}
		DynamicQuery q1 = DynamicQueryFactoryUtil.forClass(SoVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<SoVanBan> soVanBanId = SoVanBanLocalServiceUtil.dynamicQuery(q1);
		DynamicQuery q2 = DynamicQueryFactoryUtil.forClass(LoaiVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<LoaiVanBan> loaiVanBanId = LoaiVanBanLocalServiceUtil.dynamicQuery(q2);
		DynamicQuery q3 = DynamicQueryFactoryUtil.forClass(NguoiDungImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<NguoiDung> nguoiKiId = NguoiDungLocalServiceUtil.dynamicQuery(q3);
		q.setLimit(batDau, ketThuc);
		List<VanBanDen> data = VanBanDenLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		req.setAttribute("soVanBan", soVanBanId);
		req.setAttribute("loaiVanBan", loaiVanBanId);
		req.setAttribute("nguoiKi", nguoiKiId);
		res.setRenderParameter("jspPage", "/html/vanbanden/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SoVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<SoVanBan> soVanBan = SoVanBanLocalServiceUtil.dynamicQuery(q);
		DynamicQuery q1 = DynamicQueryFactoryUtil.forClass(LoaiVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<LoaiVanBan> loaiVanBan = LoaiVanBanLocalServiceUtil.dynamicQuery(q1);
		DynamicQuery q2 = DynamicQueryFactoryUtil.forClass(NguoiDungImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<NguoiDung> nguoiKi = NguoiDungLocalServiceUtil.dynamicQuery(q2);
		if(ParamUtil.getLong(req, "id")!=0){
			VanBanDen vanBanDen = VanBanDenLocalServiceUtil.getVanBanDen(ParamUtil.getLong(req, "id"));
			req.setAttribute("vanBanDen", vanBanDen);
			req.setAttribute("soVanBan", soVanBan);
			req.setAttribute("loaiVanBan", loaiVanBan);
			req.setAttribute("nguoiKi", nguoiKi);
		}else if(ParamUtil.getLong(req, "id")==0){
			VanBanDen vanBanDen = new VanBanDenImpl();
			Date myDate = new Date();
			vanBanDen.setDate(myDate);
			req.setAttribute("vanBanDen", vanBanDen);
			req.setAttribute("soVanBan", soVanBan);
			req.setAttribute("loaiVanBan", loaiVanBan);
			req.setAttribute("nguoiKi", nguoiKi);
		}
		res.setRenderParameter("jspPage", "/html/vanbanden/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		if(ParamUtil.getLong(req, "id")>0){
			VanBanDen vanBanDen=VanBanDenLocalServiceUtil.getVanBanDen(ParamUtil.getLong(req, "id"));
			vanBanDen.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDen.setSoVanBanId(ParamUtil.getLong(req, "soVanBanId"));
			vanBanDen.setLoaiVanBanId(ParamUtil.getLong(req, "loaiVanBanId"));
			vanBanDen.setDate(ParamUtil.getDate(req, "date", sm));
			vanBanDen.setNguoiKiId(ParamUtil.getLong(req, "nguoiKiId"));
			VanBanDenLocalServiceUtil.updateVanBanDen(vanBanDen);
		}else{
			VanBanDen vanBanDen= new VanBanDenImpl();
			vanBanDen.setId(CounterLocalServiceUtil.increment("vanbanden"));
			vanBanDen.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDen.setSoVanBanId(ParamUtil.getLong(req, "soVanBanId"));
			vanBanDen.setLoaiVanBanId(ParamUtil.getLong(req, "loaiVanBanId"));
			vanBanDen.setDate(ParamUtil.getDate(req, "date", sm));
			vanBanDen.setNguoiKiId(ParamUtil.getLong(req, "nguoiKiId"));
			VanBanDenLocalServiceUtil.addVanBanDen(vanBanDen);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		VanBanDen vanBanDen = VanBanDenLocalServiceUtil.getVanBanDen(ParamUtil.getLong(req, "id"));
		VanBanDenLocalServiceUtil.deleteVanBanDen(vanBanDen);
		res.setRenderParameter("jspPage", "");
	}
}
