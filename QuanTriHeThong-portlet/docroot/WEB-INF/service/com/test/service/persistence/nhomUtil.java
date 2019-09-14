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

import com.test.model.nhom;

import java.util.List;

/**
 * The persistence utility for the nhom service. This utility wraps {@link nhomPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see nhomPersistence
 * @see nhomPersistenceImpl
 * @generated
 */
public class nhomUtil {
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
	public static void clearCache(nhom nhom) {
		getPersistence().clearCache(nhom);
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
	public static List<nhom> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<nhom> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<nhom> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static nhom update(nhom nhom) throws SystemException {
		return getPersistence().update(nhom);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static nhom update(nhom nhom, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(nhom, serviceContext);
	}

	/**
	* Caches the nhom in the entity cache if it is enabled.
	*
	* @param nhom the nhom
	*/
	public static void cacheResult(com.test.model.nhom nhom) {
		getPersistence().cacheResult(nhom);
	}

	/**
	* Caches the nhoms in the entity cache if it is enabled.
	*
	* @param nhoms the nhoms
	*/
	public static void cacheResult(java.util.List<com.test.model.nhom> nhoms) {
		getPersistence().cacheResult(nhoms);
	}

	/**
	* Creates a new nhom with the primary key. Does not add the nhom to the database.
	*
	* @param id the primary key for the new nhom
	* @return the new nhom
	*/
	public static com.test.model.nhom create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the nhom with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the nhom
	* @return the nhom that was removed
	* @throws com.test.NoSuchnhomException if a nhom with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.nhom remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchnhomException {
		return getPersistence().remove(id);
	}

	public static com.test.model.nhom updateImpl(com.test.model.nhom nhom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nhom);
	}

	/**
	* Returns the nhom with the primary key or throws a {@link com.test.NoSuchnhomException} if it could not be found.
	*
	* @param id the primary key of the nhom
	* @return the nhom
	* @throws com.test.NoSuchnhomException if a nhom with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.nhom findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchnhomException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the nhom with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the nhom
	* @return the nhom, or <code>null</code> if a nhom with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.nhom fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the nhoms.
	*
	* @return the nhoms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.nhom> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nhoms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhoms
	* @param end the upper bound of the range of nhoms (not inclusive)
	* @return the range of nhoms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.nhom> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nhoms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhoms
	* @param end the upper bound of the range of nhoms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhoms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.nhom> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nhoms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nhoms.
	*
	* @return the number of nhoms
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static nhomPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (nhomPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					nhomPersistence.class.getName());

			ReferenceRegistry.registerReference(nhomUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(nhomPersistence persistence) {
	}

	private static nhomPersistence _persistence;
}