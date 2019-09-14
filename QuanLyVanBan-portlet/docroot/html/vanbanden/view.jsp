<%@page import="ispace.model.NguoiDung"%>
<%@page import="ispace.model.LoaiVanBan"%>
<%@page import="ispace.model.SoVanBan"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ispace.service.NguoiDungLocalServiceUtil"%>
<%@page import="ispace.service.LoaiVanBanLocalServiceUtil"%>
<%@page import="ispace.service.SoVanBanLocalServiceUtil"%>
<%@page import="ispace.model.VanBanDen"%>
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
<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
<%
List<VanBanDen> data = (List<VanBanDen>)request.getAttribute("data");
List<SoVanBan> soVanBan =  (List<SoVanBan>)request.getAttribute("soVanBan");
List<LoaiVanBan> loaiVanBan =  (List<LoaiVanBan>)request.getAttribute("loaiVanBan");
List<NguoiDung> nguoiKi =  (List<NguoiDung>)request.getAttribute("nguoiKi");
PortletURL interatorURL = renderResponse.createActionURL();
interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
int delta = GetterUtil.getInteger(request.getAttribute("delta"));
int sumRecord = GetterUtil.getInteger(request.getAttribute("sumRecord"));
long plidLuanChuyen = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"luanchuyen_WAR_QuanLyVanBanportlet");
%>
<form name=frm method=POST action="<%=danhSachURL%>">
	<table>
		<tr>
			<td>
				Số Kí Hiệu:<input type= text value="" name="<portlet:namespace/>soKiHieu">
				Sổ Văn Bản:<select name="<portlet:namespace/>soVanBan">
					<option value="0"></option>
					<%for(int i=0;i<soVanBan.size();i++){ %>
						<option value="<%=soVanBan.get(i).getId()%>"><%=soVanBan.get(i).getTen()%></option>
					<% } %>
				</select>
				Loại Văn Bản:<select name="<portlet:namespace/>loaiVanBan">
					<option value="0"></option>
					<%for(int i=0;i<loaiVanBan.size();i++){ %>
						<option value="<%=loaiVanBan.get(i).getId()%>"><%=loaiVanBan.get(i).getTen()%></option>
					<% } %>
				</select>
				Người Kí:<select name="<portlet:namespace/>nguoiKi">
					<option value="0"></option>
					<%for(int i=0;i<nguoiKi.size();i++){ %>
						<option value="<%=nguoiKi.get(i).getId()%>"><%=nguoiKi.get(i).getTen()%></option>
					<% } %>
				</select>
				Date Start:<input type=date value="" name="<portlet:namespace/>dateStart">	
				Date End:<input type=date value="" name="<portlet:namespace/>dateEnd">
				<input type=submit value="Search">
			</td>
		</tr>
	</table>
</form>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>" delta="<%=delta%>" 
						emptyResultsMessage="Không Tìm Thấy" 
						deltaConfigurable="true" var="searchContaier">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=sumRecord%>"/>
	<liferay-ui:search-container-row className="ispace.model.VanBanDen"
		modelVar="item" indexVar="itemIndex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIndex+1+searchContaier.getStart())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Số Kí Hiệu">
			<%=item.getSoKiHieu()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Sổ Văn Bản">
			<%=SoVanBanLocalServiceUtil.getSoVanBan(item.getSoVanBanId()).getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Loại Văn Bản">
			<%=LoaiVanBanLocalServiceUtil.getLoaiVanBan(item.getLoaiVanBanId()).getTen()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Date">
			<%=new SimpleDateFormat("dd-MM-yyyy").format(item.getDate())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Người Ký">
			<%=NguoiDungLocalServiceUtil.getNguoiDung(item.getNguoiKiId()).getTen()%>
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
		  	<liferay-portlet:actionURL var="luanChuyenURL" name="danhSach" portletName="luanchuyen_WAR_QuanLyVanBanportlet" plid="<%=plidLuanChuyen %>">
		  		<portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
		  		<portlet:param name="kieuVanBan" value="<%=String.valueOf(2)%>"/>
		  	</liferay-portlet:actionURL>
		  	<input type=submit value="Luân Chuyển" onclick="location.href='<%=luanChuyenURL%>'" >
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
</liferay-ui:search-container>
<liferay-portlet:actionURL var="inputURL" name="input"></liferay-portlet:actionURL>
<input type=submit value="Thêm mới" onclick="location.href='<%=inputURL%>'" >

