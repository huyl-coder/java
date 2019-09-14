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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.model.sovanban;

import java.util.List;

/**
 * The persistence utility for the sovanban service. This utility wraps {@link sovanbanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see sovanbanPersistence
 * @see sovanbanPersistenceImpl
 * @generated
 */
public class sovanbanUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(sovanban sovanban) {
		getPersistence().clearCache(sovanban);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<sovanban> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<sovanban> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<sovanban> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static sovanban update(sovanban sovanban) throws SystemException {
		return getPersistence().update(sovanban);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static sovanban update(sovanban sovanban,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sovanban, serviceContext);
	}

	/**
	* Caches the sovanban in the entity cache if it is enabled.
	*
	* @param sovanban the sovanban
	*/
	public static void cacheResult(com.test.model.sovanban sovanban) {
		getPersistence().cacheResult(sovanban);
	}

	/**
	* Caches the sovanbans in the entity cache if it is enabled.
	*
	* @param sovanbans the sovanbans
	*/
	public static void cacheResult(
		java.util.List<com.test.model.sovanban> sovanbans) {
		getPersistence().cacheResult(sovanbans);
	}

	/**
	* Creates a new sovanban with the primary key. Does not add the sovanban to the database.
	*
	* @param id the primary key for the new sovanban
	* @return the new sovanban
	*/
	public static com.test.model.sovanban create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the sovanban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the sovanban
	* @return the sovanban that was removed
	* @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.sovanban remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchsovanbanException {
		return getPersistence().remove(id);
	}

	public static com.test.model.sovanban updateImpl(
		com.test.model.sovanban sovanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sovanban);
	}

	/**
	* Returns the sovanban with the primary key or throws a {@link com.test.NoSuchsovanbanException} if it could not be found.
	*
	* @param id the primary key of the sovanban
	* @return the sovanban
	* @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.sovanban findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchsovanbanException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the sovanban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the sovanban
	* @return the sovanban, or <code>null</code> if a sovanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.sovanban fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the sovanbans.
	*
	* @return the sovanbans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.sovanban> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.test.model.sovanban> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.test.model.sovanban> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sovanbans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sovanbans.
	*
	* @return the number of sovanbans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static sovanbanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (sovanbanPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					sovanbanPersistence.class.getName());

			ReferenceRegistry.registerReference(sovanbanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(sovanbanPersistence persistence) {
	}

	private static sovanbanPersistence _persistence;
}