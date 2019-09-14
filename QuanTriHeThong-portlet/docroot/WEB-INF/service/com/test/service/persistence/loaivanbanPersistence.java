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

import com.test.model.loaivanban;

/**
 * The persistence interface for the loaivanban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see loaivanbanPersistenceImpl
 * @see loaivanbanUtil
 * @generated
 */
public interface loaivanbanPersistence extends BasePersistence<loaivanban> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link loaivanbanUtil} to access the loaivanban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the loaivanban in the entity cache if it is enabled.
	*
	* @param loaivanban the loaivanban
	*/
	public void cacheResult(com.test.model.loaivanban loaivanban);

	/**
	* Caches the loaivanbans in the entity cache if it is enabled.
	*
	* @param loaivanbans the loaivanbans
	*/
	public void cacheResult(
		java.util.List<com.test.model.loaivanban> loaivanbans);

	/**
	* Creates a new loaivanban with the primary key. Does not add the loaivanban to the database.
	*
	* @param id the primary key for the new loaivanban
	* @return the new loaivanban
	*/
	public com.test.model.loaivanban create(long id);

	/**
	* Removes the loaivanban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban that was removed
	* @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.loaivanban remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchloaivanbanException;

	public com.test.model.loaivanban updateImpl(
		com.test.model.loaivanban loaivanban)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loaivanban with the primary key or throws a {@link com.test.NoSuchloaivanbanException} if it could not be found.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban
	* @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.loaivanban findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchloaivanbanException;

	/**
	* Returns the loaivanban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban, or <code>null</code> if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.loaivanban fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loaivanbans.
	*
	* @return the loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.loaivanban> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the loaivanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.loaivanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loaivanbans
	* @param end the upper bound of the range of loaivanbans (not inclusive)
	* @return the range of loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.loaivanban> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the loaivanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.loaivanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loaivanbans
	* @param end the upper bound of the range of loaivanbans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.loaivanban> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loaivanbans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loaivanbans.
	*
	* @return the number of loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}