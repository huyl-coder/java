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

package com.test.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.chucdanh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing chucdanh in entity cache.
 *
 * @author Duy Nguyen
 * @see chucdanh
 * @generated
 */
public class chucdanhCacheModel implements CacheModel<chucdanh>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ten=");
		sb.append(ten);
		sb.append(", ma=");
		sb.append(ma);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public chucdanh toEntityModel() {
		chucdanhImpl chucdanhImpl = new chucdanhImpl();

		chucdanhImpl.setId(id);

		if (ten == null) {
			chucdanhImpl.setTen(StringPool.BLANK);
		}
		else {
			chucdanhImpl.setTen(ten);
		}

		if (ma == null) {
			chucdanhImpl.setMa(StringPool.BLANK);
		}
		else {
			chucdanhImpl.setMa(ma);
		}

		chucdanhImpl.resetOriginalValues();

		return chucdanhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		ten = objectInput.readUTF();
		ma = objectInput.readUTF();
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

		if (ma == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ma);
		}
	}

	public long id;
	public String ten;
	public String ma;
}