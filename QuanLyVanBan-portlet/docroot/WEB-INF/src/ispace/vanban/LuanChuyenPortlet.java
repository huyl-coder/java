package ispace.vanban;



import ispace.model.LuanChuyen;
import ispace.model.NguoiDung;
import ispace.model.impl.LuanChuyenImpl;
import ispace.model.impl.NguoiDungImpl;
import ispace.service.LuanChuyenLocalServiceUtil;
import ispace.service.NguoiDungLocalServiceUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class LuanChuyenPortlet
 */
public class LuanChuyenPortlet extends MVCPortlet {
 
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException{
		int cur=ParamUtil.getInteger(req, "cur",1);
		int delta=ParamUtil.getInteger(req, "delta",5);
		int batDau = (cur-1)*delta;
		int ketThuc = batDau+delta;
		long vanBanId = ParamUtil.getLong(req, "id");
		long kieuVanBan = ParamUtil.getLong(req, "kieuVanBan");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(LuanChuyenImpl.class, PortalClassLoaderUtil.getClassLoader())
			.add(PropertyFactoryUtil.forName("vanBanId").eq(vanBanId))
			.add(PropertyFactoryUtil.forName("kieuVanBan").eq(kieuVanBan));
		int tong = LuanChuyenLocalServiceUtil.getLuanChuyensCount();
		q.setLimit(batDau, ketThuc);
		List<LuanChuyen> data = LuanChuyenLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("sumRecord", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", batDau);
		req.setAttribute("end", ketThuc);
		req.setAttribute("vanBanId", vanBanId);
		req.setAttribute("kieuVanBan", kieuVanBan);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/luanchuyen/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		int vanBanId = ParamUtil.getInteger(req, "vanBanId");
		int kieuVanBanId = ParamUtil.getInteger(req, "kieuVanBan");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(NguoiDungImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<NguoiDung> nguoiKi = NguoiDungLocalServiceUtil.dynamicQuery(q);
		if(ParamUtil.getLong(req, "id")!=0){
			LuanChuyen luanChuyen = LuanChuyenLocalServiceUtil.getLuanChuyen(ParamUtil.getLong(req, "id"));
			req.setAttribute("luanChuyen", luanChuyen);
			req.setAttribute("nguoiKi", nguoiKi);
		}else if(ParamUtil.getLong(req, "id")==0){
			LuanChuyen luanChuyen = new LuanChuyenImpl();
			Date myDate = new Date();
			luanChuyen.setHanXuLy(myDate);
			luanChuyen.setNgayGui(myDate);
			luanChuyen.setNgayNhan(myDate);
			luanChuyen.setNgayPhanHoi(myDate);
			req.setAttribute("luanChuyen", luanChuyen);
			req.setAttribute("nguoiKi", nguoiKi);
		}
		req.setAttribute("vanBanId", vanBanId);
		req.setAttribute("kieuVanBanId", kieuVanBanId);
		res.setRenderParameter("jspPage", "/html/luanchuyen/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException, Exception{
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		if(ParamUtil.getLong(req, "nguoiGui")!=ParamUtil.getLong(req, "nguoiNhan")){
			if(ParamUtil.getLong(req, "id")>0){
				LuanChuyen luanChuyen=LuanChuyenLocalServiceUtil.getLuanChuyen(ParamUtil.getLong(req, "id"));
				luanChuyen.setVanBanId(ParamUtil.getLong(req, "vanBanId"));
				luanChuyen.setKieuVanBan(ParamUtil.getLong(req, "kieuVanBan"));
				luanChuyen.setNguoiGui(ParamUtil.getLong(req, "nguoiGui"));
				luanChuyen.setNguoiNhan(ParamUtil.getLong(req, "nguoiNhan"));
				luanChuyen.setNgayGui(ParamUtil.getDate(req, "ngayGui", sm));
				luanChuyen.setNgayNhan(ParamUtil.getDate(req, "ngayNhan", sm));
				luanChuyen.setYKien(ParamUtil.getString(req, "yKien"));
				luanChuyen.setHanXuLy(ParamUtil.getDate(req, "hanXuLy", sm));
				luanChuyen.setYKienPhanHoi(ParamUtil.getString(req, "yKienPhanHoi"));
				luanChuyen.setNgayPhanHoi(ParamUtil.getDate(req, "ngayPhanHoi", sm));
				LuanChuyenLocalServiceUtil.updateLuanChuyen(luanChuyen);
			}else{
				LuanChuyen luanChuyen= new LuanChuyenImpl();
				luanChuyen.setId(CounterLocalServiceUtil.increment("luanchuyen"));
				luanChuyen.setVanBanId(ParamUtil.getLong(req, "vanBanId"));
				luanChuyen.setKieuVanBan(ParamUtil.getLong(req, "kieuVanBan"));
				luanChuyen.setNguoiGui(ParamUtil.getLong(req, "nguoiGui"));
				luanChuyen.setNguoiNhan(ParamUtil.getLong(req, "nguoiNhan"));
				luanChuyen.setNgayGui(ParamUtil.getDate(req, "ngayGui", sm));
				luanChuyen.setNgayNhan(ParamUtil.getDate(req, "ngayNhan", sm));
				luanChuyen.setYKien(ParamUtil.getString(req, "yKien"));
				luanChuyen.setHanXuLy(ParamUtil.getDate(req, "hanXuLy", sm));
				luanChuyen.setYKienPhanHoi(ParamUtil.getString(req, "yKienPhanHoi"));
				luanChuyen.setNgayPhanHoi(ParamUtil.getDate(req, "ngayPhanHoi", sm));
				LuanChuyenLocalServiceUtil.addLuanChuyen(luanChuyen);
			}
			res.setRenderParameter("jspPage", "");
		}else{
			res.setRenderParameter("jspPage", "/html/luanchuyen/error.jsp");
		}
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException {
		LuanChuyen luanChuyen = LuanChuyenLocalServiceUtil.getLuanChuyen(ParamUtil.getLong(req, "id"));
		LuanChuyenLocalServiceUtil.deleteLuanChuyen(luanChuyen);
		res.setRenderParameter("jspPage", "");
	}

}
