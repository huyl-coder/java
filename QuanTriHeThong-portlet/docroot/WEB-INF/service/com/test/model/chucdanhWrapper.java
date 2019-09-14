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
 * This class is a wrapper for {@link chucdanh}.
 * </p>
 *
 * @author Duy Nguyen
 * @see chucdanh
 * @generated
 */
public class chucdanhWrapper implements chucdanh, ModelWrapper<chucdanh> {
	public chucdanhWrapper(chucdanh chucdanh) {
		_chucdanh = chucdanh;
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

	/**
	* Returns the primary key of this chucdanh.
	*
	* @return the primary key of this chucdanh
	*/
	@Override
	public long getPrimaryKey() {
		return _chucdanh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this chucdanh.
	*
	* @param primaryKey the primary key of this chucdanh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_chucdanh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this chucdanh.
	*
	* @return the ID of this chucdanh
	*/
	@Override
	public long getId() {
		return _chucdanh.getId();
	}

	/**
	* Sets the ID of this chucdanh.
	*
	* @param id the ID of this chucdanh
	*/
	@Override
	public void setId(long id) {
		_chucdanh.setId(id);
	}

	/**
	* Returns the ten of this chucdanh.
	*
	* @return the ten of this chucdanh
	*/
	@Override
	public java.lang.String getTen() {
		return _chucdanh.getTen();
	}

	/**
	* Sets the ten of this chucdanh.
	*
	* @param ten the ten of this chucdanh
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_chucdanh.setTen(ten);
	}

	/**
	* Returns the ma of this chucdanh.
	*
	* @return the ma of this chucdanh
	*/
	@Override
	public java.lang.String getMa() {
		return _chucdanh.getMa();
	}

	/**
	* Sets the ma of this chucdanh.
	*
	* @param ma the ma of this chucdanh
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_chucdanh.setMa(ma);
	}

	@Override
	public boolean isNew() {
		return _chucdanh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_chucdanh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _chucdanh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_chucdanh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _chucdanh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _chucdanh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_chucdanh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _chucdanh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_chucdanh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_chucdanh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_chucdanh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new chucdanhWrapper((chucdanh)_chucdanh.clone());
	}

	@Override
	public int compareTo(com.test.model.chucdanh chucdanh) {
		return _chucdanh.compareTo(chucdanh);
	}

	@Override
	public int hashCode() {
		return _chucdanh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.chucdanh> toCacheModel() {
		return _chucdanh.toCacheModel();
	}

	@Override
	public com.test.model.chucdanh toEscapedModel() {
		return new chucdanhWrapper(_chucdanh.toEscapedModel());
	}

	@Override
	public com.test.model.chucdanh toUnescapedModel() {
		return new chucdanhWrapper(_chucdanh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _chucdanh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _chucdanh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_chucdanh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof chucdanhWrapper)) {
			return false;
		}

		chucdanhWrapper chucdanhWrapper = (chucdanhWrapper)obj;

		if (Validator.equals(_chucdanh, chucdanhWrapper._chucdanh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public chucdanh getWrappedchucdanh() {
		return _chucdanh;
	}

	@Override
	public chucdanh getWrappedModel() {
		return _chucdanh;
	}

	@Override
	public void resetOriginalValues() {
		_chucdanh.resetOriginalValues();
	}

	private chucdanh _chucdanh;
}