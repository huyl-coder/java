<%@page import="ispace.service.VanBanDenLocalServiceUtil"%>
<%@page import="ispace.service.KieuVanBanLocalServiceUtil"%>
<%@page import="ispace.service.VanBanDiLocalServiceUtil"%>
<%@page import="ispace.model.LuanChuyen"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ispace.model.VanBanDi"%>
<%@page import="ispace.service.NguoiDungLocalServiceUtil"%>
<%@page import="ispace.service.LoaiVanBanLocalServiceUtil"%>
<%@page import="ispace.service.SoVanBanLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.util.List"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
<%
List<LuanChuyen> data = (List<LuanChuyen>)request.getAttribute("data");
PortletURL interatorURL = renderResponse.createActionURL();
interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
int delta = GetterUtil.getInteger(request.getAttribute("delta"));
int sumRecord = GetterUtil.getInteger(request.getAttribute("sumRecord"));
int vanBanId = GetterUtil.getInteger(request.getAttribute("vanBanId"));
int kieuVanBan = GetterUtil.getInteger(request.getAttribute("kieuVanBan"));
%>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>" delta="<%=delta%>" 
						emptyResultsMessage="Không Tìm Thấy" 
						deltaConfigurable="true" var="searchContaier">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=sumRecord%>"/>
	<liferay-ui:search-container-row className="ispace.model.LuanChuyen"
		modelVar="item" indexVar="itemIndex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIndex+1+searchContaier.getStart())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Văn Bản">
			<%=(item.getKieuVanBan()==1)
				?VanBanDiLocalServiceUtil.getVanBanDi(item.getVanBanId()).getSoKiHieu()
				:VanBanDenLocalServiceUtil.getVanBanDen(item.getVanBanId()).getSoKiHieu()
			%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Kiểu Văn Bản">
			<%=KieuVanBanLocalServiceUtil.getKieuVanBan(item.getKieuVanBan()).getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Người Gửi">
			<%=NguoiDungLocalServiceUtil.getNguoiDung(item.getNguoiGui()).getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Người Nhận">
			<%=NguoiDungLocalServiceUtil.getNguoiDung(item.getNguoiNhan()).getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ngày Gửi">
			<%=new SimpleDateFormat("dd-MM-yyyy").format(item.getNgayGui())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ngày Nhận">
			<%=new SimpleDateFormat("dd-MM-yyyy").format(item.getNgayNhan())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ý Kiến">
			<%=item.getYKien()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Hạn Xử Lý">
			<%=new SimpleDateFormat("dd-MM-yyyy").format(item.getHanXuLy())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ý Kiến Phản Hồi">
			<%=item.getYKienPhanHoi()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ngày Phản Hồi">
			<%=new SimpleDateFormat("dd-MM-yyyy").format(item.getNgayPhanHoi())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Action">
			<liferay-portlet:actionURL var="editInputURL" name="input">
		  		<portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
		  		<portlet:param name="vanBanId" value="<%=String.valueOf(vanBanId)%>"/>
				<portlet:param name="kieuVanBan" value="<%=String.valueOf(kieuVanBan)%>"/>
		  	</liferay-portlet:actionURL>
		  	<input type=submit value="Edit" onclick="location.href='<%=editInputURL%>'" >
		  	<liferay-portlet:actionURL var="deleteURL" name="delete">
		  		<portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
		  	</liferay-portlet:actionURL>
		  	<input type=submit value="Delete" onclick="location.href='<%=deleteURL%>'" >
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
</liferay-ui:search-container>
<liferay-portlet:actionURL var="inputURL" name="input">
	<portlet:param name="vanBanId" value="<%=String.valueOf(vanBanId)%>"/>
	<portlet:param name="kieuVanBan" value="<%=String.valueOf(kieuVanBan)%>"/>
</liferay-portlet:actionURL>
<input type=submit value="Thêm mới" onclick="location.href='<%=inputURL%>'" >

