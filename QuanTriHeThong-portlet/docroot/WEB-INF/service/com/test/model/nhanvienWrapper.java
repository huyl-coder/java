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
 * This class is a wrapper for {@link nhanvien}.
 * </p>
 *
 * @author Duy Nguyen
 * @see nhanvien
 * @generated
 */
public class nhanvienWrapper implements nhanvien, ModelWrapper<nhanvien> {
	public nhanvienWrapper(nhanvien nhanvien) {
		_nhanvien = nhanvien;
	}

	@Override
	public Class<?> getModelClass() {
		return nhanvien.class;
	}

	@Override
	public String getModelClassName() {
		return nhanvien.class.getName();
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
	* Returns the primary key of this nhanvien.
	*
	* @return the primary key of this nhanvien
	*/
	@Override
	public long getPrimaryKey() {
		return _nhanvien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nhanvien.
	*
	* @param primaryKey the primary key of this nhanvien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhanvien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this nhanvien.
	*
	* @return the ID of this nhanvien
	*/
	@Override
	public long getId() {
		return _nhanvien.getId();
	}

	/**
	* Sets the ID of this nhanvien.
	*
	* @param id the ID of this nhanvien
	*/
	@Override
	public void setId(long id) {
		_nhanvien.setId(id);
	}

	/**
	* Returns the ten of this nhanvien.
	*
	* @return the ten of this nhanvien
	*/
	@Override
	public java.lang.String getTen() {
		return _nhanvien.getTen();
	}

	/**
	* Sets the ten of this nhanvien.
	*
	* @param ten the ten of this nhanvien
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_nhanvien.setTen(ten);
	}

	@Override
	public boolean isNew() {
		return _nhanvien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhanvien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhanvien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhanvien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhanvien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhanvien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhanvien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhanvien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhanvien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhanvien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhanvien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new nhanvienWrapper((nhanvien)_nhanvien.clone());
	}

	@Override
	public int compareTo(com.test.model.nhanvien nhanvien) {
		return _nhanvien.compareTo(nhanvien);
	}

	@Override
	public int hashCode() {
		return _nhanvien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.nhanvien> toCacheModel() {
		return _nhanvien.toCacheModel();
	}

	@Override
	public com.test.model.nhanvien toEscapedModel() {
		return new nhanvienWrapper(_nhanvien.toEscapedModel());
	}

	@Override
	public com.test.model.nhanvien toUnescapedModel() {
		return new nhanvienWrapper(_nhanvien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhanvien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhanvien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhanvien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof nhanvienWrapper)) {
			return false;
		}

		nhanvienWrapper nhanvienWrapper = (nhanvienWrapper)obj;

		if (Validator.equals(_nhanvien, nhanvienWrapper._nhanvien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public nhanvien getWrappednhanvien() {
		return _nhanvien;
	}

	@Override
	public nhanvien getWrappedModel() {
		return _nhanvien;
	}

	@Override
	public void resetOriginalValues() {
		_nhanvien.resetOriginalValues();
	}

	private nhanvien _nhanvien;
}