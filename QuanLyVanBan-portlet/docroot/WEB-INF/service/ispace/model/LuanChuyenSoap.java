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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.LuanChuyenServiceSoap}.
 *
 * @author PC
 * @see ispace.service.http.LuanChuyenServiceSoap
 * @generated
 */
public class LuanChuyenSoap implements Serializable {
	public static LuanChuyenSoap toSoapModel(LuanChuyen model) {
		LuanChuyenSoap soapModel = new LuanChuyenSoap();

		soapModel.setId(model.getId());
		soapModel.setVanBanId(model.getVanBanId());
		soapModel.setKieuVanBan(model.getKieuVanBan());
		soapModel.setNguoiGui(model.getNguoiGui());
		soapModel.setNguoiNhan(model.getNguoiNhan());
		soapModel.setNgayGui(model.getNgayGui());
		soapModel.setNgayNhan(model.getNgayNhan());
		soapModel.setYKien(model.getYKien());
		soapModel.setHanXuLy(model.getHanXuLy());
		soapModel.setYKienPhanHoi(model.getYKienPhanHoi());
		soapModel.setNgayPhanHoi(model.getNgayPhanHoi());

		return soapModel;
	}

	public static LuanChuyenSoap[] toSoapModels(LuanChuyen[] models) {
		LuanChuyenSoap[] soapModels = new LuanChuyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LuanChuyenSoap[][] toSoapModels(LuanChuyen[][] models) {
		LuanChuyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LuanChuyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LuanChuyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LuanChuyenSoap[] toSoapModels(List<LuanChuyen> models) {
		List<LuanChuyenSoap> soapModels = new ArrayList<LuanChuyenSoap>(models.size());

		for (LuanChuyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LuanChuyenSoap[soapModels.size()]);
	}

	public LuanChuyenSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getVanBanId() {
		return _vanBanId;
	}

	public void setVanBanId(long vanBanId) {
		_vanBanId = vanBanId;
	}

	public long getKieuVanBan() {
		return _kieuVanBan;
	}

	public void setKieuVanBan(long kieuVanBan) {
		_kieuVanBan = kieuVanBan;
	}

	public long getNguoiGui() {
		return _nguoiGui;
	}

	public void setNguoiGui(long nguoiGui) {
		_nguoiGui = nguoiGui;
	}

	public long getNguoiNhan() {
		return _nguoiNhan;
	}

	public void setNguoiNhan(long nguoiNhan) {
		_nguoiNhan = nguoiNhan;
	}

	public Date getNgayGui() {
		return _ngayGui;
	}

	public void setNgayGui(Date ngayGui) {
		_ngayGui = ngayGui;
	}

	public Date getNgayNhan() {
		return _ngayNhan;
	}

	public void setNgayNhan(Date ngayNhan) {
		_ngayNhan = ngayNhan;
	}

	public String getYKien() {
		return _yKien;
	}

	public void setYKien(String yKien) {
		_yKien = yKien;
	}

	public Date getHanXuLy() {
		return _hanXuLy;
	}

	public void setHanXuLy(Date hanXuLy) {
		_hanXuLy = hanXuLy;
	}

	public String getYKienPhanHoi() {
		return _yKienPhanHoi;
	}

	public void setYKienPhanHoi(String yKienPhanHoi) {
		_yKienPhanHoi = yKienPhanHoi;
	}

	public Date getNgayPhanHoi() {
		return _ngayPhanHoi;
	}

	public void setNgayPhanHoi(Date ngayPhanHoi) {
		_ngayPhanHoi = ngayPhanHoi;
	}

	private long _id;
	private long _vanBanId;
	private long _kieuVanBan;
	private long _nguoiGui;
	private long _nguoiNhan;
	private Date _ngayGui;
	private Date _ngayNhan;
	private String _yKien;
	private Date _hanXuLy;
	private String _yKienPhanHoi;
	private Date _ngayPhanHoi;
}