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
import ispace.service.VanBanDenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author PC
 */
public class VanBanDenClp extends BaseModelImpl<VanBanDen> implements VanBanDen {
	public VanBanDenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VanBanDen.class;
	}

	@Override
	public String getModelClassName() {
		return VanBanDen.class.getName();
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
		attributes.put("soKiHieu", getSoKiHieu());
		attributes.put("soVanBanId", getSoVanBanId());
		attributes.put("loaiVanBanId", getLoaiVanBanId());
		attributes.put("date", getDate());
		attributes.put("nguoiKiId", getNguoiKiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String soKiHieu = (String)attributes.get("soKiHieu");

		if (soKiHieu != null) {
			setSoKiHieu(soKiHieu);
		}

		Long soVanBanId = (Long)attributes.get("soVanBanId");

		if (soVanBanId != null) {
			setSoVanBanId(soVanBanId);
		}

		Long loaiVanBanId = (Long)attributes.get("loaiVanBanId");

		if (loaiVanBanId != null) {
			setLoaiVanBanId(loaiVanBanId);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Long nguoiKiId = (Long)attributes.get("nguoiKiId");

		if (nguoiKiId != null) {
			setNguoiKiId(nguoiKiId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_vanBanDenRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoKiHieu() {
		return _soKiHieu;
	}

	@Override
	public void setSoKiHieu(String soKiHieu) {
		_soKiHieu = soKiHieu;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKiHieu", String.class);

				method.invoke(_vanBanDenRemoteModel, soKiHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoVanBanId() {
		return _soVanBanId;
	}

	@Override
	public void setSoVanBanId(long soVanBanId) {
		_soVanBanId = soVanBanId;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setSoVanBanId", long.class);

				method.invoke(_vanBanDenRemoteModel, soVanBanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiVanBanId() {
		return _loaiVanBanId;
	}

	@Override
	public void setLoaiVanBanId(long loaiVanBanId) {
		_loaiVanBanId = loaiVanBanId;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiVanBanId", long.class);

				method.invoke(_vanBanDenRemoteModel, loaiVanBanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public void setDate(Date date) {
		_date = date;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", Date.class);

				method.invoke(_vanBanDenRemoteModel, date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiKiId() {
		return _nguoiKiId;
	}

	@Override
	public void setNguoiKiId(long nguoiKiId) {
		_nguoiKiId = nguoiKiId;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiKiId", long.class);

				method.invoke(_vanBanDenRemoteModel, nguoiKiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVanBanDenRemoteModel() {
		return _vanBanDenRemoteModel;
	}

	public void setVanBanDenRemoteModel(BaseModel<?> vanBanDenRemoteModel) {
		_vanBanDenRemoteModel = vanBanDenRemoteModel;
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

		Class<?> remoteModelClass = _vanBanDenRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vanBanDenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VanBanDenLocalServiceUtil.addVanBanDen(this);
		}
		else {
			VanBanDenLocalServiceUtil.updateVanBanDen(this);
		}
	}

	@Override
	public VanBanDen toEscapedModel() {
		return (VanBanDen)ProxyUtil.newProxyInstance(VanBanDen.class.getClassLoader(),
			new Class[] { VanBanDen.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VanBanDenClp clone = new VanBanDenClp();

		clone.setId(getId());
		clone.setSoKiHieu(getSoKiHieu());
		clone.setSoVanBanId(getSoVanBanId());
		clone.setLoaiVanBanId(getLoaiVanBanId());
		clone.setDate(getDate());
		clone.setNguoiKiId(getNguoiKiId());

		return clone;
	}

	@Override
	public int compareTo(VanBanDen vanBanDen) {
		long primaryKey = vanBanDen.getPrimaryKey();

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

		if (!(obj instanceof VanBanDenClp)) {
			return false;
		}

		VanBanDenClp vanBanDen = (VanBanDenClp)obj;

		long primaryKey = vanBanDen.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", soKiHieu=");
		sb.append(getSoKiHieu());
		sb.append(", soVanBanId=");
		sb.append(getSoVanBanId());
		sb.append(", loaiVanBanId=");
		sb.append(getLoaiVanBanId());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", nguoiKiId=");
		sb.append(getNguoiKiId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("ispace.model.VanBanDen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soKiHieu</column-name><column-value><![CDATA[");
		sb.append(getSoKiHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soVanBanId</column-name><column-value><![CDATA[");
		sb.append(getSoVanBanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiVanBanId</column-name><column-value><![CDATA[");
		sb.append(getLoaiVanBanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiKiId</column-name><column-value><![CDATA[");
		sb.append(getNguoiKiId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _soKiHieu;
	private long _soVanBanId;
	private long _loaiVanBanId;
	private Date _date;
	private long _nguoiKiId;
	private BaseModel<?> _vanBanDenRemoteModel;
	private Class<?> _clpSerializerClass = ispace.service.ClpSerializer.class;
}