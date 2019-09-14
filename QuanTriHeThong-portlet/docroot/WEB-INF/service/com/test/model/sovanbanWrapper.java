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
 * This class is a wrapper for {@link sovanban}.
 * </p>
 *
 * @author Duy Nguyen
 * @see sovanban
 * @generated
 */
public class sovanbanWrapper implements sovanban, ModelWrapper<sovanban> {
	public sovanbanWrapper(sovanban sovanban) {
		_sovanban = sovanban;
	}

	@Override
	public Class<?> getModelClass() {
		return sovanban.class;
	}

	@Override
	public String getModelClassName() {
		return sovanban.class.getName();
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
	* Returns the primary key of this sovanban.
	*
	* @return the primary key of this sovanban
	*/
	@Override
	public long getPrimaryKey() {
		return _sovanban.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sovanban.
	*
	* @param primaryKey the primary key of this sovanban
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sovanban.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this sovanban.
	*
	* @return the ID of this sovanban
	*/
	@Override
	public long getId() {
		return _sovanban.getId();
	}

	/**
	* Sets the ID of this sovanban.
	*
	* @param id the ID of this sovanban
	*/
	@Override
	public void setId(long id) {
		_sovanban.setId(id);
	}

	/**
	* Returns the ten of this sovanban.
	*
	* @return the ten of this sovanban
	*/
	@Override
	public java.lang.String getTen() {
		return _sovanban.getTen();
	}

	/**
	* Sets the ten of this sovanban.
	*
	* @param ten the ten of this sovanban
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_sovanban.setTen(ten);
	}

	@Override
	public boolean isNew() {
		return _sovanban.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sovanban.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sovanban.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sovanban.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sovanban.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sovanban.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sovanban.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sovanban.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sovanban.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sovanban.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sovanban.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new sovanbanWrapper((sovanban)_sovanban.clone());
	}

	@Override
	public int compareTo(com.test.model.sovanban sovanban) {
		return _sovanban.compareTo(sovanban);
	}

	@Override
	public int hashCode() {
		return _sovanban.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.sovanban> toCacheModel() {
		return _sovanban.toCacheModel();
	}

	@Override
	public com.test.model.sovanban toEscapedModel() {
		return new sovanbanWrapper(_sovanban.toEscapedModel());
	}

	@Override
	public com.test.model.sovanban toUnescapedModel() {
		return new sovanbanWrapper(_sovanban.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sovanban.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sovanban.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sovanban.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof sovanbanWrapper)) {
			return false;
		}

		sovanbanWrapper sovanbanWrapper = (sovanbanWrapper)obj;

		if (Validator.equals(_sovanban, sovanbanWrapper._sovanban)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public sovanban getWrappedsovanban() {
		return _sovanban;
	}

	@Override
	public sovanban getWrappedModel() {
		return _sovanban;
	}

	@Override
	public void resetOriginalValues() {
		_sovanban.resetOriginalValues();
	}

	private sovanban _sovanban;
}