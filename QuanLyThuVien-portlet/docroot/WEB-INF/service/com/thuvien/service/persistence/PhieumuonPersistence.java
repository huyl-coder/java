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

package com.thuvien.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.thuvien.model.Phieumuon;

/**
 * The persistence interface for the phieumuon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see PhieumuonPersistenceImpl
 * @see PhieumuonUtil
 * @generated
 */
public interface PhieumuonPersistence extends BasePersistence<Phieumuon> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhieumuonUtil} to access the phieumuon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the phieumuon in the entity cache if it is enabled.
	*
	* @param phieumuon the phieumuon
	*/
	public void cacheResult(com.thuvien.model.Phieumuon phieumuon);

	/**
	* Caches the phieumuons in the entity cache if it is enabled.
	*
	* @param phieumuons the phieumuons
	*/
	public void cacheResult(
		java.util.List<com.thuvien.model.Phieumuon> phieumuons);

	/**
	* Creates a new phieumuon with the primary key. Does not add the phieumuon to the database.
	*
	* @param id the primary key for the new phieumuon
	* @return the new phieumuon
	*/
	public com.thuvien.model.Phieumuon create(long id);

	/**
	* Removes the phieumuon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon that was removed
	* @throws com.thuvien.NoSuchPhieumuonException if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thuvien.model.Phieumuon remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thuvien.NoSuchPhieumuonException;

	public com.thuvien.model.Phieumuon updateImpl(
		com.thuvien.model.Phieumuon phieumuon)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phieumuon with the primary key or throws a {@link com.thuvien.NoSuchPhieumuonException} if it could not be found.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon
	* @throws com.thuvien.NoSuchPhieumuonException if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thuvien.model.Phieumuon findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thuvien.NoSuchPhieumuonException;

	/**
	* Returns the phieumuon with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon, or <code>null</code> if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thuvien.model.Phieumuon fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phieumuons.
	*
	* @return the phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thuvien.model.Phieumuon> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the phieumuons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhieumuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieumuons
	* @param end the upper bound of the range of phieumuons (not inclusive)
	* @return the range of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thuvien.model.Phieumuon> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the phieumuons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhieumuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieumuons
	* @param end the upper bound of the range of phieumuons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thuvien.model.Phieumuon> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phieumuons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of phieumuons.
	*
	* @return the number of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}