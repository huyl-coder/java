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
long plidTheLoai = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"theloai_WAR_QuanLyThuVienportlet");
long plidSach = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"sach_WAR_QuanLyThuVienportlet");
long plidTimKiemSach = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"timkiemsach_WAR_QuanLyThuVienportlet");
long plidPhieuMuon = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"phieumuon_WAR_QuanLyThuVienportlet");
long plidGiaHan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(), "giahan_WAR_QuanLyThuVienportlet");
%>

<liferay-portlet:actionURL var="theLoaiURL" name="danhSach" portletName="theloai_WAR_QuanLyThuVienportlet" plid="<%=plidTheLoai %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="SachURL" name="danhSach" portletName="sach_WAR_QuanLyThuVienportlet" plid="<%=plidSach %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="timKiemSachURL" name="danhSach" portletName="timkiemsach_WAR_QuanLyThuVienportlet" plid="<%=plidTimKiemSach %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="phieuMuonURL" name="danhSach" portletName="phieumuon_WAR_QuanLyThuVienportlet" plid="<%=plidPhieuMuon %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="giaHanURL" name="danhSach" portletName="giahan_WAR_QuanLyThuVienportlet" plid="<%=plidGiaHan %>"></liferay-portlet:actionURL>
<ul>
	<li><a href="<%=timKiemSachURL%>">Tìm Kiếm Sách</a></li>
	<li><a href="<%=theLoaiURL%>">Quản Lý Danh Muc Thể Loại</a></li>
	<li><a href="<%=SachURL%>">Quản Lý Sách</a></li>
	<li><a href="<%=phieuMuonURL%>">Quản Lý Phiếu Mượn</a></li>
	<li><a href="<%=giaHanURL%>">Đăng Kí Gia Hạn</a></li>
</ul>
