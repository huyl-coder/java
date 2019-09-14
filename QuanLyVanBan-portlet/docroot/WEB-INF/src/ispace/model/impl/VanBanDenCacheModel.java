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

import ispace.model.VanBanDen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VanBanDen in entity cache.
 *
 * @author PC
 * @see VanBanDen
 * @generated
 */
public class VanBanDenCacheModel implements CacheModel<VanBanDen>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", soKiHieu=");
		sb.append(soKiHieu);
		sb.append(", soVanBanId=");
		sb.append(soVanBanId);
		sb.append(", loaiVanBanId=");
		sb.append(loaiVanBanId);
		sb.append(", date=");
		sb.append(date);
		sb.append(", nguoiKiId=");
		sb.append(nguoiKiId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VanBanDen toEntityModel() {
		VanBanDenImpl vanBanDenImpl = new VanBanDenImpl();

		vanBanDenImpl.setId(id);

		if (soKiHieu == null) {
			vanBanDenImpl.setSoKiHieu(StringPool.BLANK);
		}
		else {
			vanBanDenImpl.setSoKiHieu(soKiHieu);
		}

		vanBanDenImpl.setSoVanBanId(soVanBanId);
		vanBanDenImpl.setLoaiVanBanId(loaiVanBanId);

		if (date == Long.MIN_VALUE) {
			vanBanDenImpl.setDate(null);
		}
		else {
			vanBanDenImpl.setDate(new Date(date));
		}

		vanBanDenImpl.setNguoiKiId(nguoiKiId);

		vanBanDenImpl.resetOriginalValues();

		return vanBanDenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		soKiHieu = objectInput.readUTF();
		soVanBanId = objectInput.readLong();
		loaiVanBanId = objectInput.readLong();
		date = objectInput.readLong();
		nguoiKiId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (soKiHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soKiHieu);
		}

		objectOutput.writeLong(soVanBanId);
		objectOutput.writeLong(loaiVanBanId);
		objectOutput.writeLong(date);
		objectOutput.writeLong(nguoiKiId);
	}

	public long id;
	public String soKiHieu;
	public long soVanBanId;
	public long loaiVanBanId;
	public long date;
	public long nguoiKiId;
}