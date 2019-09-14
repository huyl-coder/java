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

package com.thuvien.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.thuvien.service.ClpSerializer;
import com.thuvien.service.SachLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PC
 */
public class SachClp extends BaseModelImpl<Sach> implements Sach {
	public SachClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Sach.class;
	}

	@Override
	public String getModelClassName() {
		return Sach.class.getName();
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
		attributes.put("ten", getTen());
		attributes.put("maSach", getMaSach());
		attributes.put("soLuong", getSoLuong());
		attributes.put("theLoai", getTheLoai());
		attributes.put("ke", getKe());
		attributes.put("tang", getTang());
		attributes.put("tacGia", getTacGia());
		attributes.put("nhaXuatBan", getNhaXuatBan());
		attributes.put("soLuongConlai", getSoLuongConlai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}

		String maSach = (String)attributes.get("maSach");

		if (maSach != null) {
			setMaSach(maSach);
		}

		Long soLuong = (Long)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Long theLoai = (Long)attributes.get("theLoai");

		if (theLoai != null) {
			setTheLoai(theLoai);
		}

		String ke = (String)attributes.get("ke");

		if (ke != null) {
			setKe(ke);
		}

		String tang = (String)attributes.get("tang");

		if (tang != null) {
			setTang(tang);
		}

		String tacGia = (String)attributes.get("tacGia");

		if (tacGia != null) {
			setTacGia(tacGia);
		}

		String nhaXuatBan = (String)attributes.get("nhaXuatBan");

		if (nhaXuatBan != null) {
			setNhaXuatBan(nhaXuatBan);
		}

		Long soLuongConlai = (Long)attributes.get("soLuongConlai");

		if (soLuongConlai != null) {
			setSoLuongConlai(soLuongConlai);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_sachRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTen() {
		return _ten;
	}

	@Override
	public void setTen(String ten) {
		_ten = ten;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_sachRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSach() {
		return _maSach;
	}

	@Override
	public void setMaSach(String maSach) {
		_maSach = maSach;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSach", String.class);

				method.invoke(_sachRemoteModel, maSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoLuong() {
		return _soLuong;
	}

	@Override
	public void setSoLuong(long soLuong) {
		_soLuong = soLuong;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", long.class);

				method.invoke(_sachRemoteModel, soLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTheLoai() {
		return _theLoai;
	}

	@Override
	public void setTheLoai(long theLoai) {
		_theLoai = theLoai;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTheLoai", long.class);

				method.invoke(_sachRemoteModel, theLoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKe() {
		return _ke;
	}

	@Override
	public void setKe(String ke) {
		_ke = ke;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setKe", String.class);

				method.invoke(_sachRemoteModel, ke);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTang() {
		return _tang;
	}

	@Override
	public void setTang(String tang) {
		_tang = tang;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTang", String.class);

				method.invoke(_sachRemoteModel, tang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTacGia() {
		return _tacGia;
	}

	@Override
	public void setTacGia(String tacGia) {
		_tacGia = tacGia;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTacGia", String.class);

				method.invoke(_sachRemoteModel, tacGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhaXuatBan() {
		return _nhaXuatBan;
	}

	@Override
	public void setNhaXuatBan(String nhaXuatBan) {
		_nhaXuatBan = nhaXuatBan;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setNhaXuatBan", String.class);

				method.invoke(_sachRemoteModel, nhaXuatBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoLuongConlai() {
		return _soLuongConlai;
	}

	@Override
	public void setSoLuongConlai(long soLuongConlai) {
		_soLuongConlai = soLuongConlai;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongConlai", long.class);

				method.invoke(_sachRemoteModel, soLuongConlai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSachRemoteModel() {
		return _sachRemoteModel;
	}

	public void setSachRemoteModel(BaseModel<?> sachRemoteModel) {
		_sachRemoteModel = sachRemoteModel;
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

		Class<?> remoteModelClass = _sachRemoteModel.getClass();

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

		Object returnValue = method.invoke(_sachRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SachLocalServiceUtil.addSach(this);
		}
		else {
			SachLocalServiceUtil.updateSach(this);
		}
	}

	@Override
	public Sach toEscapedModel() {
		return (Sach)ProxyUtil.newProxyInstance(Sach.class.getClassLoader(),
			new Class[] { Sach.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SachClp clone = new SachClp();

		clone.setId(getId());
		clone.setTen(getTen());
		clone.setMaSach(getMaSach());
		clone.setSoLuong(getSoLuong());
		clone.setTheLoai(getTheLoai());
		clone.setKe(getKe());
		clone.setTang(getTang());
		clone.setTacGia(getTacGia());
		clone.setNhaXuatBan(getNhaXuatBan());
		clone.setSoLuongConlai(getSoLuongConlai());

		return clone;
	}

	@Override
	public int compareTo(Sach sach) {
		long primaryKey = sach.getPrimaryKey();

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

		if (!(obj instanceof SachClp)) {
			return false;
		}

		SachClp sach = (SachClp)obj;

		long primaryKey = sach.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", maSach=");
		sb.append(getMaSach());
		sb.append(", soLuong=");
		sb.append(getSoLuong());
		sb.append(", theLoai=");
		sb.append(getTheLoai());
		sb.append(", ke=");
		sb.append(getKe());
		sb.append(", tang=");
		sb.append(getTang());
		sb.append(", tacGia=");
		sb.append(getTacGia());
		sb.append(", nhaXuatBan=");
		sb.append(getNhaXuatBan());
		sb.append(", soLuongConlai=");
		sb.append(getSoLuongConlai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.thuvien.model.Sach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSach</column-name><column-value><![CDATA[");
		sb.append(getMaSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>theLoai</column-name><column-value><![CDATA[");
		sb.append(getTheLoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ke</column-name><column-value><![CDATA[");
		sb.append(getKe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tang</column-name><column-value><![CDATA[");
		sb.append(getTang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tacGia</column-name><column-value><![CDATA[");
		sb.append(getTacGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhaXuatBan</column-name><column-value><![CDATA[");
		sb.append(getNhaXuatBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongConlai</column-name><column-value><![CDATA[");
		sb.append(getSoLuongConlai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _ten;
	private String _maSach;
	private long _soLuong;
	private long _theLoai;
	private String _ke;
	private String _tang;
	private String _tacGia;
	private String _nhaXuatBan;
	private long _soLuongConlai;
	private BaseModel<?> _sachRemoteModel;
	private Class<?> _clpSerializerClass = com.thuvien.service.ClpSerializer.class;
}