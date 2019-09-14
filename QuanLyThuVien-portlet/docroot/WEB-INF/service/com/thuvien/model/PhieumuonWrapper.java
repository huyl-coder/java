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

package com.thuvien.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Phieumuon}.
 * </p>
 *
 * @author PC
 * @see Phieumuon
 * @generated
 */
public class PhieumuonWrapper implements Phieumuon, ModelWrapper<Phieumuon> {
	public PhieumuonWrapper(Phieumuon phieumuon) {
		_phieumuon = phieumuon;
	}

	@Override
	public Class<?> getModelClass() {
		return Phieumuon.class;
	}

	@Override
	public String getModelClassName() {
		return Phieumuon.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nguoiDung", getNguoiDung());
		attributes.put("sach", getSach());
		attributes.put("soLuong", getSoLuong());
		attributes.put("ngayMuon", getNgayMuon());
		attributes.put("ngayTra", getNgayTra());
		attributes.put("xacNhan", getXacNhan());
		attributes.put("trangThai", getTrangThai());
		attributes.put("duyetMuon", getDuyetMuon());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long nguoiDung = (Long)attributes.get("nguoiDung");

		if (nguoiDung != null) {
			setNguoiDung(nguoiDung);
		}

		Long sach = (Long)attributes.get("sach");

		if (sach != null) {
			setSach(sach);
		}

		Long soLuong = (Long)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Date ngayMuon = (Date)attributes.get("ngayMuon");

		if (ngayMuon != null) {
			setNgayMuon(ngayMuon);
		}

		Date ngayTra = (Date)attributes.get("ngayTra");

		if (ngayTra != null) {
			setNgayTra(ngayTra);
		}

		Long xacNhan = (Long)attributes.get("xacNhan");

		if (xacNhan != null) {
			setXacNhan(xacNhan);
		}

		Long trangThai = (Long)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long duyetMuon = (Long)attributes.get("duyetMuon");

		if (duyetMuon != null) {
			setDuyetMuon(duyetMuon);
		}
	}

