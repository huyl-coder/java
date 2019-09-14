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

package ispace.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.KieuVanBanServiceSoap}.
 *
 * @author PC
 * @see ispace.service.http.KieuVanBanServiceSoap
 * @generated
 */
public class KieuVanBanSoap implements Serializable {
	public static KieuVanBanSoap toSoapModel(KieuVanBan model) {
		KieuVanBanSoap soapModel = new KieuVanBanSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());

		return soapModel;
	}

	public static KieuVanBanSoap[] toSoapModels(KieuVanBan[] models) {
		KieuVanBanSoap[] soapModels = new KieuVanBanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KieuVanBanSoap[][] toSoapModels(KieuVanBan[][] models) {
		KieuVanBanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KieuVanBanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KieuVanBanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KieuVanBanSoap[] toSoapModels(List<KieuVanBan> models) {
		List<KieuVanBanSoap> soapModels = new ArrayList<KieuVanBanSoap>(models.size());

		for (KieuVanBan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KieuVanBanSoap[soapModels.size()]);
	}

	public KieuVanBanSoap() {
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