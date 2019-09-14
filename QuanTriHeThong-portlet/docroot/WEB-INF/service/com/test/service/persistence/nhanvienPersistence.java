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

import com.test.model.nhanvien;

/**
 * The persistence interface for the nhanvien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see nhanvienPersistenceImpl
 * @see nhanvienUtil
 * @generated
 */
public interface nhanvienPersistence extends BasePersistence<nhanvien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link nhanvienUtil} to access the nhanvien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the nhanvien in the entity cache if it is enabled.
	*
	* @param nhanvien the nhanvien
	*/
	public void cacheResult(com.test.model.nhanvien nhanvien);

	/**
	* Caches the nhanviens in the entity cache if it is enabled.
	*
	* @param nhanviens the nhanviens
	*/
	public void cacheResult(java.util.List<com.test.model.nhanvien> nhanviens);

	/**
	* Creates a new nhanvien with the primary key. Does not add the nhanvien to the database.
	*
	* @param id the primary key for the new nhanvien
	* @return the new nhanvien
	*/
	public com.test.model.nhanvien create(long id);

	/**
	* Removes the nhanvien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the nhanvien
	* @return the nhanvien that was removed
	* @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.nhanvien remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchnhanvienException;

	public com.test.model.nhanvien updateImpl(com.test.model.nhanvien nhanvien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the nhanvien with the primary key or throws a {@link com.test.NoSuchnhanvienException} if it could not be found.
	*
	* @param id the primary key of the nhanvien
	* @return the nhanvien
	* @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.nhanvien findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchnhanvienException;

	/**
	* Returns the nhanvien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the nhanvien
	* @return the nhanvien, or <code>null</code> if a nhanvien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.nhanvien fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nhanviens.
	*
	* @return the nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.nhanvien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the nhanviens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhanvienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhanviens
	* @param end the upper bound of the range of nhanviens (not inclusive)
	* @return the range of nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.nhanvien> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the nhanviens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhanvienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhanviens
	* @param end the upper bound of the range of nhanviens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.nhanvien> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the nhanviens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nhanviens.
	*
	* @return the number of nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}