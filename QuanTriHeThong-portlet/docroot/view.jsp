<%@page import="com.liferay.portal.util.PortalUtil"%>
<%
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
long plidChucDanh = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"chucdanh_WAR_QuanTriHeThongportlet");
long plidPhongBan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"phongban_WAR_QuanTriHeThongportlet");
long plidNhanVien = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"nhanvien_WAR_QuanTriHeThongportlet");
long plidNhom = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"nhom_WAR_QuanTriHeThongportlet");
long plidLoaiVanBan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"loaivanban_WAR_QuanTriHeThongportlet");
long plidSoVanBan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"sovanban_WAR_QuanTriHeThongportlet");
%>
<portlet:defineObjects />

<liferay-portlet:actionURL var="chucdanhURL" name="danhSach" portletName="chucdanh_WAR_QuanTriHeThongportlet" plid="<%=plidChucDanh %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="phongbanURL" name="danhSach" portletName="phongban_WAR_QuanTriHeThongportlet" plid="<%=plidPhongBan %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="nhanvienURL" name="danhSach" portletName="nhanvien_WAR_QuanTriHeThongportlet" plid="<%=plidNhanVien %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="nhomURL" name="danhSach" portletName="nhom_WAR_QuanTriHeThongportlet" plid="<%=plidNhom %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="loaivanbanURL" name="danhSach" portletName="loaivanban_WAR_QuanTriHeThongportlet" plid="<%=plidLoaiVanBan %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="sovanbanURL" name="danhSach" portletName="sovanban_WAR_QuanTriHeThongportlet" plid="<%=plidSoVanBan %>"></liferay-portlet:actionURL>

<ul>
	<li><a href="<%=chucdanhURL%>">Chức Danh</a></li>
	<li><a href="<%=phongbanURL%>">Phòng Ban</a></li>
	<li><a href="<%=nhanvienURL%>">Nhân Viên</a></li>
	<li><a href="<%=nhomURL%>">Nhóm</a></li>
	<li><a href="<%=loaivanbanURL%>">Loại Văn Bản</a></li>
	<li><a href="<%=sovanbanURL%>">Số Văn Bản</a></li>
</ul>
