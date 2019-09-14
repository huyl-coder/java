package ispace.vanban;

import ispace.model.LoaiVanBan;
import ispace.model.NguoiDung;
import ispace.model.SoVanBan;
import ispace.model.VanBanDi;
import ispace.model.impl.LoaiVanBanImpl;
import ispace.model.impl.NguoiDungImpl;
import ispace.model.impl.SoVanBanImpl;
import ispace.model.impl.VanBanDiImpl;
import ispace.service.LoaiVanBanLocalServiceUtil;
import ispace.service.NguoiDungLocalServiceUtil;
import ispace.service.SoVanBanLocalServiceUtil;
import ispace.service.VanBanDiLocalServiceUtil;

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
 * Portlet implementation class VanBanDiPortlet
 */
public class VanBanDiPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException, ParseException{
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		int tong =  VanBanDiLocalServiceUtil.getVanBanDisCount();
		String soKiHieu = ParamUtil.get(req, "soKiHieu", "");
		long soVanBan = ParamUtil.getLong(req, "soVanBan", 0);
		long loaiVanBan = ParamUtil.getLong(req, "loaiVanBan", 0);
		long nguoiKi = ParamUtil.getLong(req, "nguoiKi", 0);
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		String dateStartStr = ParamUtil.getString(req, "dateStart");
		String dateEndStr = ParamUtil.getString(req, "dateEnd");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(VanBanDiImpl.class, PortalClassLoaderUtil.getClassLoader());
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
		List<VanBanDi> data = VanBanDiLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		req.setAttribute("soVanBan", soVanBanId);
		req.setAttribute("loaiVanBan", loaiVanBanId);
		req.setAttribute("nguoiKi", nguoiKiId);
		res.setRenderParameter("jspPage", "/html/vanbandi/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SoVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<SoVanBan> soVanBan = SoVanBanLocalServiceUtil.dynamicQuery(q);
		DynamicQuery q1 = DynamicQueryFactoryUtil.forClass(LoaiVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<LoaiVanBan> loaiVanBan = LoaiVanBanLocalServiceUtil.dynamicQuery(q1);
		DynamicQuery q2 = DynamicQueryFactoryUtil.forClass(NguoiDungImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<NguoiDung> nguoiKi = NguoiDungLocalServiceUtil.dynamicQuery(q2);
		if(ParamUtil.getLong(req, "id")!=0){
			VanBanDi vanBanDi = VanBanDiLocalServiceUtil.getVanBanDi(ParamUtil.getLong(req, "id"));
			req.setAttribute("vanBanDi", vanBanDi);
			req.setAttribute("soVanBan", soVanBan);
			req.setAttribute("loaiVanBan", loaiVanBan);
			req.setAttribute("nguoiKi", nguoiKi);
		}else if(ParamUtil.getLong(req, "id")==0){
			VanBanDi vanBanDi = new VanBanDiImpl();
			Date myDate = new Date();
			vanBanDi.setDate(myDate);
			req.setAttribute("vanBanDi", vanBanDi);
			req.setAttribute("soVanBan", soVanBan);
			req.setAttribute("loaiVanBan", loaiVanBan);
			req.setAttribute("nguoiKi", nguoiKi);
		}
		res.setRenderParameter("jspPage", "/html/vanbandi/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		if(ParamUtil.getLong(req, "id")>0){
			VanBanDi vanBanDi=VanBanDiLocalServiceUtil.getVanBanDi(ParamUtil.getLong(req, "id"));
			vanBanDi.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDi.setSoVanBanId(ParamUtil.getLong(req, "soVanBanId"));
			vanBanDi.setLoaiVanBanId(ParamUtil.getLong(req, "loaiVanBanId"));
			vanBanDi.setDate(ParamUtil.getDate(req, "date", sm));
			vanBanDi.setNguoiKiId(ParamUtil.getLong(req, "nguoiKiId"));
			VanBanDiLocalServiceUtil.updateVanBanDi(vanBanDi);
		}else{
			VanBanDi vanBanDi= new VanBanDiImpl();
			vanBanDi.setId(CounterLocalServiceUtil.increment("vanbandi"));
			vanBanDi.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDi.setSoVanBanId(ParamUtil.getLong(req, "soVanBanId"));
			vanBanDi.setLoaiVanBanId(ParamUtil.getLong(req, "loaiVanBanId"));
			vanBanDi.setDate(ParamUtil.getDate(req, "date", sm));
			vanBanDi.setNguoiKiId(ParamUtil.getLong(req, "nguoiKiId"));
			VanBanDiLocalServiceUtil.addVanBanDi(vanBanDi);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		VanBanDi vanBanDi = VanBanDiLocalServiceUtil.getVanBanDi(ParamUtil.getLong(req, "id"));
		VanBanDiLocalServiceUtil.deleteVanBanDi(vanBanDi);
		res.setRenderParameter("jspPage", "");
	}

}
