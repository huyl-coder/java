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
 * This class is a wrapper for {@link VanBanDen}.
 * </p>
 *
 * @author PC
 * @see VanBanDen
 * @generated
 */
public class VanBanDenWrapper implements VanBanDen, ModelWrapper<VanBanDen> {
	public VanBanDenWrapper(VanBanDen vanBanDen) {
		_vanBanDen = vanBanDen;
	}

	@Override
	public Class<?> getModelClass() {
		return VanBanDen.class;
	}

	@Override
	public String getModelClassName() {
		return VanBanDen.class.getName();
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
	* Returns the primary key of this van ban den.
	*
	* @return the primary key of this van ban den
	*/
	@Override
	public long getPrimaryKey() {
		return _vanBanDen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this van ban den.
	*
	* @param primaryKey the primary key of this van ban den
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vanBanDen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this van ban den.
	*
	* @return the ID of this van ban den
	*/
	@Override
	public long getId() {
		return _vanBanDen.getId();
	}

	/**
	* Sets the ID of this van ban den.
	*
	* @param id the ID of this van ban den
	*/
	@Override
	public void setId(long id) {
		_vanBanDen.setId(id);
	}

	/**
	* Returns the so ki hieu of this van ban den.
	*
	* @return the so ki hieu of this van ban den
	*/
	@Override
	public java.lang.String getSoKiHieu() {
		return _vanBanDen.getSoKiHieu();
	}

	/**
	* Sets the so ki hieu of this van ban den.
	*
	* @param soKiHieu the so ki hieu of this van ban den
	*/
	@Override
	public void setSoKiHieu(java.lang.String soKiHieu) {
		_vanBanDen.setSoKiHieu(soKiHieu);
	}

	/**
	* Returns the so van ban ID of this van ban den.
	*
	* @return the so van ban ID of this van ban den
	*/
	@Override
	public long getSoVanBanId() {
		return _vanBanDen.getSoVanBanId();
	}

	/**
	* Sets the so van ban ID of this van ban den.
	*
	* @param soVanBanId the so van ban ID of this van ban den
	*/
	@Override
	public void setSoVanBanId(long soVanBanId) {
		_vanBanDen.setSoVanBanId(soVanBanId);
	}

	/**
	* Returns the loai van ban ID of this van ban den.
	*
	* @return the loai van ban ID of this van ban den
	*/
	@Override
	public long getLoaiVanBanId() {
		return _vanBanDen.getLoaiVanBanId();
	}

	/**
	* Sets the loai van ban ID of this van ban den.
	*
	* @param loaiVanBanId the loai van ban ID of this van ban den
	*/
	@Override
	public void setLoaiVanBanId(long loaiVanBanId) {
		_vanBanDen.setLoaiVanBanId(loaiVanBanId);
	}

	/**
	* Returns the date of this van ban den.
	*
	* @return the date of this van ban den
	*/
	@Override
	public java.util.Date getDate() {
		return _vanBanDen.getDate();
	}

	/**
	* Sets the date of this van ban den.
	*
	* @param date the date of this van ban den
	*/
	@Override
	public void setDate(java.util.Date date) {
		_vanBanDen.setDate(date);
	}

	/**
	* Returns the nguoi ki ID of this van ban den.
	*
	* @return the nguoi ki ID of this van ban den
	*/
	@Override
	public long getNguoiKiId() {
		return _vanBanDen.getNguoiKiId();
	}

	/**
	* Sets the nguoi ki ID of this van ban den.
	*
	* @param nguoiKiId the nguoi ki ID of this van ban den
	*/
	@Override
	public void setNguoiKiId(long nguoiKiId) {
		_vanBanDen.setNguoiKiId(nguoiKiId);
	}

	@Override
	public boolean isNew() {
		return _vanBanDen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vanBanDen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vanBanDen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vanBanDen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vanBanDen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vanBanDen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vanBanDen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vanBanDen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vanBanDen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vanBanDen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vanBanDen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VanBanDenWrapper((VanBanDen)_vanBanDen.clone());
	}

	@Override
	public int compareTo(ispace.model.VanBanDen vanBanDen) {
		return _vanBanDen.compareTo(vanBanDen);
	}

	@Override
	public int hashCode() {
		return _vanBanDen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.VanBanDen> toCacheModel() {
		return _vanBanDen.toCacheModel();
	}

	@Override
	public ispace.model.VanBanDen toEscapedModel() {
		return new VanBanDenWrapper(_vanBanDen.toEscapedModel());
	}

	@Override
	public ispace.model.VanBanDen toUnescapedModel() {
		return new VanBanDenWrapper(_vanBanDen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vanBanDen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vanBanDen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vanBanDen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VanBanDenWrapper)) {
			return false;
		}

		VanBanDenWrapper vanBanDenWrapper = (VanBanDenWrapper)obj;

		if (Validator.equals(_vanBanDen, vanBanDenWrapper._vanBanDen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VanBanDen getWrappedVanBanDen() {
		return _vanBanDen;
	}

	@Override
	public VanBanDen getWrappedModel() {
		return _vanBanDen;
	}

	@Override
	public void resetOriginalValues() {
		_vanBanDen.resetOriginalValues();
	}

	private VanBanDen _vanBanDen;
}