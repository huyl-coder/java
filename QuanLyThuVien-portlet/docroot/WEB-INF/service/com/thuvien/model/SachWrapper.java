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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sach}.
 * </p>
 *
 * @author PC
 * @see Sach
 * @generated
 */
public class SachWrapper implements Sach, ModelWrapper<Sach> {
	public SachWrapper(Sach sach) {
		_sach = sach;
	}

	@Override
	public Class<?> getModelClass() {
		return Sach.class;
	}

	@Override
	public String getModelClassName() {
		return Sach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ten", getTen());
		attributes.put("maSach", getMaSach());
		attributes.put("soLuong", getSoLuong());
		attributes.put("theLoai", getTheLoai());
		attributes.put("ke", getKe());
		attributes.put("tang", getTang());
		attributes.put("tacGia", getTacGia());
		attributes.put("nhaXuatBan", getNhaXuatBan());
		attributes.put("soLuongConlai", getSoLuongConlai());

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

		String maSach = (String)attributes.get("maSach");

		if (maSach != null) {
			setMaSach(maSach);
		}

		Long soLuong = (Long)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Long theLoai = (Long)attributes.get("theLoai");

		if (theLoai != null) {
			setTheLoai(theLoai);
		}

		String ke = (String)attributes.get("ke");

		if (ke != null) {
			setKe(ke);
		}

		String tang = (String)attributes.get("tang");

		if (tang != null) {
			setTang(tang);
		}

		String tacGia = (String)attributes.get("tacGia");

		if (tacGia != null) {
			setTacGia(tacGia);
		}

		String nhaXuatBan = (String)attributes.get("nhaXuatBan");

		if (nhaXuatBan != null) {
			setNhaXuatBan(nhaXuatBan);
		}

		Long soLuongConlai = (Long)attributes.get("soLuongConlai");

		if (soLuongConlai != null) {
			setSoLuongConlai(soLuongConlai);
		}
	}

	/**
	* Returns the primary key of this sach.
	*
	* @return the primary key of this sach
	*/
	@Override
	public long getPrimaryKey() {
		return _sach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sach.
	*
	* @param primaryKey the primary key of this sach
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this sach.
	*
	* @return the ID of this sach
	*/
	@Override
	public long getId() {
		return _sach.getId();
	}

	/**
	* Sets the ID of this sach.
	*
	* @param id the ID of this sach
	*/
	@Override
	public void setId(long id) {
		_sach.setId(id);
	}

	/**
	* Returns the ten of this sach.
	*
	* @return the ten of this sach
	*/
	@Override
	public java.lang.String getTen() {
		return _sach.getTen();
	}

	/**
	* Sets the ten of this sach.
	*
	* @param ten the ten of this sach
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_sach.setTen(ten);
	}

	/**
	* Returns the ma sach of this sach.
	*
	* @return the ma sach of this sach
	*/
	@Override
	public java.lang.String getMaSach() {
		return _sach.getMaSach();
	}

	/**
	* Sets the ma sach of this sach.
	*
	* @param maSach the ma sach of this sach
	*/
	@Override
	public void setMaSach(java.lang.String maSach) {
		_sach.setMaSach(maSach);
	}

	/**
	* Returns the so luong of this sach.
	*
	* @return the so luong of this sach
	*/
	@Override
	public long getSoLuong() {
		return _sach.getSoLuong();
	}

	/**
	* Sets the so luong of this sach.
	*
	* @param soLuong the so luong of this sach
	*/
	@Override
	public void setSoLuong(long soLuong) {
		_sach.setSoLuong(soLuong);
	}

	/**
	* Returns the the loai of this sach.
	*
	* @return the the loai of this sach
	*/
	@Override
	public long getTheLoai() {
		return _sach.getTheLoai();
	}

	/**
	* Sets the the loai of this sach.
	*
	* @param theLoai the the loai of this sach
	*/
	@Override
	public void setTheLoai(long theLoai) {
		_sach.setTheLoai(theLoai);
	}

	/**
	* Returns the ke of this sach.
	*
	* @return the ke of this sach
	*/
	@Override
	public java.lang.String getKe() {
		return _sach.getKe();
	}

	/**
	* Sets the ke of this sach.
	*
	* @param ke the ke of this sach
	*/
	@Override
	public void setKe(java.lang.String ke) {
		_sach.setKe(ke);
	}

	/**
	* Returns the tang of this sach.
	*
	* @return the tang of this sach
	*/
	@Override
	public java.lang.String getTang() {
		return _sach.getTang();
	}

	/**
	* Sets the tang of this sach.
	*
	* @param tang the tang of this sach
	*/
	@Override
	public void setTang(java.lang.String tang) {
		_sach.setTang(tang);
	}

	/**
	* Returns the tac gia of this sach.
	*
	* @return the tac gia of this sach
	*/
	@Override
	public java.lang.String getTacGia() {
		return _sach.getTacGia();
	}

	/**
	* Sets the tac gia of this sach.
	*
	* @param tacGia the tac gia of this sach
	*/
	@Override
	public void setTacGia(java.lang.String tacGia) {
		_sach.setTacGia(tacGia);
	}

	/**
	* Returns the nha xuat ban of this sach.
	*
	* @return the nha xuat ban of this sach
	*/
	@Override
	public java.lang.String getNhaXuatBan() {
		return _sach.getNhaXuatBan();
	}

	/**
	* Sets the nha xuat ban of this sach.
	*
	* @param nhaXuatBan the nha xuat ban of this sach
	*/
	@Override
	public void setNhaXuatBan(java.lang.String nhaXuatBan) {
		_sach.setNhaXuatBan(nhaXuatBan);
	}

	/**
	* Returns the so luong conlai of this sach.
	*
	* @return the so luong conlai of this sach
	*/
	@Override
	public long getSoLuongConlai() {
		return _sach.getSoLuongConlai();
	}

	/**
	* Sets the so luong conlai of this sach.
	*
	* @param soLuongConlai the so luong conlai of this sach
	*/
	@Override
	public void setSoLuongConlai(long soLuongConlai) {
		_sach.setSoLuongConlai(soLuongConlai);
	}

	@Override
	public boolean isNew() {
		return _sach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SachWrapper((Sach)_sach.clone());
	}

	@Override
	public int compareTo(com.thuvien.model.Sach sach) {
		return _sach.compareTo(sach);
	}

	@Override
	public int hashCode() {
		return _sach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.thuvien.model.Sach> toCacheModel() {
		return _sach.toCacheModel();
	}

	@Override
	public com.thuvien.model.Sach toEscapedModel() {
		return new SachWrapper(_sach.toEscapedModel());
	}

	@Override
	public com.thuvien.model.Sach toUnescapedModel() {
		return new SachWrapper(_sach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sach.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SachWrapper)) {
			return false;
		}

		SachWrapper sachWrapper = (SachWrapper)obj;

		if (Validator.equals(_sach, sachWrapper._sach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Sach getWrappedSach() {
		return _sach;
	}

	@Override
	public Sach getWrappedModel() {
		return _sach;
	}

	@Override
	public void resetOriginalValues() {
		_sach.resetOriginalValues();
	}

	private Sach _sach;
}