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

import com.test.model.phongban;

/**
 * The persistence interface for the phongban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see phongbanPersistenceImpl
 * @see phongbanUtil
 * @generated
 */
public interface phongbanPersistence extends BasePersistence<phongban> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link phongbanUtil} to access the phongban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the phongban in the entity cache if it is enabled.
	*
	* @param phongban the phongban
	*/
	public void cacheResult(com.test.model.phongban phongban);

	/**
	* Caches the phongbans in the entity cache if it is enabled.
	*
	* @param phongbans the phongbans
	*/
	public void cacheResult(java.util.List<com.test.model.phongban> phongbans);

	/**
	* Creates a new phongban with the primary key. Does not add the phongban to the database.
	*
	* @param id the primary key for the new phongban
	* @return the new phongban
	*/
	public com.test.model.phongban create(long id);

	/**
	* Removes the phongban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phongban
	* @return the phongban that was removed
	* @throws com.test.NoSuchphongbanException if a phongban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.phongban remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchphongbanException;

	public com.test.model.phongban updateImpl(com.test.model.phongban phongban)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phongban with the primary key or throws a {@link com.test.NoSuchphongbanException} if it could not be found.
	*
	* @param id the primary key of the phongban
	* @return the phongban
	* @throws com.test.NoSuchphongbanException if a phongban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.phongban findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchphongbanException;

	/**
	* Returns the phongban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phongban
	* @return the phongban, or <code>null</code> if a phongban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.phongban fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phongbans.
	*
	* @return the phongbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.phongban> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the phongbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.phongbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phongbans
	* @param end the upper bound of the range of phongbans (not inclusive)
	* @return the range of phongbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.phongban> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the phongbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.phongbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phongbans
	* @param end the upper bound of the range of phongbans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phongbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.phongban> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phongbans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of phongbans.
	*
	* @return the number of phongbans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}