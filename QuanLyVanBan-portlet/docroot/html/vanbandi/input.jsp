<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ispace.model.VanBanDi"%>
<%@page import="ispace.model.NguoiDung"%>
<%@page import="ispace.model.LoaiVanBan"%>
<%@page import="ispace.model.SoVanBan"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<%
	VanBanDi vanBanDi =(VanBanDi)request.getAttribute("vanBanDi");
	List<SoVanBan> soVanBan =  (List<SoVanBan>)request.getAttribute("soVanBan");
	List<LoaiVanBan> loaiVanBan =  (List<LoaiVanBan>)request.getAttribute("loaiVanBan");
	List<NguoiDung> nguoiKi =  (List<NguoiDung>)request.getAttribute("nguoiKi");
%>
<form name=frm method=post action="<%=saveURL %>">
	<input type=hidden name="<portlet:namespace/>id" value="<%=vanBanDi.getId()%>">
	<table>
		<tr>
			<td>Số Kí Hiệu:</td>
			<td><input type=text name="<portlet:namespace/>soKiHieu" value="<%=vanBanDi.getSoKiHieu()%>" required></td>
		</tr>
		<tr>
			<td>Sổ Văn Bản:</td>
			<td>
				<select name="<portlet:namespace/>soVanBanId">
					<%for(int i=0;i<soVanBan.size();i++){%>
					<option <%=(vanBanDi.getSoVanBanId()==soVanBan.get(i).getId())?"selected":""%>  value="<%=soVanBan.get(i).getId()%>"><%=soVanBan.get(i).getTen()%></option>
					<% } %>
				</select>
			</td>
		</tr>
		<tr>
			<td>Loại Văn Bản:</td>
			<td>
				<select name="<portlet:namespace/>loaiVanBanId">
					<%for(int i=0;i<loaiVanBan.size();i++){%>
					<option <%=(vanBanDi.getLoaiVanBanId()==loaiVanBan.get(i).getId())?"selected":""%> value="<%=loaiVanBan.get(i).getId()%>"><%=loaiVanBan.get(i).getTen()%></option>
					<% } %>
				</select>
			</td>
		</tr>
		<tr>
			<td>Date:</td>
			<td><input type=date name="<portlet:namespace/>date" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(vanBanDi.getDate())%>" required></td>
		</tr>
		<tr>
			<td>Người Ký:</td>
			<td>
				<select name="<portlet:namespace/>nguoiKiId">
					<%for(int i=0;i<nguoiKi.size();i++){%>
					<option <%=(vanBanDi.getNguoiKiId()==nguoiKi.get(i).getId())?"selected":""%> value="<%=nguoiKi.get(i).getId()%>"><%=nguoiKi.get(i).getTen()%></option>
					<% } %>
				</select>
			</td>
		</tr>
		<tr>
			<td><input type=submit value="Save"></td>
		</tr>
	</table>
</form>