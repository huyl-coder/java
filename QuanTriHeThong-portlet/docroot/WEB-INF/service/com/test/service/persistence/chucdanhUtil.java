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

import com.test.model.chucdanh;

import java.util.List;

/**
 * The persistence utility for the chucdanh service. This utility wraps {@link chucdanhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see chucdanhPersistence
 * @see chucdanhPersistenceImpl
 * @generated
 */
public class chucdanhUtil {
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
	public static void clearCache(chucdanh chucdanh) {
		getPersistence().clearCache(chucdanh);
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
	public static List<chucdanh> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<chucdanh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<chucdanh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static chucdanh update(chucdanh chucdanh) throws SystemException {
		return getPersistence().update(chucdanh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static chucdanh update(chucdanh chucdanh,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(chucdanh, serviceContext);
	}

	/**
	* Caches the chucdanh in the entity cache if it is enabled.
	*
	* @param chucdanh the chucdanh
	*/
	public static void cacheResult(com.test.model.chucdanh chucdanh) {
		getPersistence().cacheResult(chucdanh);
	}

	/**
	* Caches the chucdanhs in the entity cache if it is enabled.
	*
	* @param chucdanhs the chucdanhs
	*/
	public static void cacheResult(
		java.util.List<com.test.model.chucdanh> chucdanhs) {
		getPersistence().cacheResult(chucdanhs);
	}

	/**
	* Creates a new chucdanh with the primary key. Does not add the chucdanh to the database.
	*
	* @param id the primary key for the new chucdanh
	* @return the new chucdanh
	*/
	public static com.test.model.chucdanh create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the chucdanh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh that was removed
	* @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.chucdanh remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchchucdanhException {
		return getPersistence().remove(id);
	}

	public static com.test.model.chucdanh updateImpl(
		com.test.model.chucdanh chucdanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(chucdanh);
	}

	/**
	* Returns the chucdanh with the primary key or throws a {@link com.test.NoSuchchucdanhException} if it could not be found.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh
	* @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.chucdanh findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchchucdanhException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the chucdanh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh, or <code>null</code> if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.chucdanh fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the chucdanhs.
	*
	* @return the chucdanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.chucdanh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.test.model.chucdanh> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.test.model.chucdanh> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the chucdanhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of chucdanhs.
	*
	* @return the number of chucdanhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static chucdanhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (chucdanhPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					chucdanhPersistence.class.getName());

			ReferenceRegistry.registerReference(chucdanhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(chucdanhPersistence persistence) {
	}

	private static chucdanhPersistence _persistence;
}