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
<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<%
	Sach sach =(Sach)request.getAttribute("sach");
	List<Theloai> theLoai = (List<Theloai>)request.getAttribute("theLoai");
%>
<aui:form action="<%=saveURL %>" name="frm" method="POST">
	<aui:input name="id" type="hidden" value="<%=sach.getId() %>" />
	<aui:row>
		<aui:column columnWidth="50" first="true">
			<aui:input name="maSach" type="text" label="Mã Sách" value="<%=sach.getMaSach() %>"><aui:validator name="required"></aui:validator></aui:input>
			<aui:input name="ten" type="text" label="Tên Sách" value="<%=sach.getTen() %>"><aui:validator name="required"></aui:validator></aui:input>
			<aui:input name="soLuong" type="number" label="Số Lượng Hiện Tại" value="<%=sach.getSoLuongConlai() %>"><aui:validator name="min">0</aui:validator></aui:input>
			<aui:input name="tacGia" type="text" label="Tác Giả" value="<%=sach.getTacGia() %>"><aui:validator name="required"></aui:validator></aui:input>
		</aui:column>
		<aui:column columnWidth="50" last="true">
			<aui:input name="nhaXuatBan" type="text" label="Nhà Xuất Bản" value="<%=sach.getNhaXuatBan() %>"><aui:validator name="required"></aui:validator></aui:input>
			<aui:input name="tang" type="text" label="Tầng" value="<%=sach.getTang() %>"><aui:validator name="required"></aui:validator></aui:input>
			<aui:input name="ke" type="text" label="Kệ" value="<%=sach.getKe() %>"><aui:validator name="required"></aui:validator></aui:input>
			<aui:select name="theloai" label="Thể Loại" required="true">
				<aui:option value=""></aui:option>
				<% for(Theloai theloai : theLoai){ %>
					<aui:option selected="<%=(theloai.getId()==sach.getTheLoai())?true:false %>" value="<%=theloai.getId() %>"><%=theloai.getTen() %></aui:option>
				<% } %>
			</aui:select>
		</aui:column>
		<aui:button-row>
			<aui:button type="submit" value="Save"></aui:button>
		</aui:button-row>
	</aui:row>
</aui:form>