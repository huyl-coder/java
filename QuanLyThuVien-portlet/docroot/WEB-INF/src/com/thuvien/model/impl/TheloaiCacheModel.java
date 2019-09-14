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

import com.thuvien.model.Theloai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Theloai in entity cache.
 *
 * @author PC
 * @see Theloai
 * @generated
 */
public class TheloaiCacheModel implements CacheModel<Theloai>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ten=");
		sb.append(ten);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Theloai toEntityModel() {
		TheloaiImpl theloaiImpl = new TheloaiImpl();

		theloaiImpl.setId(id);

		if (ten == null) {
			theloaiImpl.setTen(StringPool.BLANK);
		}
		else {
			theloaiImpl.setTen(ten);
		}

		theloaiImpl.resetOriginalValues();

		return theloaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		ten = objectInput.readUTF();
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
	}

	public long id;
	public String ten;
}