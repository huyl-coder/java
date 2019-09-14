<%@page import="com.thuvien.model.Theloai"%>
<%@page import="com.thuvien.service.TheloaiLocalServiceUtil"%>
<%@page import="com.thuvien.model.Sach"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.util.List"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
<%
List<Sach> data = (List<Sach>)request.getAttribute("data");
List<Theloai> theLoai = (List<Theloai>)request.getAttribute("theLoai");
PortletURL interatorURL = renderResponse.createActionURL();
interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
int delta = GetterUtil.getInteger(request.getAttribute("delta"));
int sumRecord = GetterUtil.getInteger(request.getAttribute("sumRecord"));
%>
<aui:form action="<%=danhSachURL %>" method="post" name="frm">
	<aui:layout>
        <aui:column columnWidth="30" first="true">
            <aui:input name="ma" label="Mã Sách" type="text" value="" />
        </aui:column>
        <aui:column columnWidth="30">
        	<aui:input name="ten" label="Tên Sách" type="text" value="" />
        </aui:column>
        <aui:column columnWidth="40" last="true">
        	<aui:select name="theloai" label="Thể Loại">
        		<aui:option value=""></aui:option>
				<% for(Theloai theloai : theLoai){ %>
					<aui:option value="<%=theloai.getId() %>"><%=theloai.getTen() %></aui:option>
				<% } %>
			</aui:select>
        </aui:column>
        <aui:button-row>
			<aui:button type="submit" value="Search"></aui:button>
		</aui:button-row>
    </aui:layout>
</aui:form>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>" delta="<%=delta%>" 
						emptyResultsMessage="Không Tìm Thấy" 
						deltaConfigurable="true" var="searchContaier">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=sumRecord%>"/>
	<liferay-ui:search-container-row className="com.thuvien.model.Sach"
		modelVar="item" indexVar="itemIndex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIndex+1+searchContaier.getStart())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Mã Sách">
			<%=item.getMaSach() %>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên Sách">
			<%=item.getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Thể Loại Sách">
			<%=TheloaiLocalServiceUtil.getTheloai(item.getTheLoai()).getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Actions">
			<liferay-portlet:actionURL var="detail" name="detail">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId()) %>"/>
			</liferay-portlet:actionURL>
			<liferay-ui:icon-menu>
				<liferay-ui:icon iconCssClass="icon-search" message="Detail" url="<%=detail %>" />
		    </liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
</liferay-ui:search-container>

