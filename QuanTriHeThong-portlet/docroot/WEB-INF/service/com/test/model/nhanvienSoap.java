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

package com.test.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.nhanvienServiceSoap}.
 *
 * @author Duy Nguyen
 * @see com.test.service.http.nhanvienServiceSoap
 * @generated
 */
public class nhanvienSoap implements Serializable {
	public static nhanvienSoap toSoapModel(nhanvien model) {
		nhanvienSoap soapModel = new nhanvienSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());

		return soapModel;
	}

	public static nhanvienSoap[] toSoapModels(nhanvien[] models) {
		nhanvienSoap[] soapModels = new nhanvienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static nhanvienSoap[][] toSoapModels(nhanvien[][] models) {
		nhanvienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new nhanvienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new nhanvienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static nhanvienSoap[] toSoapModels(List<nhanvien> models) {
		List<nhanvienSoap> soapModels = new ArrayList<nhanvienSoap>(models.size());

		for (nhanvien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new nhanvienSoap[soapModels.size()]);
	}

	public nhanvienSoap() {
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