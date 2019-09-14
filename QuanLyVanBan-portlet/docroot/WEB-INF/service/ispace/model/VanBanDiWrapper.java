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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VanBanDi}.
 * </p>
 *
 * @author PC
 * @see VanBanDi
 * @generated
 */
public class VanBanDiWrapper implements VanBanDi, ModelWrapper<VanBanDi> {
	public VanBanDiWrapper(VanBanDi vanBanDi) {
		_vanBanDi = vanBanDi;
	}

	@Override
	public Class<?> getModelClass() {
		return VanBanDi.class;
	}

	@Override
	public String getModelClassName() {
		return VanBanDi.class.getName();
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

	/**
	* Returns the primary key of this van ban di.
	*
	* @return the primary key of this van ban di
	*/
	@Override
	public long getPrimaryKey() {
		return _vanBanDi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this van ban di.
	*
	* @param primaryKey the primary key of this van ban di
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vanBanDi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this van ban di.
	*
	* @return the ID of this van ban di
	*/
	@Override
	public long getId() {
		return _vanBanDi.getId();
	}

	/**
	* Sets the ID of this van ban di.
	*
	* @param id the ID of this van ban di
	*/
	@Override
	public void setId(long id) {
		_vanBanDi.setId(id);
	}

	/**
	* Returns the so ki hieu of this van ban di.
	*
	* @return the so ki hieu of this van ban di
	*/
	@Override
	public java.lang.String getSoKiHieu() {
		return _vanBanDi.getSoKiHieu();
	}

	/**
	* Sets the so ki hieu of this van ban di.
	*
	* @param soKiHieu the so ki hieu of this van ban di
	*/
	@Override
	public void setSoKiHieu(java.lang.String soKiHieu) {
		_vanBanDi.setSoKiHieu(soKiHieu);
	}

	/**
	* Returns the so van ban ID of this van ban di.
	*
	* @return the so van ban ID of this van ban di
	*/
	@Override
	public long getSoVanBanId() {
		return _vanBanDi.getSoVanBanId();
	}

	/**
	* Sets the so van ban ID of this van ban di.
	*
	* @param soVanBanId the so van ban ID of this van ban di
	*/
	@Override
	public void setSoVanBanId(long soVanBanId) {
		_vanBanDi.setSoVanBanId(soVanBanId);
	}

	/**
	* Returns the loai van ban ID of this van ban di.
	*
	* @return the loai van ban ID of this van ban di
	*/
	@Override
	public long getLoaiVanBanId() {
		return _vanBanDi.getLoaiVanBanId();
	}

	/**
	* Sets the loai van ban ID of this van ban di.
	*
	* @param loaiVanBanId the loai van ban ID of this van ban di
	*/
	@Override
	public void setLoaiVanBanId(long loaiVanBanId) {
		_vanBanDi.setLoaiVanBanId(loaiVanBanId);
	}

	/**
	* Returns the date of this van ban di.
	*
	* @return the date of this van ban di
	*/
	@Override
	public java.util.Date getDate() {
		return _vanBanDi.getDate();
	}

	/**
	* Sets the date of this van ban di.
	*
	* @param date the date of this van ban di
	*/
	@Override
	public void setDate(java.util.Date date) {
		_vanBanDi.setDate(date);
	}

	/**
	* Returns the nguoi ki ID of this van ban di.
	*
	* @return the nguoi ki ID of this van ban di
	*/
	@Override
	public long getNguoiKiId() {
		return _vanBanDi.getNguoiKiId();
	}

	/**
	* Sets the nguoi ki ID of this van ban di.
	*
	* @param nguoiKiId the nguoi ki ID of this van ban di
	*/
	@Override
	public void setNguoiKiId(long nguoiKiId) {
		_vanBanDi.setNguoiKiId(nguoiKiId);
	}

	@Override
	public boolean isNew() {
		return _vanBanDi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vanBanDi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vanBanDi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vanBanDi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vanBanDi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vanBanDi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vanBanDi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vanBanDi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vanBanDi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vanBanDi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vanBanDi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VanBanDiWrapper((VanBanDi)_vanBanDi.clone());
	}

	@Override
	public int compareTo(ispace.model.VanBanDi vanBanDi) {
		return _vanBanDi.compareTo(vanBanDi);
	}

	@Override
	public int hashCode() {
		return _vanBanDi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.VanBanDi> toCacheModel() {
		return _vanBanDi.toCacheModel();
	}

	@Override
	public ispace.model.VanBanDi toEscapedModel() {
		return new VanBanDiWrapper(_vanBanDi.toEscapedModel());
	}

	@Override
	public ispace.model.VanBanDi toUnescapedModel() {
		return new VanBanDiWrapper(_vanBanDi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vanBanDi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vanBanDi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vanBanDi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VanBanDiWrapper)) {
			return false;
		}

		VanBanDiWrapper vanBanDiWrapper = (VanBanDiWrapper)obj;

		if (Validator.equals(_vanBanDi, vanBanDiWrapper._vanBanDi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VanBanDi getWrappedVanBanDi() {
		return _vanBanDi;
	}

	@Override
	public VanBanDi getWrappedModel() {
		return _vanBanDi;
	}

	@Override
	public void resetOriginalValues() {
		_vanBanDi.resetOriginalValues();
	}

	private VanBanDi _vanBanDi;
}