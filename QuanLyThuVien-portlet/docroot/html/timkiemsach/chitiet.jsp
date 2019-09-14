<%@page import="com.thuvien.service.TheloaiLocalServiceUtil"%>
<%@page import="com.thuvien.model.Sach"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
	Sach sach = (Sach)request.getAttribute("sach");
%>
<liferay-portlet:actionURL var="phieuMuon" name="phieuMuon">
	<liferay-portlet:param name="id" value="<%=String.valueOf(sach.getId()) %>" />
</liferay-portlet:actionURL>
<aui:layout>
	<h4>Chi Tiết Sách:</h4>
	<aui:column columnWidth="30" first="true">
		<h5>Mã Sách: <%=sach.getMaSach() %></h5>
		<h5>Thể Loại: <%=TheloaiLocalServiceUtil.getTheloai(sach.getTheLoai()).getTen() %></h5>
	</aui:column>
	<aui:column columnWidth="30">
		<h5>Tên Sách: <%=sach.getTen() %></h5>
		<h5>Tác Giả: <%=sach.getTacGia() %></h5>
	</aui:column>
	<aui:column columnWidth="40">
		<h5>Số Lượng Còn Lại: <%=sach.getSoLuongConlai() %></h5>
		<h5>Nhà Xuất Bản: <%=sach.getNhaXuatBan() %></h5>
	</aui:column>
	<% if(sach.getSoLuongConlai()==0){ %>
		<h5>Sách đã hết</h5>
		<p>Đang trong tình trạng cập nhật số lượng.</p>
	<% }else{ %>
	<aui:button-row>
		<aui:button type="submit" href="<%=phieuMuon %>" value="Đặt Mượn"></aui:button>
	</aui:button-row>
	<% } %>
</aui:layout>