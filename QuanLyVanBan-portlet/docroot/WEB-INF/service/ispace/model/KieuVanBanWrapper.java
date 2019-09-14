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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KieuVanBan}.
 * </p>
 *
 * @author PC
 * @see KieuVanBan
 * @generated
 */
public class KieuVanBanWrapper implements KieuVanBan, ModelWrapper<KieuVanBan> {
	public KieuVanBanWrapper(KieuVanBan kieuVanBan) {
		_kieuVanBan = kieuVanBan;
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
	* Returns the primary key of this kieu van ban.
	*
	* @return the primary key of this kieu van ban
	*/
	@Override
	public long getPrimaryKey() {
		return _kieuVanBan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kieu van ban.
	*
	* @param primaryKey the primary key of this kieu van ban
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_kieuVanBan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this kieu van ban.
	*
	* @return the ID of this kieu van ban
	*/
	@Override
	public long getId() {
		return _kieuVanBan.getId();
	}

	/**
	* Sets the ID of this kieu van ban.
	*
	* @param id the ID of this kieu van ban
	*/
	@Override
	public void setId(long id) {
		_kieuVanBan.setId(id);
	}

	/**
	* Returns the ten of this kieu van ban.
	*
	* @return the ten of this kieu van ban
	*/
	@Override
	public java.lang.String getTen() {
		return _kieuVanBan.getTen();
	}

	/**
	* Sets the ten of this kieu van ban.
	*
	* @param ten the ten of this kieu van ban
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_kieuVanBan.setTen(ten);
	}

	@Override
	public boolean isNew() {
		return _kieuVanBan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_kieuVanBan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _kieuVanBan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_kieuVanBan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _kieuVanBan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _kieuVanBan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_kieuVanBan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kieuVanBan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_kieuVanBan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_kieuVanBan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kieuVanBan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KieuVanBanWrapper((KieuVanBan)_kieuVanBan.clone());
	}

	@Override
	public int compareTo(ispace.model.KieuVanBan kieuVanBan) {
		return _kieuVanBan.compareTo(kieuVanBan);
	}

	@Override
	public int hashCode() {
		return _kieuVanBan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.KieuVanBan> toCacheModel() {
		return _kieuVanBan.toCacheModel();
	}

	@Override
	public ispace.model.KieuVanBan toEscapedModel() {
		return new KieuVanBanWrapper(_kieuVanBan.toEscapedModel());
	}

	@Override
	public ispace.model.KieuVanBan toUnescapedModel() {
		return new KieuVanBanWrapper(_kieuVanBan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _kieuVanBan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _kieuVanBan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_kieuVanBan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KieuVanBanWrapper)) {
			return false;
		}

		KieuVanBanWrapper kieuVanBanWrapper = (KieuVanBanWrapper)obj;

		if (Validator.equals(_kieuVanBan, kieuVanBanWrapper._kieuVanBan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KieuVanBan getWrappedKieuVanBan() {
		return _kieuVanBan;
	}

	@Override
	public KieuVanBan getWrappedModel() {
		return _kieuVanBan;
	}

	@Override
	public void resetOriginalValues() {
		_kieuVanBan.resetOriginalValues();
	}

	private KieuVanBan _kieuVanBan;
}