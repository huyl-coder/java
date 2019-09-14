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

package ispace.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ispace.model.LuanChuyen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LuanChuyen in entity cache.
 *
 * @author PC
 * @see LuanChuyen
 * @generated
 */
public class LuanChuyenCacheModel implements CacheModel<LuanChuyen>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vanBanId=");
		sb.append(vanBanId);
		sb.append(", kieuVanBan=");
		sb.append(kieuVanBan);
		sb.append(", nguoiGui=");
		sb.append(nguoiGui);
		sb.append(", nguoiNhan=");
		sb.append(nguoiNhan);
		sb.append(", ngayGui=");
		sb.append(ngayGui);
		sb.append(", ngayNhan=");
		sb.append(ngayNhan);
		sb.append(", yKien=");
		sb.append(yKien);
		sb.append(", hanXuLy=");
		sb.append(hanXuLy);
		sb.append(", yKienPhanHoi=");
		sb.append(yKienPhanHoi);
		sb.append(", ngayPhanHoi=");
		sb.append(ngayPhanHoi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LuanChuyen toEntityModel() {
		LuanChuyenImpl luanChuyenImpl = new LuanChuyenImpl();

		luanChuyenImpl.setId(id);
		luanChuyenImpl.setVanBanId(vanBanId);
		luanChuyenImpl.setKieuVanBan(kieuVanBan);
		luanChuyenImpl.setNguoiGui(nguoiGui);
		luanChuyenImpl.setNguoiNhan(nguoiNhan);

		if (ngayGui == Long.MIN_VALUE) {
			luanChuyenImpl.setNgayGui(null);
		}
		else {
			luanChuyenImpl.setNgayGui(new Date(ngayGui));
		}

		if (ngayNhan == Long.MIN_VALUE) {
			luanChuyenImpl.setNgayNhan(null);
		}
		else {
			luanChuyenImpl.setNgayNhan(new Date(ngayNhan));
		}

		if (yKien == null) {
			luanChuyenImpl.setYKien(StringPool.BLANK);
		}
		else {
			luanChuyenImpl.setYKien(yKien);
		}

		if (hanXuLy == Long.MIN_VALUE) {
			luanChuyenImpl.setHanXuLy(null);
		}
		else {
			luanChuyenImpl.setHanXuLy(new Date(hanXuLy));
		}

		if (yKienPhanHoi == null) {
			luanChuyenImpl.setYKienPhanHoi(StringPool.BLANK);
		}
		else {
			luanChuyenImpl.setYKienPhanHoi(yKienPhanHoi);
		}

		if (ngayPhanHoi == Long.MIN_VALUE) {
			luanChuyenImpl.setNgayPhanHoi(null);
		}
		else {
			luanChuyenImpl.setNgayPhanHoi(new Date(ngayPhanHoi));
		}

		luanChuyenImpl.resetOriginalValues();

		return luanChuyenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vanBanId = objectInput.readLong();
		kieuVanBan = objectInput.readLong();
		nguoiGui = objectInput.readLong();
		nguoiNhan = objectInput.readLong();
		ngayGui = objectInput.readLong();
		ngayNhan = objectInput.readLong();
		yKien = objectInput.readUTF();
		hanXuLy = objectInput.readLong();
		yKienPhanHoi = objectInput.readUTF();
		ngayPhanHoi = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vanBanId);
		objectOutput.writeLong(kieuVanBan);
		objectOutput.writeLong(nguoiGui);
		objectOutput.writeLong(nguoiNhan);
		objectOutput.writeLong(ngayGui);
		objectOutput.writeLong(ngayNhan);

		if (yKien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKien);
		}

		objectOutput.writeLong(hanXuLy);

		if (yKienPhanHoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(yKienPhanHoi);
		}

		objectOutput.writeLong(ngayPhanHoi);
	}

	public long id;
	public long vanBanId;
	public long kieuVanBan;
	public long nguoiGui;
	public long nguoiNhan;
	public long ngayGui;
	public long ngayNhan;
	public String yKien;
	public long hanXuLy;
	public String yKienPhanHoi;
	public long ngayPhanHoi;
}