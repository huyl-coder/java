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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import ispace.model.VanBanDen;
import ispace.model.VanBanDenModel;
import ispace.model.VanBanDenSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the VanBanDen service. Represents a row in the &quot;vanbanden&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ispace.model.VanBanDenModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VanBanDenImpl}.
 * </p>
 *
 * @author PC
 * @see VanBanDenImpl
 * @see ispace.model.VanBanDen
 * @see ispace.model.VanBanDenModel
 * @generated
 */
@JSON(strict = true)
public class VanBanDenModelImpl extends BaseModelImpl<VanBanDen>
	implements VanBanDenModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a van ban den model instance should use the {@link ispace.model.VanBanDen} interface instead.
	 */
	public static final String TABLE_NAME = "vanbanden";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "sokihieu", Types.VARCHAR },
			{ "sovanbanid", Types.BIGINT },
			{ "loaivanbanid", Types.BIGINT },
			{ "ngay", Types.TIMESTAMP },
			{ "nguoikiid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table vanbanden (id LONG not null primary key,sokihieu VARCHAR(75) null,sovanbanid LONG,loaivanbanid LONG,ngay DATE null,nguoikiid LONG)";
	public static final String TABLE_SQL_DROP = "drop table vanbanden";
	public static final String ORDER_BY_JPQL = " ORDER BY vanBanDen.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vanbanden.id ASC";
	public static final String DATA_SOURCE = "qlyvanbanDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.ispace.model.VanBanDen"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.ispace.model.VanBanDen"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VanBanDen toModel(VanBanDenSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		VanBanDen model = new VanBanDenImpl();

		model.setId(soapModel.getId());
		model.setSoKiHieu(soapModel.getSoKiHieu());
		model.setSoVanBanId(soapModel.getSoVanBanId());
		model.setLoaiVanBanId(soapModel.getLoaiVanBanId());
		model.setDate(soapModel.getDate());
		model.setNguoiKiId(soapModel.getNguoiKiId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VanBanDen> toModels(VanBanDenSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<VanBanDen> models = new ArrayList<VanBanDen>(soapModels.length);

		for (VanBanDenSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.ispace.model.VanBanDen"));

	public VanBanDenModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VanBanDen.class;
	}

	@Override
	public String getModelClassName() {
		return VanBanDen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("soKiHieu", getSoKiHieu());
		attributes.put("soVanBanId", getSoVanBanId());
		attributes.put("loaiVanBanId", getLoaiVanBanId());
		attributes.put("date", getDate());
		attributes.put("nguoiKiId", getNguoiKiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String soKiHieu = (String)attributes.get("soKiHieu");

		if (soKiHieu != null) {
			setSoKiHieu(soKiHieu);
		}

		Long soVanBanId = (Long)attributes.get("soVanBanId");

		if (soVanBanId != null) {
			setSoVanBanId(soVanBanId);
		}

		Long loaiVanBanId = (Long)attributes.get("loaiVanBanId");

		if (loaiVanBanId != null) {
			setLoaiVanBanId(loaiVanBanId);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Long nguoiKiId = (Long)attributes.get("nguoiKiId");

		if (nguoiKiId != null) {
			setNguoiKiId(nguoiKiId);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public String getSoKiHieu() {
		if (_soKiHieu == null) {
			return StringPool.BLANK;
		}
		else {
			return _soKiHieu;
		}
	}

	@Override
	public void setSoKiHieu(String soKiHieu) {
		_soKiHieu = soKiHieu;
	}

	@JSON
	@Override
	public long getSoVanBanId() {
		return _soVanBanId;
	}

	@Override
	public void setSoVanBanId(long soVanBanId) {
		_soVanBanId = soVanBanId;
	}

	@JSON
	@Override
	public long getLoaiVanBanId() {
		return _loaiVanBanId;
	}

	@Override
	public void setLoaiVanBanId(long loaiVanBanId) {
		_loaiVanBanId = loaiVanBanId;
	}

	@JSON
	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public void setDate(Date date) {
		_date = date;
	}

	@JSON
	@Override
	public long getNguoiKiId() {
		return _nguoiKiId;
	}

	@Override
	public void setNguoiKiId(long nguoiKiId) {
		_nguoiKiId = nguoiKiId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VanBanDen.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VanBanDen toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VanBanDen)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VanBanDenImpl vanBanDenImpl = new VanBanDenImpl();

		vanBanDenImpl.setId(getId());
		vanBanDenImpl.setSoKiHieu(getSoKiHieu());
		vanBanDenImpl.setSoVanBanId(getSoVanBanId());
		vanBanDenImpl.setLoaiVanBanId(getLoaiVanBanId());
		vanBanDenImpl.setDate(getDate());
		vanBanDenImpl.setNguoiKiId(getNguoiKiId());

		vanBanDenImpl.resetOriginalValues();

		return vanBanDenImpl;
	}

	@Override
	public int compareTo(VanBanDen vanBanDen) {
		long primaryKey = vanBanDen.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VanBanDen)) {
			return false;
		}

		VanBanDen vanBanDen = (VanBanDen)obj;

		long primaryKey = vanBanDen.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<VanBanDen> toCacheModel() {
		VanBanDenCacheModel vanBanDenCacheModel = new VanBanDenCacheModel();

		vanBanDenCacheModel.id = getId();

		vanBanDenCacheModel.soKiHieu = getSoKiHieu();

		String soKiHieu = vanBanDenCacheModel.soKiHieu;

		if ((soKiHieu != null) && (soKiHieu.length() == 0)) {
			vanBanDenCacheModel.soKiHieu = null;
		}

		vanBanDenCacheModel.soVanBanId = getSoVanBanId();

		vanBanDenCacheModel.loaiVanBanId = getLoaiVanBanId();

		Date date = getDate();

		if (date != null) {
			vanBanDenCacheModel.date = date.getTime();
		}
		else {
			vanBanDenCacheModel.date = Long.MIN_VALUE;
		}

		vanBanDenCacheModel.nguoiKiId = getNguoiKiId();

		return vanBanDenCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", soKiHieu=");
		sb.append(getSoKiHieu());
		sb.append(", soVanBanId=");
		sb.append(getSoVanBanId());
		sb.append(", loaiVanBanId=");
		sb.append(getLoaiVanBanId());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", nguoiKiId=");
		sb.append(getNguoiKiId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("ispace.model.VanBanDen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soKiHieu</column-name><column-value><![CDATA[");
		sb.append(getSoKiHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soVanBanId</column-name><column-value><![CDATA[");
		sb.append(getSoVanBanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiVanBanId</column-name><column-value><![CDATA[");
		sb.append(getLoaiVanBanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiKiId</column-name><column-value><![CDATA[");
		sb.append(getNguoiKiId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VanBanDen.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			VanBanDen.class
		};
	private long _id;
	private String _soKiHieu;
	private long _soVanBanId;
	private long _loaiVanBanId;
	private Date _date;
	private long _nguoiKiId;
	private VanBanDen _escapedModel;
}