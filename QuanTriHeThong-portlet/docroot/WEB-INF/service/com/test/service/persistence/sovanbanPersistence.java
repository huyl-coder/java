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

package com.test.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.model.sovanban;

/**
 * The persistence interface for the sovanban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see sovanbanPersistenceImpl
 * @see sovanbanUtil
 * @generated
 */
public interface sovanbanPersistence extends BasePersistence<sovanban> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link sovanbanUtil} to access the sovanban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sovanban in the entity cache if it is enabled.
	*
	* @param sovanban the sovanban
	*/
	public void cacheResult(com.test.model.sovanban sovanban);

	/**
	* Caches the sovanbans in the entity cache if it is enabled.
	*
	* @param sovanbans the sovanbans
	*/
	public void cacheResult(java.util.List<com.test.model.sovanban> sovanbans);

	/**
	* Creates a new sovanban with the primary key. Does not add the sovanban to the database.
	*
	* @param id the primary key for the new sovanban
	* @return the new sovanban
	*/
	public com.test.model.sovanban create(long id);

	/**
	* Removes the sovanban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the sovanban
	* @return the sovanban that was removed
	* @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.sovanban remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchsovanbanException;

	public com.test.model.sovanban updateImpl(com.test.model.sovanban sovanban)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sovanban with the primary key or throws a {@link com.test.NoSuchsovanbanException} if it could not be found.
	*
	* @param id the primary key of the sovanban
	* @return the sovanban
	* @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.sovanban findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchsovanbanException;

	/**
	* Returns the sovanban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the sovanban
	* @return the sovanban, or <code>null</code> if a sovanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.sovanban fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sovanbans.
	*
	* @return the sovanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.sovanban> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the sovanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.sovanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sovanbans
	* @param end the upper bound of the range of sovanbans (not inclusive)
	* @return the range of sovanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.sovanban> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the sovanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.sovanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sovanbans
	* @param end the upper bound of the range of sovanbans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sovanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.sovanban> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sovanbans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sovanbans.
	*
	* @return the number of sovanbans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}