<%@page import="ispace.model.SoVanBan"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<%
	SoVanBan soVanBan =(SoVanBan)request.getAttribute("soVanBan");
%>
<form name=frm method=post action="<%=saveURL %>">
	<input type=hidden name="<portlet:namespace/>id" value="<%=soVanBan.getId()%>">
	<table>
		<tr>
			<td>Tên:</td>
			<td><input type=text name="<portlet:namespace/>ten" value="<%=soVanBan.getTen()%>" required></td>
		</tr>
		<tr>
			<td><input type=submit value="Save"></td>
		</tr>
	</table>
</form>