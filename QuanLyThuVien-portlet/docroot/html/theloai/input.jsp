<%@page import="com.thuvien.model.Theloai"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<%
	Theloai theloai =(Theloai)request.getAttribute("theloai");
%>
<aui:form action="<%=saveURL %>" name="frm" method="POST">
	<aui:input name="id" type="hidden" value="<%=theloai.getId() %>" />
	<aui:row>
		<aui:col>
			<aui:input name="ten" type="text" label="Tên Thể Loại" value="<%=theloai.getTen() %>"></aui:input>
		</aui:col>
		<aui:button-row>
			<aui:button type="submit" value="Save"></aui:button>
		</aui:button-row>
	</aui:row>
</aui:form>