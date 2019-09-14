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
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.phongbanServiceSoap}.
 *
 * @author Duy Nguyen
 * @see com.test.service.http.phongbanServiceSoap
 * @generated
 */
public class phongbanSoap implements Serializable {
	public static phongbanSoap toSoapModel(phongban model) {
		phongbanSoap soapModel = new phongbanSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());

		return soapModel;
	}

	public static phongbanSoap[] toSoapModels(phongban[] models) {
		phongbanSoap[] soapModels = new phongbanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static phongbanSoap[][] toSoapModels(phongban[][] models) {
		phongbanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new phongbanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new phongbanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static phongbanSoap[] toSoapModels(List<phongban> models) {
		List<phongbanSoap> soapModels = new ArrayList<phongbanSoap>(models.size());

		for (phongban model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new phongbanSoap[soapModels.size()]);
	}

	public phongbanSoap() {
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