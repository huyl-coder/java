<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="ispace.model.VanBanDen"%>
<%@page import="ispace.model.KieuVanBan"%>
<%@page import="ispace.model.LuanChuyen"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ispace.model.VanBanDi"%>
<%@page import="ispace.model.NguoiDung"%>
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
	LuanChuyen luanChuyen =(LuanChuyen)request.getAttribute("luanChuyen");
	List<NguoiDung> nguoiKi =  (List<NguoiDung>)request.getAttribute("nguoiKi");
	int vanBanId = GetterUtil.getInteger(request.getAttribute("vanBanId"));
	int kieuVanBanId = GetterUtil.getInteger(request.getAttribute("kieuVanBanId"));
%>
<form name=frm method=post action="<%=saveURL %>">
	<input type=hidden name="<portlet:namespace/>id" value="<%=luanChuyen.getId()%>">
	<input type=hidden name="<portlet:namespace/>vanBanId" value="<%=vanBanId%>">
	<input type=hidden name="<portlet:namespace/>kieuVanBan" value="<%=kieuVanBanId%>">
	<table>
		<tr>
			<td>Người Gửi:</td>
			<td>
				<select name="<portlet:namespace/>nguoiGui">
					<%for(int i=0;i<nguoiKi.size();i++){%>
					<option <%=(luanChuyen.getNguoiGui()==nguoiKi.get(i).getId())?"selected":""%> value="<%=nguoiKi.get(i).getId()%>"><%=nguoiKi.get(i).getTen()%></option>
					<% } %>
				</select>
			</td>
		</tr>
		<tr>
			<td>Người Nhận:</td>
			<td>
				<select name="<portlet:namespace/>nguoiNhan">
					<%for(int i=0;i<nguoiKi.size();i++){%>
					<option <%=(luanChuyen.getNguoiNhan()==nguoiKi.get(i).getId())?"selected":""%> value="<%=nguoiKi.get(i).getId()%>"><%=nguoiKi.get(i).getTen()%></option>
					<% } %>
				</select>
			</td>
		</tr>
		<tr>
			<td>Ngày Gửi:</td>
			<td><input type=date name="<portlet:namespace/>ngayGui" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(luanChuyen.getNgayGui())%>" required></td>
		</tr>
		<tr>
			<td>Ngày Nhận:</td>
			<td><input type=date name="<portlet:namespace/>ngayNhan" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(luanChuyen.getNgayNhan())%>" required></td>
		</tr>
		<tr>
			<td>Ý Kiến:</td>
			<td><input type=text name="<portlet:namespace/>yKien" value="<%=luanChuyen.getYKien()%>"></td>
		</tr>
		<tr>
			<td>Hạn Xử Lý:</td>
			<td><input type=date name="<portlet:namespace/>hanXuLy" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(luanChuyen.getHanXuLy())%>" required></td>
		</tr>
		<tr>
			<td>Ý Kiến Phản Hồi:</td>
			<td><input type=text name="<portlet:namespace/>yKienPhanHoi" value="<%=luanChuyen.getYKienPhanHoi()%>" ></td>
		</tr>
		<tr>
			<td>Ngày Phản Hồi:</td>
			<td><input type=date name="<portlet:namespace/>ngayPhanHoi" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(luanChuyen.getNgayPhanHoi())%>" required></td>
		</tr>
		<tr>
			<td><input type=submit value="Save"></td>
		</tr>
	</table>
</form>