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

package ispace.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ispace.model.KieuVanBan;

/**
 * The persistence interface for the kieu van ban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see KieuVanBanPersistenceImpl
 * @see KieuVanBanUtil
 * @generated
 */
public interface KieuVanBanPersistence extends BasePersistence<KieuVanBan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KieuVanBanUtil} to access the kieu van ban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the kieu van ban in the entity cache if it is enabled.
	*
	* @param kieuVanBan the kieu van ban
	*/
	public void cacheResult(ispace.model.KieuVanBan kieuVanBan);

	/**
	* Caches the kieu van bans in the entity cache if it is enabled.
	*
	* @param kieuVanBans the kieu van bans
	*/
	public void cacheResult(java.util.List<ispace.model.KieuVanBan> kieuVanBans);

	/**
	* Creates a new kieu van ban with the primary key. Does not add the kieu van ban to the database.
	*
	* @param id the primary key for the new kieu van ban
	* @return the new kieu van ban
	*/
	public ispace.model.KieuVanBan create(long id);

	/**
	* Removes the kieu van ban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban that was removed
	* @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.KieuVanBan remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchKieuVanBanException;

	public ispace.model.KieuVanBan updateImpl(
		ispace.model.KieuVanBan kieuVanBan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kieu van ban with the primary key or throws a {@link ispace.NoSuchKieuVanBanException} if it could not be found.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban
	* @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.KieuVanBan findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchKieuVanBanException;

	/**
	* Returns the kieu van ban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban, or <code>null</code> if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.KieuVanBan fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kieu van bans.
	*
	* @return the kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.KieuVanBan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the kieu van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kieu van bans
	* @param end the upper bound of the range of kieu van bans (not inclusive)
	* @return the range of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.KieuVanBan> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the kieu van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kieu van bans
	* @param end the upper bound of the range of kieu van bans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.KieuVanBan> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kieu van bans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kieu van bans.
	*
	* @return the number of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}