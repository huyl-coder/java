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
 * This class is used by SOAP remote services, specifically {@link com.thuvien.service.http.TheloaiServiceSoap}.
 *
 * @author PC
 * @see com.thuvien.service.http.TheloaiServiceSoap
 * @generated
 */
public class TheloaiSoap implements Serializable {
	public static TheloaiSoap toSoapModel(Theloai model) {
		TheloaiSoap soapModel = new TheloaiSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());

		return soapModel;
	}

	public static TheloaiSoap[] toSoapModels(Theloai[] models) {
		TheloaiSoap[] soapModels = new TheloaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TheloaiSoap[][] toSoapModels(Theloai[][] models) {
		TheloaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TheloaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TheloaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TheloaiSoap[] toSoapModels(List<Theloai> models) {
		List<TheloaiSoap> soapModels = new ArrayList<TheloaiSoap>(models.size());

		for (Theloai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TheloaiSoap[soapModels.size()]);
	}

	public TheloaiSoap() {
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

	private long _id;
	private String _ten;
}