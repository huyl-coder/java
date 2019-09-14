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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.thuvien.service.http.SachServiceSoap}.
 *
 * @author PC
 * @see com.thuvien.service.http.SachServiceSoap
 * @generated
 */
public class SachSoap implements Serializable {
	public static SachSoap toSoapModel(Sach model) {
		SachSoap soapModel = new SachSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());
		soapModel.setMaSach(model.getMaSach());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setTheLoai(model.getTheLoai());
		soapModel.setKe(model.getKe());
		soapModel.setTang(model.getTang());
		soapModel.setTacGia(model.getTacGia());
		soapModel.setNhaXuatBan(model.getNhaXuatBan());
		soapModel.setSoLuongConlai(model.getSoLuongConlai());

		return soapModel;
	}

	public static SachSoap[] toSoapModels(Sach[] models) {
		SachSoap[] soapModels = new SachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[][] toSoapModels(Sach[][] models) {
		SachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[] toSoapModels(List<Sach> models) {
		List<SachSoap> soapModels = new ArrayList<SachSoap>(models.size());

		for (Sach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SachSoap[soapModels.size()]);
	}

	public SachSoap() {
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

	public String getTen() {
		return _ten;
	}

	public void setTen(String ten) {
		_ten = ten;
	}

	public String getMaSach() {
		return _maSach;
	}

	public void setMaSach(String maSach) {
		_maSach = maSach;
	}

	public long getSoLuong() {
		return _soLuong;
	}

	public void setSoLuong(long soLuong) {
		_soLuong = soLuong;
	}

	public long getTheLoai() {
		return _theLoai;
	}

	public void setTheLoai(long theLoai) {
		_theLoai = theLoai;
	}

	public String getKe() {
		return _ke;
	}

	public void setKe(String ke) {
		_ke = ke;
	}

	public String getTang() {
		return _tang;
	}

	public void setTang(String tang) {
		_tang = tang;
	}

	public String getTacGia() {
		return _tacGia;
	}

	public void setTacGia(String tacGia) {
		_tacGia = tacGia;
	}

	public String getNhaXuatBan() {
		return _nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		_nhaXuatBan = nhaXuatBan;
	}

	public long getSoLuongConlai() {
		return _soLuongConlai;
	}

	public void setSoLuongConlai(long soLuongConlai) {
		_soLuongConlai = soLuongConlai;
	}

	private long _id;
	private String _ten;
	private String _maSach;
	private long _soLuong;
	private long _theLoai;
	private String _ke;
	private String _tang;
	private String _tacGia;
	private String _nhaXuatBan;
	private long _soLuongConlai;
}