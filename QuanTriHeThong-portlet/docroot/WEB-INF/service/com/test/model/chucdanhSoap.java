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
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.chucdanhServiceSoap}.
 *
 * @author Duy Nguyen
 * @see com.test.service.http.chucdanhServiceSoap
 * @generated
 */
public class chucdanhSoap implements Serializable {
	public static chucdanhSoap toSoapModel(chucdanh model) {
		chucdanhSoap soapModel = new chucdanhSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());
		soapModel.setMa(model.getMa());

		return soapModel;
	}

	public static chucdanhSoap[] toSoapModels(chucdanh[] models) {
		chucdanhSoap[] soapModels = new chucdanhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static chucdanhSoap[][] toSoapModels(chucdanh[][] models) {
		chucdanhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new chucdanhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new chucdanhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static chucdanhSoap[] toSoapModels(List<chucdanh> models) {
		List<chucdanhSoap> soapModels = new ArrayList<chucdanhSoap>(models.size());

		for (chucdanh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new chucdanhSoap[soapModels.size()]);
	}

	public chucdanhSoap() {
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

	public String getMa() {
		return _ma;
	}

	public void setMa(String ma) {
		_ma = ma;
	}

	private long _id;
	private String _ten;
	private String _ma;
}