	/**
	* Returns the primary key of this phieumuon.
	*
	* @return the primary key of this phieumuon
	*/
	@Override
	public long getPrimaryKey() {
		return _phieumuon.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phieumuon.
	*
	* @param primaryKey the primary key of this phieumuon
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phieumuon.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phieumuon.
	*
	* @return the ID of this phieumuon
	*/
	@Override
	public long getId() {
		return _phieumuon.getId();
	}

	/**
	* Sets the ID of this phieumuon.
	*
	* @param id the ID of this phieumuon
	*/
	@Override
	public void setId(long id) {
		_phieumuon.setId(id);
	}

	/**
	* Returns the nguoi dung of this phieumuon.
	*
	* @return the nguoi dung of this phieumuon
	*/
	@Override
	public long getNguoiDung() {
		return _phieumuon.getNguoiDung();
	}

	/**
	* Sets the nguoi dung of this phieumuon.
	*
	* @param nguoiDung the nguoi dung of this phieumuon
	*/
	@Override
	public void setNguoiDung(long nguoiDung) {
		_phieumuon.setNguoiDung(nguoiDung);
	}

	/**
	* Returns the sach of this phieumuon.
	*
	* @return the sach of this phieumuon
	*/
	@Override
	public long getSach() {
		return _phieumuon.getSach();
	}

	/**
	* Sets the sach of this phieumuon.
	*
	* @param sach the sach of this phieumuon
	*/
	@Override
	public void setSach(long sach) {
		_phieumuon.setSach(sach);
	}

	/**
	* Returns the so luong of this phieumuon.
	*
	* @return the so luong of this phieumuon
	*/
	@Override
	public long getSoLuong() {
		return _phieumuon.getSoLuong();
	}

	/**
	* Sets the so luong of this phieumuon.
	*
	* @param soLuong the so luong of this phieumuon
	*/
	@Override
	public void setSoLuong(long soLuong) {
		_phieumuon.setSoLuong(soLuong);
	}

	/**
	* Returns the ngay muon of this phieumuon.
	*
	* @return the ngay muon of this phieumuon
	*/
	@Override
	public java.util.Date getNgayMuon() {
		return _phieumuon.getNgayMuon();
	}

	/**
	* Sets the ngay muon of this phieumuon.
	*
	* @param ngayMuon the ngay muon of this phieumuon
	*/
	@Override
	public void setNgayMuon(java.util.Date ngayMuon) {
		_phieumuon.setNgayMuon(ngayMuon);
	}

	/**
	* Returns the ngay tra of this phieumuon.
	*
	* @return the ngay tra of this phieumuon
	*/
	@Override
	public java.util.Date getNgayTra() {
		return _phieumuon.getNgayTra();
	}

	/**
	* Sets the ngay tra of this phieumuon.
	*
	* @param ngayTra the ngay tra of this phieumuon
	*/
	@Override
	public void setNgayTra(java.util.Date ngayTra) {
		_phieumuon.setNgayTra(ngayTra);
	}

	/**
	* Returns the xac nhan of this phieumuon.
	*
	* @return the xac nhan of this phieumuon
	*/
	@Override
	public long getXacNhan() {
		return _phieumuon.getXacNhan();
	}

	/**
	* Sets the xac nhan of this phieumuon.
	*
	* @param xacNhan the xac nhan of this phieumuon
	*/
	@Override
	public void setXacNhan(long xacNhan) {
		_phieumuon.setXacNhan(xacNhan);
	}

	/**
	* Returns the trang thai of this phieumuon.
	*
	* @return the trang thai of this phieumuon
	*/
	@Override
	public long getTrangThai() {
		return _phieumuon.getTrangThai();
	}

	/**
	* Sets the trang thai of this phieumuon.
	*
	* @param trangThai the trang thai of this phieumuon
	*/
	@Override
	public void setTrangThai(long trangThai) {
		_phieumuon.setTrangThai(trangThai);
	}

	/**
	* Returns the duyet muon of this phieumuon.
	*
	* @return the duyet muon of this phieumuon
	*/
	@Override
	public long getDuyetMuon() {
		return _phieumuon.getDuyetMuon();
	}

	/**
	* Sets the duyet muon of this phieumuon.
	*
	* @param duyetMuon the duyet muon of this phieumuon
	*/
	@Override
	public void setDuyetMuon(long duyetMuon) {
		_phieumuon.setDuyetMuon(duyetMuon);
	}

	@Override
	public boolean isNew() {
		return _phieumuon.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phieumuon.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phieumuon.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phieumuon.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phieumuon.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phieumuon.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phieumuon.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phieumuon.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phieumuon.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phieumuon.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phieumuon.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhieumuonWrapper((Phieumuon)_phieumuon.clone());
	}

	@Override
	public int compareTo(com.thuvien.model.Phieumuon phieumuon) {
		return _phieumuon.compareTo(phieumuon);
	}

	@Override
	public int hashCode() {
		return _phieumuon.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.thuvien.model.Phieumuon> toCacheModel() {
		return _phieumuon.toCacheModel();
	}

	@Override
	public com.thuvien.model.Phieumuon toEscapedModel() {
		return new PhieumuonWrapper(_phieumuon.toEscapedModel());
	}

	@Override
	public com.thuvien.model.Phieumuon toUnescapedModel() {
		return new PhieumuonWrapper(_phieumuon.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phieumuon.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phieumuon.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phieumuon.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhieumuonWrapper)) {
			return false;
		}

		PhieumuonWrapper phieumuonWrapper = (PhieumuonWrapper)obj;

		if (Validator.equals(_phieumuon, phieumuonWrapper._phieumuon)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Phieumuon getWrappedPhieumuon() {
		return _phieumuon;
	}

	@Override
	public Phieumuon getWrappedModel() {
		return _phieumuon;
	}

	@Override
	public void resetOriginalValues() {
		_phieumuon.resetOriginalValues();
	}

	private Phieumuon _phieumuon;
}