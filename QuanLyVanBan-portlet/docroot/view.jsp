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
long plidLoaiVanBan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"loaivanban_WAR_QuanLyVanBanportlet");
long plidSoVanBan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"sovanban_WAR_QuanLyVanBanportlet");
long plidVanBanDen = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"vanbanden_WAR_QuanLyVanBanportlet");
long plidVanBanDi = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"vanbandi_WAR_QuanLyVanBanportlet");
long plidNguoiDung = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"nguoidung_WAR_QuanLyVanBanportlet");
%>
<portlet:defineObjects />

<liferay-portlet:actionURL var="loaiVanBanURL" name="danhSach" portletName="loaivanban_WAR_QuanLyVanBanportlet" plid="<%=plidLoaiVanBan %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="soVanBanURL" name="danhSach" portletName="sovanban_WAR_QuanLyVanBanportlet" plid="<%=plidSoVanBan %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="vanBanDenURL" name="danhSach" portletName="vanbanden_WAR_QuanLyVanBanportlet" plid="<%=plidVanBanDen %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="vanBanDiURL" name="danhSach" portletName="vanbandi_WAR_QuanLyVanBanportlet" plid="<%=plidVanBanDi %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="nguoiDungURL" name="danhSach" portletName="nguoidung_WAR_QuanLyVanBanportlet" plid="<%=plidNguoiDung %>"></liferay-portlet:actionURL>

<ul>
	<li><a href="<%=loaiVanBanURL%>">Loại Văn Bản</a></li>
	<li><a href="<%=soVanBanURL%>">Sổ Văn Bản</a></li>
	<li><a href="<%=vanBanDenURL%>">Văn Bản Đến</a></li>
	<li><a href="<%=vanBanDiURL%>">Văn Bản Đi</a></li>
	<li><a href="<%=nguoiDungURL%>">Người Dùng</a></li>
</ul>
