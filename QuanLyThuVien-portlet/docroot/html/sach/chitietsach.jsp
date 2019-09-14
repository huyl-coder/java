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
<aui:layout>
	<h4>Chi Tiết Sách:</h4>
	<aui:column columnWidth="30" first="true">
		<h5>Mã Sách: <%=sach.getMaSach() %></h5>
		<h5>Thể Loại: <%=TheloaiLocalServiceUtil.getTheloai(sach.getTheLoai()).getTen() %></h5>
		<h5>Tầng: <%=sach.getTang() %></h5>
	</aui:column>
	<aui:column columnWidth="30">
		<h5>Tên Sách: <%=sach.getTen() %></h5>
		<h5>Tác Giả: <%=sach.getTacGia() %></h5>
		<h5>kệ: <%=sach.getKe() %></h5>
	</aui:column>
	<aui:column columnWidth="40">
		<h5>Tổng Số Lượng Mới Nhập: <%=sach.getSoLuong() %></h5>
		<h5>Số Lượng Còn Lại: <%=sach.getSoLuongConlai() %></h5>
		<h5>Nhà Xuất Bản: <%=sach.getNhaXuatBan() %></h5>
	</aui:column>
</aui:layout>