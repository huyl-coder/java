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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.thuvien.model.Sach;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Sach in entity cache.
 *
 * @author PC
 * @see Sach
 * @generated
 */
public class SachCacheModel implements CacheModel<Sach>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ten=");
		sb.append(ten);
		sb.append(", maSach=");
		sb.append(maSach);
		sb.append(", soLuong=");
		sb.append(soLuong);
		sb.append(", theLoai=");
		sb.append(theLoai);
		sb.append(", ke=");
		sb.append(ke);
		sb.append(", tang=");
		sb.append(tang);
		sb.append(", tacGia=");
		sb.append(tacGia);
		sb.append(", nhaXuatBan=");
		sb.append(nhaXuatBan);
		sb.append(", soLuongConlai=");
		sb.append(soLuongConlai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sach toEntityModel() {
		SachImpl sachImpl = new SachImpl();

		sachImpl.setId(id);

		if (ten == null) {
			sachImpl.setTen(StringPool.BLANK);
		}
		else {
			sachImpl.setTen(ten);
		}

		if (maSach == null) {
			sachImpl.setMaSach(StringPool.BLANK);
		}
		else {
			sachImpl.setMaSach(maSach);
		}

		sachImpl.setSoLuong(soLuong);
		sachImpl.setTheLoai(theLoai);

		if (ke == null) {
			sachImpl.setKe(StringPool.BLANK);
		}
		else {
			sachImpl.setKe(ke);
		}

		if (tang == null) {
			sachImpl.setTang(StringPool.BLANK);
		}
		else {
			sachImpl.setTang(tang);
		}

		if (tacGia == null) {
			sachImpl.setTacGia(StringPool.BLANK);
		}
		else {
			sachImpl.setTacGia(tacGia);
		}

		if (nhaXuatBan == null) {
			sachImpl.setNhaXuatBan(StringPool.BLANK);
		}
		else {
			sachImpl.setNhaXuatBan(nhaXuatBan);
		}

		sachImpl.setSoLuongConlai(soLuongConlai);

		sachImpl.resetOriginalValues();

		return sachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		ten = objectInput.readUTF();
		maSach = objectInput.readUTF();
		soLuong = objectInput.readLong();
		theLoai = objectInput.readLong();
		ke = objectInput.readUTF();
		tang = objectInput.readUTF();
		tacGia = objectInput.readUTF();
		nhaXuatBan = objectInput.readUTF();
		soLuongConlai = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (ten == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ten);
		}

		if (maSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSach);
		}

		objectOutput.writeLong(soLuong);
		objectOutput.writeLong(theLoai);

		if (ke == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ke);
		}

		if (tang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tang);
		}

		if (tacGia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tacGia);
		}

		if (nhaXuatBan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhaXuatBan);
		}

		objectOutput.writeLong(soLuongConlai);
	}

	public long id;
	public String ten;
	public String maSach;
	public long soLuong;
	public long theLoai;
	public String ke;
	public String tang;
	public String tacGia;
	public String nhaXuatBan;
	public long soLuongConlai;
}