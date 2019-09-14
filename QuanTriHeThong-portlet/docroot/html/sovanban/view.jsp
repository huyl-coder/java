<%@page import="com.test.model.sovanban"%>
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
<liferay-portlet:actionURL var="inputURL" name="input"></liferay-portlet:actionURL>
<%
List<sovanban> data = (List<sovanban>)request.getAttribute("data");
PortletURL interatorURL = renderResponse.createActionURL();
interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
int delta = GetterUtil.getInteger(request.getAttribute("delta"));
int sumRecord = GetterUtil.getInteger(request.getAttribute("sumRecord"));
%>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>" delta="<%=delta%>" 
						emptyResultsMessage="Không Tìm Thấy" 
						deltaConfigurable="true" var="searchContaier">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=sumRecord%>"/>
	<liferay-ui:search-container-row className="com.test.model.sovanban"
		modelVar="item" indexVar="itemIndex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIndex+1+searchContaier.getStart())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên">
			<%=item.getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Action">
			<liferay-portlet:actionURL var="editInputURL" name="input">
		  		<portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
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
<input type=submit value="Thêm mới" onclick="location.href='<%=inputURL%>'" >

