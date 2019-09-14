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

import com.test.model.phongban;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing phongban in entity cache.
 *
 * @author Duy Nguyen
 * @see phongban
 * @generated
 */
public class phongbanCacheModel implements CacheModel<phongban>, Externalizable {
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
	public phongban toEntityModel() {
		phongbanImpl phongbanImpl = new phongbanImpl();

		phongbanImpl.setId(id);

		if (ten == null) {
			phongbanImpl.setTen(StringPool.BLANK);
		}
		else {
			phongbanImpl.setTen(ten);
		}

		phongbanImpl.resetOriginalValues();

		return phongbanImpl;
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