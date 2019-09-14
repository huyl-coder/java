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
 * This class is a wrapper for {@link phongban}.
 * </p>
 *
 * @author Duy Nguyen
 * @see phongban
 * @generated
 */
public class phongbanWrapper implements phongban, ModelWrapper<phongban> {
	public phongbanWrapper(phongban phongban) {
		_phongban = phongban;
	}

	@Override
	public Class<?> getModelClass() {
		return phongban.class;
	}

	@Override
	public String getModelClassName() {
		return phongban.class.getName();
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
	* Returns the primary key of this phongban.
	*
	* @return the primary key of this phongban
	*/
	@Override
	public long getPrimaryKey() {
		return _phongban.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phongban.
	*
	* @param primaryKey the primary key of this phongban
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phongban.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phongban.
	*
	* @return the ID of this phongban
	*/
	@Override
	public long getId() {
		return _phongban.getId();
	}

	/**
	* Sets the ID of this phongban.
	*
	* @param id the ID of this phongban
	*/
	@Override
	public void setId(long id) {
		_phongban.setId(id);
	}

	/**
	* Returns the ten of this phongban.
	*
	* @return the ten of this phongban
	*/
	@Override
	public java.lang.String getTen() {
		return _phongban.getTen();
	}

	/**
	* Sets the ten of this phongban.
	*
	* @param ten the ten of this phongban
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_phongban.setTen(ten);
	}

	@Override
	public boolean isNew() {
		return _phongban.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phongban.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phongban.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phongban.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phongban.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phongban.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phongban.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phongban.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phongban.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phongban.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phongban.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new phongbanWrapper((phongban)_phongban.clone());
	}

	@Override
	public int compareTo(com.test.model.phongban phongban) {
		return _phongban.compareTo(phongban);
	}

	@Override
	public int hashCode() {
		return _phongban.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.phongban> toCacheModel() {
		return _phongban.toCacheModel();
	}

	@Override
	public com.test.model.phongban toEscapedModel() {
		return new phongbanWrapper(_phongban.toEscapedModel());
	}

	@Override
	public com.test.model.phongban toUnescapedModel() {
		return new phongbanWrapper(_phongban.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phongban.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phongban.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phongban.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof phongbanWrapper)) {
			return false;
		}

		phongbanWrapper phongbanWrapper = (phongbanWrapper)obj;

		if (Validator.equals(_phongban, phongbanWrapper._phongban)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public phongban getWrappedphongban() {
		return _phongban;
	}

	@Override
	public phongban getWrappedModel() {
		return _phongban;
	}

	@Override
	public void resetOriginalValues() {
		_phongban.resetOriginalValues();
	}

	private phongban _phongban;
}