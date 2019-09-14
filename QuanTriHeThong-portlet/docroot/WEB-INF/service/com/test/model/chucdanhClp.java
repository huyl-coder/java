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

package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.ClpSerializer;
import com.test.service.chucdanhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Duy Nguyen
 */
public class chucdanhClp extends BaseModelImpl<chucdanh> implements chucdanh {
	public chucdanhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return chucdanh.class;
	}

	@Override
	public String getModelClassName() {
		return chucdanh.class.getName();
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
		attributes.put("ma", getMa());

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

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_chucdanhRemoteModel != null) {
			try {
				Class<?> clazz = _chucdanhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_chucdanhRemoteModel, id);
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

		if (_chucdanhRemoteModel != null) {
			try {
				Class<?> clazz = _chucdanhRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_chucdanhRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMa() {
		return _ma;
	}

	@Override
	public void setMa(String ma) {
		_ma = ma;

		if (_chucdanhRemoteModel != null) {
			try {
				Class<?> clazz = _chucdanhRemoteModel.getClass();

				Method method = clazz.getMethod("setMa", String.class);

				method.invoke(_chucdanhRemoteModel, ma);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getchucdanhRemoteModel() {
		return _chucdanhRemoteModel;
	}

	public void setchucdanhRemoteModel(BaseModel<?> chucdanhRemoteModel) {
		_chucdanhRemoteModel = chucdanhRemoteModel;
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

		Class<?> remoteModelClass = _chucdanhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_chucdanhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			chucdanhLocalServiceUtil.addchucdanh(this);
		}
		else {
			chucdanhLocalServiceUtil.updatechucdanh(this);
		}
	}

	@Override
	public chucdanh toEscapedModel() {
		return (chucdanh)ProxyUtil.newProxyInstance(chucdanh.class.getClassLoader(),
			new Class[] { chucdanh.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		chucdanhClp clone = new chucdanhClp();

		clone.setId(getId());
		clone.setTen(getTen());
		clone.setMa(getMa());

		return clone;
	}

	@Override
	public int compareTo(chucdanh chucdanh) {
		long primaryKey = chucdanh.getPrimaryKey();

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

		if (!(obj instanceof chucdanhClp)) {
			return false;
		}

		chucdanhClp chucdanh = (chucdanhClp)obj;

		long primaryKey = chucdanh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.test.model.chucdanh");
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
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _ten;
	private String _ma;
	private BaseModel<?> _chucdanhRemoteModel;
	private Class<?> _clpSerializerClass = com.test.service.ClpSerializer.class;
}