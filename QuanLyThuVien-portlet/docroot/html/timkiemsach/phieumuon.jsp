<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.thuvien.model.Phieumuon"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.thuvien.model.Theloai"%>
<%@page import="java.util.List"%>
<%@page import="com.thuvien.model.Sach"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<liferay-portlet:actionURL var="dangKi" name="dangKiPhieuMuon"></liferay-portlet:actionURL>
<%
	Sach sach =(Sach)request.getAttribute("sach");
	Date date = new Date();
	SimpleDateFormat dateFormat  = new SimpleDateFormat( "yyyy-MM-dd");
	ThemeDisplay td =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY); 
	User userId = td.getUser();
%>
<h4>Phiếu Mượn Sách:</h4>
<aui:form action="<%=dangKi %>" name="frm" method="POST">
	<aui:input name="id" type="hidden" value="<%=sach.getId() %>" />
	<aui:input name="nguoiDung" type="hidden" value="<%=userId.getUserId() %>"></aui:input>
	<aui:row>
		<aui:column columnWidth="50" first="true">
			<p>Mã Sách: <%=sach.getMaSach() %></p>
			<aui:input name="ngayMuon" type="Date" label="Ngày Mượn" value="<%=dateFormat.format(date) %>"></aui:input>
			<aui:input name="soLuong" type="number" label="Số Lượng">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="range">[1,<%=sach.getSoLuongConlai() %>]</aui:validator>
			</aui:input>
		</aui:column>
		<aui:column columnWidth="50" last="true">
			<p>Tên Sách: <%=sach.getTen() %></p>
			<aui:input name="ngayTra" type="Date" label="Ngày Trả" ><aui:validator name="required"></aui:validator></aui:input>
		</aui:column>
		<aui:button-row>
			<aui:button type="submit" value="Lưu"></aui:button>
		</aui:button-row>
	</aui:row>
</aui:form>