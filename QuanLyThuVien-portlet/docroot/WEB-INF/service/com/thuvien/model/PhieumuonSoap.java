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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.thuvien.service.http.PhieumuonServiceSoap}.
 *
 * @author PC
 * @see com.thuvien.service.http.PhieumuonServiceSoap
 * @generated
 */
public class PhieumuonSoap implements Serializable {
	public static PhieumuonSoap toSoapModel(Phieumuon model) {
		PhieumuonSoap soapModel = new PhieumuonSoap();

		soapModel.setId(model.getId());
		soapModel.setNguoiDung(model.getNguoiDung());
		soapModel.setSach(model.getSach());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setNgayMuon(model.getNgayMuon());
		soapModel.setNgayTra(model.getNgayTra());
		soapModel.setXacNhan(model.getXacNhan());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setDuyetMuon(model.getDuyetMuon());

		return soapModel;
	}

	public static PhieumuonSoap[] toSoapModels(Phieumuon[] models) {
		PhieumuonSoap[] soapModels = new PhieumuonSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhieumuonSoap[][] toSoapModels(Phieumuon[][] models) {
		PhieumuonSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhieumuonSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhieumuonSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhieumuonSoap[] toSoapModels(List<Phieumuon> models) {
		List<PhieumuonSoap> soapModels = new ArrayList<PhieumuonSoap>(models.size());

		for (Phieumuon model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhieumuonSoap[soapModels.size()]);
	}

	public PhieumuonSoap() {
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

	public long getNguoiDung() {
		return _nguoiDung;
	}

	public void setNguoiDung(long nguoiDung) {
		_nguoiDung = nguoiDung;
	}

	public long getSach() {
		return _sach;
	}

	public void setSach(long sach) {
		_sach = sach;
	}

	public long getSoLuong() {
		return _soLuong;
	}

	public void setSoLuong(long soLuong) {
		_soLuong = soLuong;
	}

	public Date getNgayMuon() {
		return _ngayMuon;
	}

	public void setNgayMuon(Date ngayMuon) {
		_ngayMuon = ngayMuon;
	}

	public Date getNgayTra() {
		return _ngayTra;
	}

	public void setNgayTra(Date ngayTra) {
		_ngayTra = ngayTra;
	}

	public long getXacNhan() {
		return _xacNhan;
	}

	public void setXacNhan(long xacNhan) {
		_xacNhan = xacNhan;
	}

	public long getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(long trangThai) {
		_trangThai = trangThai;
	}

	public long getDuyetMuon() {
		return _duyetMuon;
	}

	public void setDuyetMuon(long duyetMuon) {
		_duyetMuon = duyetMuon;
	}

	private long _id;
	private long _nguoiDung;
	private long _sach;
	private long _soLuong;
	private Date _ngayMuon;
	private Date _ngayTra;
	private long _xacNhan;
	private long _trangThai;
	private long _duyetMuon;
}