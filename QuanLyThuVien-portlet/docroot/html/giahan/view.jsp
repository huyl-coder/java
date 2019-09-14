<%@page import="com.liferay.portal.kernel.search.SearchEngineUtil"%>
<%@page import="com.thuvien.service.PhieumuonLocalServiceUtil"%>
<%@page import="com.thuvien.model.Sach"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.thuvien.service.SachLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.thuvien.model.Phieumuon"%>
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
List<Phieumuon> data = (List<Phieumuon>)request.getAttribute("data");
PortletURL interatorURL = renderResponse.createActionURL();
interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
int delta = GetterUtil.getInteger(request.getAttribute("delta"));
int sumRecord = GetterUtil.getInteger(request.getAttribute("sumRecord"));
List<Sach> sachs = SachLocalServiceUtil.getSachs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>
<aui:form action="<%=danhSachURL %>" method="post" name="frm">
	<aui:layout>
        <aui:column columnWidth="30" first="true">
        	<aui:select name="sach" label="Sách">
        		<aui:option value=""></aui:option>
	        	<% for(Sach sach : sachs){ %>
	        			<aui:option value="<%=sach.getId() %>"><%=sach.getTen() %></aui:option>
	        	<% } %>
        	</aui:select>
        	<aui:input name="ngayMuonFrom" type="Date" label="Ngày Mượn From" ></aui:input>
        </aui:column>
        <aui:column columnWidth="30">
        	<aui:input name="soLuong" label="Số Lượng Mượn" type="number" value="" />
        	<aui:input name="ngayTraTo" type="Date" label="Ngày Trả To"></aui:input>	
        </aui:column>
        <aui:column columnWidth="40" last="true">
        	<aui:input name="ngayMuonTo" type="Date" label="Ngày Mượn To" ></aui:input>
			<aui:input name="ngayTraFrom" type="Date" label="Ngày Trả From"></aui:input>
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
	<liferay-ui:search-container-row className="com.thuvien.model.Phieumuon"
		modelVar="item" indexVar="itemIndex" escapedModel="<%=true%>"
		rowVar="itemRow" >
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIndex+1+searchContaier.getStart())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên Người Dùng">
			<%=UserLocalServiceUtil.getUser(item.getNguoiDung()).getScreenName() %>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên Sách">
			<%=SachLocalServiceUtil.getSach(item.getSach()).getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Số Lượng">
			<%=item.getSoLuong()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ngày Mượn">
			<%=new SimpleDateFormat("dd-MM-yyyy").format(item.getNgayMuon())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ngày Trả">
			<%=new SimpleDateFormat("dd-MM-yyyy").format(item.getNgayTra())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Xác Nhận">
			<%=(item.getXacNhan()==0)?"Chưa Xử Lý":"Đã Xử Lý"%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Actions">
			<liferay-portlet:actionURL var="giaHan" name="giaHan">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId()) %>"/>
			</liferay-portlet:actionURL>
			<liferay-ui:icon-menu>
		        <liferay-ui:icon iconCssClass="icon-edit" message="Gia Hạn" url="<%=giaHan %>" />
		    </liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator  paginate="false"/>
</liferay-ui:search-container>