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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link loaivanban}.
 * </p>
 *
 * @author Duy Nguyen
 * @see loaivanban
 * @generated
 */
public class loaivanbanWrapper implements loaivanban, ModelWrapper<loaivanban> {
	public loaivanbanWrapper(loaivanban loaivanban) {
		_loaivanban = loaivanban;
	}

	@Override
	public Class<?> getModelClass() {
		return loaivanban.class;
	}

	@Override
	public String getModelClassName() {
		return loaivanban.class.getName();
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

	/**
	* Returns the primary key of this loaivanban.
	*
	* @return the primary key of this loaivanban
	*/
	@Override
	public long getPrimaryKey() {
		return _loaivanban.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loaivanban.
	*
	* @param primaryKey the primary key of this loaivanban
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_loaivanban.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this loaivanban.
	*
	* @return the ID of this loaivanban
	*/
	@Override
	public long getId() {
		return _loaivanban.getId();
	}

	/**
	* Sets the ID of this loaivanban.
	*
	* @param id the ID of this loaivanban
	*/
	@Override
	public void setId(long id) {
		_loaivanban.setId(id);
	}

	/**
	* Returns the ten of this loaivanban.
	*
	* @return the ten of this loaivanban
	*/
	@Override
	public java.lang.String getTen() {
		return _loaivanban.getTen();
	}

	/**
	* Sets the ten of this loaivanban.
	*
	* @param ten the ten of this loaivanban
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_loaivanban.setTen(ten);
	}

	@Override
	public boolean isNew() {
		return _loaivanban.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_loaivanban.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _loaivanban.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_loaivanban.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _loaivanban.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _loaivanban.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loaivanban.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loaivanban.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_loaivanban.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_loaivanban.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loaivanban.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new loaivanbanWrapper((loaivanban)_loaivanban.clone());
	}

	@Override
	public int compareTo(com.test.model.loaivanban loaivanban) {
		return _loaivanban.compareTo(loaivanban);
	}

	@Override
	public int hashCode() {
		return _loaivanban.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.loaivanban> toCacheModel() {
		return _loaivanban.toCacheModel();
	}

	@Override
	public com.test.model.loaivanban toEscapedModel() {
		return new loaivanbanWrapper(_loaivanban.toEscapedModel());
	}

	@Override
	public com.test.model.loaivanban toUnescapedModel() {
		return new loaivanbanWrapper(_loaivanban.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loaivanban.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _loaivanban.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaivanban.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof loaivanbanWrapper)) {
			return false;
		}

		loaivanbanWrapper loaivanbanWrapper = (loaivanbanWrapper)obj;

		if (Validator.equals(_loaivanban, loaivanbanWrapper._loaivanban)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public loaivanban getWrappedloaivanban() {
		return _loaivanban;
	}

	@Override
	public loaivanban getWrappedModel() {
		return _loaivanban;
	}

	@Override
	public void resetOriginalValues() {
		_loaivanban.resetOriginalValues();
	}

	private loaivanban _loaivanban;
}