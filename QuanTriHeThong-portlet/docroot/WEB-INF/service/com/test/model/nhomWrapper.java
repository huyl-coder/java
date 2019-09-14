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
 * This class is a wrapper for {@link nhom}.
 * </p>
 *
 * @author Duy Nguyen
 * @see nhom
 * @generated
 */
public class nhomWrapper implements nhom, ModelWrapper<nhom> {
	public nhomWrapper(nhom nhom) {
		_nhom = nhom;
	}

	@Override
	public Class<?> getModelClass() {
		return nhom.class;
	}

	@Override
	public String getModelClassName() {
		return nhom.class.getName();
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
	* Returns the primary key of this nhom.
	*
	* @return the primary key of this nhom
	*/
	@Override
	public long getPrimaryKey() {
		return _nhom.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nhom.
	*
	* @param primaryKey the primary key of this nhom
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhom.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this nhom.
	*
	* @return the ID of this nhom
	*/
	@Override
	public long getId() {
		return _nhom.getId();
	}

	/**
	* Sets the ID of this nhom.
	*
	* @param id the ID of this nhom
	*/
	@Override
	public void setId(long id) {
		_nhom.setId(id);
	}

	/**
	* Returns the ten of this nhom.
	*
	* @return the ten of this nhom
	*/
	@Override
	public java.lang.String getTen() {
		return _nhom.getTen();
	}

	/**
	* Sets the ten of this nhom.
	*
	* @param ten the ten of this nhom
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_nhom.setTen(ten);
	}

	@Override
	public boolean isNew() {
		return _nhom.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhom.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhom.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhom.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhom.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhom.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhom.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhom.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhom.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhom.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhom.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new nhomWrapper((nhom)_nhom.clone());
	}

	@Override
	public int compareTo(com.test.model.nhom nhom) {
		return _nhom.compareTo(nhom);
	}

	@Override
	public int hashCode() {
		return _nhom.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.nhom> toCacheModel() {
		return _nhom.toCacheModel();
	}

	@Override
	public com.test.model.nhom toEscapedModel() {
		return new nhomWrapper(_nhom.toEscapedModel());
	}

	@Override
	public com.test.model.nhom toUnescapedModel() {
		return new nhomWrapper(_nhom.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhom.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhom.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhom.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof nhomWrapper)) {
			return false;
		}

		nhomWrapper nhomWrapper = (nhomWrapper)obj;

		if (Validator.equals(_nhom, nhomWrapper._nhom)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public nhom getWrappednhom() {
		return _nhom;
	}

	@Override
	public nhom getWrappedModel() {
		return _nhom;
	}

	@Override
	public void resetOriginalValues() {
		_nhom.resetOriginalValues();
	}

	private nhom _nhom;
}