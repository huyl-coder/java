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

package com.thuvien.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.thuvien.model.Phieumuon;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Phieumuon in entity cache.
 *
 * @author PC
 * @see Phieumuon
 * @generated
 */
public class PhieumuonCacheModel implements CacheModel<Phieumuon>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nguoiDung=");
		sb.append(nguoiDung);
		sb.append(", sach=");
		sb.append(sach);
		sb.append(", soLuong=");
		sb.append(soLuong);
		sb.append(", ngayMuon=");
		sb.append(ngayMuon);
		sb.append(", ngayTra=");
		sb.append(ngayTra);
		sb.append(", xacNhan=");
		sb.append(xacNhan);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", duyetMuon=");
		sb.append(duyetMuon);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Phieumuon toEntityModel() {
		PhieumuonImpl phieumuonImpl = new PhieumuonImpl();

		phieumuonImpl.setId(id);
		phieumuonImpl.setNguoiDung(nguoiDung);
		phieumuonImpl.setSach(sach);
		phieumuonImpl.setSoLuong(soLuong);

		if (ngayMuon == Long.MIN_VALUE) {
			phieumuonImpl.setNgayMuon(null);
		}
		else {
			phieumuonImpl.setNgayMuon(new Date(ngayMuon));
		}

		if (ngayTra == Long.MIN_VALUE) {
			phieumuonImpl.setNgayTra(null);
		}
		else {
			phieumuonImpl.setNgayTra(new Date(ngayTra));
		}

		phieumuonImpl.setXacNhan(xacNhan);
		phieumuonImpl.setTrangThai(trangThai);
		phieumuonImpl.setDuyetMuon(duyetMuon);

		phieumuonImpl.resetOriginalValues();

		return phieumuonImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		nguoiDung = objectInput.readLong();
		sach = objectInput.readLong();
		soLuong = objectInput.readLong();
		ngayMuon = objectInput.readLong();
		ngayTra = objectInput.readLong();
		xacNhan = objectInput.readLong();
		trangThai = objectInput.readLong();
		duyetMuon = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(nguoiDung);
		objectOutput.writeLong(sach);
		objectOutput.writeLong(soLuong);
		objectOutput.writeLong(ngayMuon);
		objectOutput.writeLong(ngayTra);
		objectOutput.writeLong(xacNhan);
		objectOutput.writeLong(trangThai);
		objectOutput.writeLong(duyetMuon);
	}

	public long id;
	public long nguoiDung;
	public long sach;
	public long soLuong;
	public long ngayMuon;
	public long ngayTra;
	public long xacNhan;
	public long trangThai;
	public long duyetMuon;
}