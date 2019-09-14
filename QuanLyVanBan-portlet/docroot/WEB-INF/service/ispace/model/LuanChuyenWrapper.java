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
 * This class is a wrapper for {@link LuanChuyen}.
 * </p>
 *
 * @author PC
 * @see LuanChuyen
 * @generated
 */
public class LuanChuyenWrapper implements LuanChuyen, ModelWrapper<LuanChuyen> {
	public LuanChuyenWrapper(LuanChuyen luanChuyen) {
		_luanChuyen = luanChuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return LuanChuyen.class;
	}

	@Override
	public String getModelClassName() {
		return LuanChuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vanBanId", getVanBanId());
		attributes.put("kieuVanBan", getKieuVanBan());
		attributes.put("nguoiGui", getNguoiGui());
		attributes.put("nguoiNhan", getNguoiNhan());
		attributes.put("ngayGui", getNgayGui());
		attributes.put("ngayNhan", getNgayNhan());
		attributes.put("yKien", getYKien());
		attributes.put("hanXuLy", getHanXuLy());
		attributes.put("yKienPhanHoi", getYKienPhanHoi());
		attributes.put("ngayPhanHoi", getNgayPhanHoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vanBanId = (Long)attributes.get("vanBanId");

		if (vanBanId != null) {
			setVanBanId(vanBanId);
		}

		Long kieuVanBan = (Long)attributes.get("kieuVanBan");

		if (kieuVanBan != null) {
			setKieuVanBan(kieuVanBan);
		}

		Long nguoiGui = (Long)attributes.get("nguoiGui");

		if (nguoiGui != null) {
			setNguoiGui(nguoiGui);
		}

		Long nguoiNhan = (Long)attributes.get("nguoiNhan");

		if (nguoiNhan != null) {
			setNguoiNhan(nguoiNhan);
		}

		Date ngayGui = (Date)attributes.get("ngayGui");

		if (ngayGui != null) {
			setNgayGui(ngayGui);
		}

		Date ngayNhan = (Date)attributes.get("ngayNhan");

		if (ngayNhan != null) {
			setNgayNhan(ngayNhan);
		}

		String yKien = (String)attributes.get("yKien");

		if (yKien != null) {
			setYKien(yKien);
		}

		Date hanXuLy = (Date)attributes.get("hanXuLy");

		if (hanXuLy != null) {
			setHanXuLy(hanXuLy);
		}

		String yKienPhanHoi = (String)attributes.get("yKienPhanHoi");

		if (yKienPhanHoi != null) {
			setYKienPhanHoi(yKienPhanHoi);
		}

		Date ngayPhanHoi = (Date)attributes.get("ngayPhanHoi");

		if (ngayPhanHoi != null) {
			setNgayPhanHoi(ngayPhanHoi);
		}
	}

	/**
	* Returns the primary key of this luan chuyen.
	*
	* @return the primary key of this luan chuyen
	*/
	@Override
	public long getPrimaryKey() {
		return _luanChuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this luan chuyen.
	*
	* @param primaryKey the primary key of this luan chuyen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_luanChuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this luan chuyen.
	*
	* @return the ID of this luan chuyen
	*/
	@Override
	public long getId() {
		return _luanChuyen.getId();
	}

	/**
	* Sets the ID of this luan chuyen.
	*
	* @param id the ID of this luan chuyen
	*/
	@Override
	public void setId(long id) {
		_luanChuyen.setId(id);
	}

	/**
	* Returns the van ban ID of this luan chuyen.
	*
	* @return the van ban ID of this luan chuyen
	*/
	@Override
	public long getVanBanId() {
		return _luanChuyen.getVanBanId();
	}

	/**
	* Sets the van ban ID of this luan chuyen.
	*
	* @param vanBanId the van ban ID of this luan chuyen
	*/
	@Override
	public void setVanBanId(long vanBanId) {
		_luanChuyen.setVanBanId(vanBanId);
	}

	/**
	* Returns the kieu van ban of this luan chuyen.
	*
	* @return the kieu van ban of this luan chuyen
	*/
	@Override
	public long getKieuVanBan() {
		return _luanChuyen.getKieuVanBan();
	}

	/**
	* Sets the kieu van ban of this luan chuyen.
	*
	* @param kieuVanBan the kieu van ban of this luan chuyen
	*/
	@Override
	public void setKieuVanBan(long kieuVanBan) {
		_luanChuyen.setKieuVanBan(kieuVanBan);
	}

	/**
	* Returns the nguoi gui of this luan chuyen.
	*
	* @return the nguoi gui of this luan chuyen
	*/
	@Override
	public long getNguoiGui() {
		return _luanChuyen.getNguoiGui();
	}

	/**
	* Sets the nguoi gui of this luan chuyen.
	*
	* @param nguoiGui the nguoi gui of this luan chuyen
	*/
	@Override
	public void setNguoiGui(long nguoiGui) {
		_luanChuyen.setNguoiGui(nguoiGui);
	}

	/**
	* Returns the nguoi nhan of this luan chuyen.
	*
	* @return the nguoi nhan of this luan chuyen
	*/
	@Override
	public long getNguoiNhan() {
		return _luanChuyen.getNguoiNhan();
	}

	/**
	* Sets the nguoi nhan of this luan chuyen.
	*
	* @param nguoiNhan the nguoi nhan of this luan chuyen
	*/
	@Override
	public void setNguoiNhan(long nguoiNhan) {
		_luanChuyen.setNguoiNhan(nguoiNhan);
	}

	/**
	* Returns the ngay gui of this luan chuyen.
	*
	* @return the ngay gui of this luan chuyen
	*/
	@Override
	public java.util.Date getNgayGui() {
		return _luanChuyen.getNgayGui();
	}

	/**
	* Sets the ngay gui of this luan chuyen.
	*
	* @param ngayGui the ngay gui of this luan chuyen
	*/
	@Override
	public void setNgayGui(java.util.Date ngayGui) {
		_luanChuyen.setNgayGui(ngayGui);
	}

	/**
	* Returns the ngay nhan of this luan chuyen.
	*
	* @return the ngay nhan of this luan chuyen
	*/
	@Override
	public java.util.Date getNgayNhan() {
		return _luanChuyen.getNgayNhan();
	}

	/**
	* Sets the ngay nhan of this luan chuyen.
	*
	* @param ngayNhan the ngay nhan of this luan chuyen
	*/
	@Override
	public void setNgayNhan(java.util.Date ngayNhan) {
		_luanChuyen.setNgayNhan(ngayNhan);
	}

	/**
	* Returns the y kien of this luan chuyen.
	*
	* @return the y kien of this luan chuyen
	*/
	@Override
	public java.lang.String getYKien() {
		return _luanChuyen.getYKien();
	}

	/**
	* Sets the y kien of this luan chuyen.
	*
	* @param yKien the y kien of this luan chuyen
	*/
	@Override
	public void setYKien(java.lang.String yKien) {
		_luanChuyen.setYKien(yKien);
	}

	/**
	* Returns the han xu ly of this luan chuyen.
	*
	* @return the han xu ly of this luan chuyen
	*/
	@Override
	public java.util.Date getHanXuLy() {
		return _luanChuyen.getHanXuLy();
	}

	/**
	* Sets the han xu ly of this luan chuyen.
	*
	* @param hanXuLy the han xu ly of this luan chuyen
	*/
	@Override
	public void setHanXuLy(java.util.Date hanXuLy) {
		_luanChuyen.setHanXuLy(hanXuLy);
	}

	/**
	* Returns the y kien phan hoi of this luan chuyen.
	*
	* @return the y kien phan hoi of this luan chuyen
	*/
	@Override
	public java.lang.String getYKienPhanHoi() {
		return _luanChuyen.getYKienPhanHoi();
	}

	/**
	* Sets the y kien phan hoi of this luan chuyen.
	*
	* @param yKienPhanHoi the y kien phan hoi of this luan chuyen
	*/
	@Override
	public void setYKienPhanHoi(java.lang.String yKienPhanHoi) {
		_luanChuyen.setYKienPhanHoi(yKienPhanHoi);
	}

	/**
	* Returns the ngay phan hoi of this luan chuyen.
	*
	* @return the ngay phan hoi of this luan chuyen
	*/
	@Override
	public java.util.Date getNgayPhanHoi() {
		return _luanChuyen.getNgayPhanHoi();
	}

	/**
	* Sets the ngay phan hoi of this luan chuyen.
	*
	* @param ngayPhanHoi the ngay phan hoi of this luan chuyen
	*/
	@Override
	public void setNgayPhanHoi(java.util.Date ngayPhanHoi) {
		_luanChuyen.setNgayPhanHoi(ngayPhanHoi);
	}

	@Override
	public boolean isNew() {
		return _luanChuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_luanChuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _luanChuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_luanChuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _luanChuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _luanChuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_luanChuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _luanChuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_luanChuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_luanChuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_luanChuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LuanChuyenWrapper((LuanChuyen)_luanChuyen.clone());
	}

	@Override
	public int compareTo(ispace.model.LuanChuyen luanChuyen) {
		return _luanChuyen.compareTo(luanChuyen);
	}

	@Override
	public int hashCode() {
		return _luanChuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.LuanChuyen> toCacheModel() {
		return _luanChuyen.toCacheModel();
	}

	@Override
	public ispace.model.LuanChuyen toEscapedModel() {
		return new LuanChuyenWrapper(_luanChuyen.toEscapedModel());
	}

	@Override
	public ispace.model.LuanChuyen toUnescapedModel() {
		return new LuanChuyenWrapper(_luanChuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _luanChuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _luanChuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_luanChuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LuanChuyenWrapper)) {
			return false;
		}

		LuanChuyenWrapper luanChuyenWrapper = (LuanChuyenWrapper)obj;

		if (Validator.equals(_luanChuyen, luanChuyenWrapper._luanChuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LuanChuyen getWrappedLuanChuyen() {
		return _luanChuyen;
	}

	@Override
	public LuanChuyen getWrappedModel() {
		return _luanChuyen;
	}

	@Override
	public void resetOriginalValues() {
		_luanChuyen.resetOriginalValues();
	}

	private LuanChuyen _luanChuyen;
}