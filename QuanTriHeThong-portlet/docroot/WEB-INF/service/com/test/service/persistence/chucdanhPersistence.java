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

import com.test.model.chucdanh;

/**
 * The persistence interface for the chucdanh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see chucdanhPersistenceImpl
 * @see chucdanhUtil
 * @generated
 */
public interface chucdanhPersistence extends BasePersistence<chucdanh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link chucdanhUtil} to access the chucdanh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the chucdanh in the entity cache if it is enabled.
	*
	* @param chucdanh the chucdanh
	*/
	public void cacheResult(com.test.model.chucdanh chucdanh);

	/**
	* Caches the chucdanhs in the entity cache if it is enabled.
	*
	* @param chucdanhs the chucdanhs
	*/
	public void cacheResult(java.util.List<com.test.model.chucdanh> chucdanhs);

	/**
	* Creates a new chucdanh with the primary key. Does not add the chucdanh to the database.
	*
	* @param id the primary key for the new chucdanh
	* @return the new chucdanh
	*/
	public com.test.model.chucdanh create(long id);

	/**
	* Removes the chucdanh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh that was removed
	* @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.chucdanh remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchchucdanhException;

	public com.test.model.chucdanh updateImpl(com.test.model.chucdanh chucdanh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the chucdanh with the primary key or throws a {@link com.test.NoSuchchucdanhException} if it could not be found.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh
	* @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.chucdanh findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchchucdanhException;

	/**
	* Returns the chucdanh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh, or <code>null</code> if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.chucdanh fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the chucdanhs.
	*
	* @return the chucdanhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.chucdanh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the chucdanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.chucdanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chucdanhs
	* @param end the upper bound of the range of chucdanhs (not inclusive)
	* @return the range of chucdanhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.chucdanh> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the chucdanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.chucdanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chucdanhs
	* @param end the upper bound of the range of chucdanhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of chucdanhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.chucdanh> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the chucdanhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of chucdanhs.
	*
	* @return the number of chucdanhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}