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
import com.thuvien.service.PhieumuonLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author PC
 */
public class PhieumuonClp extends BaseModelImpl<Phieumuon> implements Phieumuon {
	public PhieumuonClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Phieumuon.class;
	}

	@Override
	public String getModelClassName() {
		return Phieumuon.class.getName();
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
		attributes.put("nguoiDung", getNguoiDung());
		attributes.put("sach", getSach());
		attributes.put("soLuong", getSoLuong());
		attributes.put("ngayMuon", getNgayMuon());
		attributes.put("ngayTra", getNgayTra());
		attributes.put("xacNhan", getXacNhan());
		attributes.put("trangThai", getTrangThai());
		attributes.put("duyetMuon", getDuyetMuon());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long nguoiDung = (Long)attributes.get("nguoiDung");

		if (nguoiDung != null) {
			setNguoiDung(nguoiDung);
		}

		Long sach = (Long)attributes.get("sach");

		if (sach != null) {
			setSach(sach);
		}

		Long soLuong = (Long)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Date ngayMuon = (Date)attributes.get("ngayMuon");

		if (ngayMuon != null) {
			setNgayMuon(ngayMuon);
		}

		Date ngayTra = (Date)attributes.get("ngayTra");

		if (ngayTra != null) {
			setNgayTra(ngayTra);
		}

		Long xacNhan = (Long)attributes.get("xacNhan");

		if (xacNhan != null) {
			setXacNhan(xacNhan);
		}

		Long trangThai = (Long)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long duyetMuon = (Long)attributes.get("duyetMuon");

		if (duyetMuon != null) {
			setDuyetMuon(duyetMuon);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_phieumuonRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiDung() {
		return _nguoiDung;
	}

	@Override
	public void setNguoiDung(long nguoiDung) {
		_nguoiDung = nguoiDung;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiDung", long.class);

				method.invoke(_phieumuonRemoteModel, nguoiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSach() {
		return _sach;
	}

	@Override
	public void setSach(long sach) {
		_sach = sach;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setSach", long.class);

				method.invoke(_phieumuonRemoteModel, sach);
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

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", long.class);

				method.invoke(_phieumuonRemoteModel, soLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayMuon() {
		return _ngayMuon;
	}

	@Override
	public void setNgayMuon(Date ngayMuon) {
		_ngayMuon = ngayMuon;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayMuon", Date.class);

				method.invoke(_phieumuonRemoteModel, ngayMuon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTra() {
		return _ngayTra;
	}

	@Override
	public void setNgayTra(Date ngayTra) {
		_ngayTra = ngayTra;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTra", Date.class);

				method.invoke(_phieumuonRemoteModel, ngayTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getXacNhan() {
		return _xacNhan;
	}

	@Override
	public void setXacNhan(long xacNhan) {
		_xacNhan = xacNhan;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setXacNhan", long.class);

				method.invoke(_phieumuonRemoteModel, xacNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(long trangThai) {
		_trangThai = trangThai;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", long.class);

				method.invoke(_phieumuonRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDuyetMuon() {
		return _duyetMuon;
	}

	@Override
	public void setDuyetMuon(long duyetMuon) {
		_duyetMuon = duyetMuon;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setDuyetMuon", long.class);

				method.invoke(_phieumuonRemoteModel, duyetMuon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPhieumuonRemoteModel() {
		return _phieumuonRemoteModel;
	}

	public void setPhieumuonRemoteModel(BaseModel<?> phieumuonRemoteModel) {
		_phieumuonRemoteModel = phieumuonRemoteModel;
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

		Class<?> remoteModelClass = _phieumuonRemoteModel.getClass();

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

		Object returnValue = method.invoke(_phieumuonRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PhieumuonLocalServiceUtil.addPhieumuon(this);
		}
		else {
			PhieumuonLocalServiceUtil.updatePhieumuon(this);
		}
	}

	@Override
	public Phieumuon toEscapedModel() {
		return (Phieumuon)ProxyUtil.newProxyInstance(Phieumuon.class.getClassLoader(),
			new Class[] { Phieumuon.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PhieumuonClp clone = new PhieumuonClp();

		clone.setId(getId());
		clone.setNguoiDung(getNguoiDung());
		clone.setSach(getSach());
		clone.setSoLuong(getSoLuong());
		clone.setNgayMuon(getNgayMuon());
		clone.setNgayTra(getNgayTra());
		clone.setXacNhan(getXacNhan());
		clone.setTrangThai(getTrangThai());
		clone.setDuyetMuon(getDuyetMuon());

		return clone;
	}

	@Override
	public int compareTo(Phieumuon phieumuon) {
		long primaryKey = phieumuon.getPrimaryKey();

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

		if (!(obj instanceof PhieumuonClp)) {
			return false;
		}

		PhieumuonClp phieumuon = (PhieumuonClp)obj;

		long primaryKey = phieumuon.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", nguoiDung=");
		sb.append(getNguoiDung());
		sb.append(", sach=");
		sb.append(getSach());
		sb.append(", soLuong=");
		sb.append(getSoLuong());
		sb.append(", ngayMuon=");
		sb.append(getNgayMuon());
		sb.append(", ngayTra=");
		sb.append(getNgayTra());
		sb.append(", xacNhan=");
		sb.append(getXacNhan());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", duyetMuon=");
		sb.append(getDuyetMuon());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.thuvien.model.Phieumuon");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiDung</column-name><column-value><![CDATA[");
		sb.append(getNguoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sach</column-name><column-value><![CDATA[");
		sb.append(getSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayMuon</column-name><column-value><![CDATA[");
		sb.append(getNgayMuon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTra</column-name><column-value><![CDATA[");
		sb.append(getNgayTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xacNhan</column-name><column-value><![CDATA[");
		sb.append(getXacNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duyetMuon</column-name><column-value><![CDATA[");
		sb.append(getDuyetMuon());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _nguoiDung;
	private long _sach;
	private long _soLuong;
	private Date _ngayMuon;
	private Date _ngayTra;
	private long _xacNhan;
	private long _trangThai;
	private long _duyetMuon;
	private BaseModel<?> _phieumuonRemoteModel;
	private Class<?> _clpSerializerClass = com.thuvien.service.ClpSerializer.class;
}