<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.thuvien.service.SachLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.thuvien.model.Phieumuon"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
	Phieumuon phieuMuon = (Phieumuon)request.getAttribute("phieuMuon");
%>
<aui:layout>
	<h4>Chi Tiết Sau Khi Xử Lý Phiếu Mượn:</h4>
	<aui:column columnWidth="30" first="true">
		<h5>Người Đăng Kí: <%=UserLocalServiceUtil.getUser(phieuMuon.getNguoiDung()).getScreenName() %></h5>
		<h5>Ngày Mượn: <%=new SimpleDateFormat("yyyy-MM-dd").format(phieuMuon.getNgayMuon()) %></h5>
	</aui:column>
	<aui:column columnWidth="30">
		<h5>Tên Sách Mượn: <%=SachLocalServiceUtil.getSach(phieuMuon.getSach()).getTen() %></h5>
		<h5>Ngày Trả: <%=new SimpleDateFormat("yyyy-MM-dd").format(phieuMuon.getNgayTra()) %></h5>
	</aui:column>
	<aui:column columnWidth="40">
		<h5>Số Lượng Mượn: <%=phieuMuon.getSoLuong() %></h5>
		<h5>Sau Khi Xử Lý Xong: <%=(phieuMuon.getDuyetMuon()==0)?"Đã Từ Chối Cho Mượn":"Đã Chấp Nhận Cho Mượn" %></h5>
	</aui:column>
</aui:layout>