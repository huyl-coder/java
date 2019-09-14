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
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.loaivanbanServiceSoap}.
 *
 * @author Duy Nguyen
 * @see com.test.service.http.loaivanbanServiceSoap
 * @generated
 */
public class loaivanbanSoap implements Serializable {
	public static loaivanbanSoap toSoapModel(loaivanban model) {
		loaivanbanSoap soapModel = new loaivanbanSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());

		return soapModel;
	}

	public static loaivanbanSoap[] toSoapModels(loaivanban[] models) {
		loaivanbanSoap[] soapModels = new loaivanbanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static loaivanbanSoap[][] toSoapModels(loaivanban[][] models) {
		loaivanbanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new loaivanbanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new loaivanbanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static loaivanbanSoap[] toSoapModels(List<loaivanban> models) {
		List<loaivanbanSoap> soapModels = new ArrayList<loaivanbanSoap>(models.size());

		for (loaivanban model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new loaivanbanSoap[soapModels.size()]);
	}

	public loaivanbanSoap() {
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