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

package ispace.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ispace.service.ClpSerializer;
import ispace.service.LuanChuyenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author PC
 */
public class LuanChuyenClp extends BaseModelImpl<LuanChuyen>
	implements LuanChuyen {
	public LuanChuyenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LuanChuyen.class;
	}

	@Override
	public String getModelClassName() {
		return LuanChuyen.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vanBanId", getVanBanId());
		attributes.put("kieuVanBan", getKieuVanBan());
		attributes.put("nguoiGui", getNguoiGui());
		attributes.put("nguoiNhan", getNguoiNhan());
		attributes.put("ngayGui", getNgayGui());
		attributes.put("ngayNhan", getNgayNhan());
		attributes.put("yKien", getYKien());
		attributes.put("hanXuLy", getHanXuLy());
		attributes.put("yKienPhanHoi", getYKienPhanHoi());
		attributes.put("ngayPhanHoi", getNgayPhanHoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vanBanId = (Long)attributes.get("vanBanId");

		if (vanBanId != null) {
			setVanBanId(vanBanId);
		}

		Long kieuVanBan = (Long)attributes.get("kieuVanBan");

		if (kieuVanBan != null) {
			setKieuVanBan(kieuVanBan);
		}

		Long nguoiGui = (Long)attributes.get("nguoiGui");

		if (nguoiGui != null) {
			setNguoiGui(nguoiGui);
		}

		Long nguoiNhan = (Long)attributes.get("nguoiNhan");

		if (nguoiNhan != null) {
			setNguoiNhan(nguoiNhan);
		}

		Date ngayGui = (Date)attributes.get("ngayGui");

		if (ngayGui != null) {
			setNgayGui(ngayGui);
		}

		Date ngayNhan = (Date)attributes.get("ngayNhan");

		if (ngayNhan != null) {
			setNgayNhan(ngayNhan);
		}

		String yKien = (String)attributes.get("yKien");

		if (yKien != null) {
			setYKien(yKien);
		}

		Date hanXuLy = (Date)attributes.get("hanXuLy");

		if (hanXuLy != null) {
			setHanXuLy(hanXuLy);
		}

		String yKienPhanHoi = (String)attributes.get("yKienPhanHoi");

		if (yKienPhanHoi != null) {
			setYKienPhanHoi(yKienPhanHoi);
		}

		Date ngayPhanHoi = (Date)attributes.get("ngayPhanHoi");

		if (ngayPhanHoi != null) {
			setNgayPhanHoi(ngayPhanHoi);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_luanChuyenRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVanBanId() {
		return _vanBanId;
	}

	@Override
	public void setVanBanId(long vanBanId) {
		_vanBanId = vanBanId;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setVanBanId", long.class);

				method.invoke(_luanChuyenRemoteModel, vanBanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKieuVanBan() {
		return _kieuVanBan;
	}

	@Override
	public void setKieuVanBan(long kieuVanBan) {
		_kieuVanBan = kieuVanBan;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setKieuVanBan", long.class);

				method.invoke(_luanChuyenRemoteModel, kieuVanBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiGui() {
		return _nguoiGui;
	}

	@Override
	public void setNguoiGui(long nguoiGui) {
		_nguoiGui = nguoiGui;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiGui", long.class);

				method.invoke(_luanChuyenRemoteModel, nguoiGui);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiNhan() {
		return _nguoiNhan;
	}

	@Override
	public void setNguoiNhan(long nguoiNhan) {
		_nguoiNhan = nguoiNhan;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiNhan", long.class);

				method.invoke(_luanChuyenRemoteModel, nguoiNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGui() {
		return _ngayGui;
	}

	@Override
	public void setNgayGui(Date ngayGui) {
		_ngayGui = ngayGui;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGui", Date.class);

				method.invoke(_luanChuyenRemoteModel, ngayGui);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayNhan() {
		return _ngayNhan;
	}

	@Override
	public void setNgayNhan(Date ngayNhan) {
		_ngayNhan = ngayNhan;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayNhan", Date.class);

				method.invoke(_luanChuyenRemoteModel, ngayNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKien() {
		return _yKien;
	}

	@Override
	public void setYKien(String yKien) {
		_yKien = yKien;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setYKien", String.class);

				method.invoke(_luanChuyenRemoteModel, yKien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getHanXuLy() {
		return _hanXuLy;
	}

	@Override
	public void setHanXuLy(Date hanXuLy) {
		_hanXuLy = hanXuLy;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setHanXuLy", Date.class);

				method.invoke(_luanChuyenRemoteModel, hanXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienPhanHoi() {
		return _yKienPhanHoi;
	}

	@Override
	public void setYKienPhanHoi(String yKienPhanHoi) {
		_yKienPhanHoi = yKienPhanHoi;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienPhanHoi", String.class);

				method.invoke(_luanChuyenRemoteModel, yKienPhanHoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayPhanHoi() {
		return _ngayPhanHoi;
	}

	@Override
	public void setNgayPhanHoi(Date ngayPhanHoi) {
		_ngayPhanHoi = ngayPhanHoi;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayPhanHoi", Date.class);

				method.invoke(_luanChuyenRemoteModel, ngayPhanHoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLuanChuyenRemoteModel() {
		return _luanChuyenRemoteModel;
	}

	public void setLuanChuyenRemoteModel(BaseModel<?> luanChuyenRemoteModel) {
		_luanChuyenRemoteModel = luanChuyenRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _luanChuyenRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_luanChuyenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LuanChuyenLocalServiceUtil.addLuanChuyen(this);
		}
		else {
			LuanChuyenLocalServiceUtil.updateLuanChuyen(this);
		}
	}

	@Override
	public LuanChuyen toEscapedModel() {
		return (LuanChuyen)ProxyUtil.newProxyInstance(LuanChuyen.class.getClassLoader(),
			new Class[] { LuanChuyen.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LuanChuyenClp clone = new LuanChuyenClp();

		clone.setId(getId());
		clone.setVanBanId(getVanBanId());
		clone.setKieuVanBan(getKieuVanBan());
		clone.setNguoiGui(getNguoiGui());
		clone.setNguoiNhan(getNguoiNhan());
		clone.setNgayGui(getNgayGui());
		clone.setNgayNhan(getNgayNhan());
		clone.setYKien(getYKien());
		clone.setHanXuLy(getHanXuLy());
		clone.setYKienPhanHoi(getYKienPhanHoi());
		clone.setNgayPhanHoi(getNgayPhanHoi());

		return clone;
	}

	@Override
	public int compareTo(LuanChuyen luanChuyen) {
		long primaryKey = luanChuyen.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LuanChuyenClp)) {
			return false;
		}

		LuanChuyenClp luanChuyen = (LuanChuyenClp)obj;

		long primaryKey = luanChuyen.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vanBanId=");
		sb.append(getVanBanId());
		sb.append(", kieuVanBan=");
		sb.append(getKieuVanBan());
		sb.append(", nguoiGui=");
		sb.append(getNguoiGui());
		sb.append(", nguoiNhan=");
		sb.append(getNguoiNhan());
		sb.append(", ngayGui=");
		sb.append(getNgayGui());
		sb.append(", ngayNhan=");
		sb.append(getNgayNhan());
		sb.append(", yKien=");
		sb.append(getYKien());
		sb.append(", hanXuLy=");
		sb.append(getHanXuLy());
		sb.append(", yKienPhanHoi=");
		sb.append(getYKienPhanHoi());
		sb.append(", ngayPhanHoi=");
		sb.append(getNgayPhanHoi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("ispace.model.LuanChuyen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vanBanId</column-name><column-value><![CDATA[");
		sb.append(getVanBanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kieuVanBan</column-name><column-value><![CDATA[");
		sb.append(getKieuVanBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiGui</column-name><column-value><![CDATA[");
		sb.append(getNguoiGui());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiNhan</column-name><column-value><![CDATA[");
		sb.append(getNguoiNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGui</column-name><column-value><![CDATA[");
		sb.append(getNgayGui());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKien</column-name><column-value><![CDATA[");
		sb.append(getYKien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hanXuLy</column-name><column-value><![CDATA[");
		sb.append(getHanXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKienPhanHoi</column-name><column-value><![CDATA[");
		sb.append(getYKienPhanHoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayPhanHoi</column-name><column-value><![CDATA[");
		sb.append(getNgayPhanHoi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _vanBanId;
	private long _kieuVanBan;
	private long _nguoiGui;
	private long _nguoiNhan;
	private Date _ngayGui;
	private Date _ngayNhan;
	private String _yKien;
	private Date _hanXuLy;
	private String _yKienPhanHoi;
	private Date _ngayPhanHoi;
	private BaseModel<?> _luanChuyenRemoteModel;
	private Class<?> _clpSerializerClass = ispace.service.ClpSerializer.class;
}