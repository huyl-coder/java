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
import ispace.service.KieuVanBanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PC
 */
public class KieuVanBanClp extends BaseModelImpl<KieuVanBan>
	implements KieuVanBan {
	public KieuVanBanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KieuVanBan.class;
	}

	@Override
	public String getModelClassName() {
		return KieuVanBan.class.getName();
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
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_kieuVanBanRemoteModel != null) {
			try {
				Class<?> clazz = _kieuVanBanRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_kieuVanBanRemoteModel, id);
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

		if (_kieuVanBanRemoteModel != null) {
			try {
				Class<?> clazz = _kieuVanBanRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_kieuVanBanRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKieuVanBanRemoteModel() {
		return _kieuVanBanRemoteModel;
	}

	public void setKieuVanBanRemoteModel(BaseModel<?> kieuVanBanRemoteModel) {
		_kieuVanBanRemoteModel = kieuVanBanRemoteModel;
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

		Class<?> remoteModelClass = _kieuVanBanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_kieuVanBanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KieuVanBanLocalServiceUtil.addKieuVanBan(this);
		}
		else {
			KieuVanBanLocalServiceUtil.updateKieuVanBan(this);
		}
	}

	@Override
	public KieuVanBan toEscapedModel() {
		return (KieuVanBan)ProxyUtil.newProxyInstance(KieuVanBan.class.getClassLoader(),
			new Class[] { KieuVanBan.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KieuVanBanClp clone = new KieuVanBanClp();

		clone.setId(getId());
		clone.setTen(getTen());

		return clone;
	}

	@Override
	public int compareTo(KieuVanBan kieuVanBan) {
		long primaryKey = kieuVanBan.getPrimaryKey();

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

		if (!(obj instanceof KieuVanBanClp)) {
			return false;
		}

		KieuVanBanClp kieuVanBan = (KieuVanBanClp)obj;

		long primaryKey = kieuVanBan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("ispace.model.KieuVanBan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _ten;
	private BaseModel<?> _kieuVanBanRemoteModel;
	private Class<?> _clpSerializerClass = ispace.service.ClpSerializer.class;
}