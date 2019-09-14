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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ispace.model.NguoiDung;

import java.util.List;

/**
 * The persistence utility for the nguoi dung service. This utility wraps {@link NguoiDungPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see NguoiDungPersistence
 * @see NguoiDungPersistenceImpl
 * @generated
 */
public class NguoiDungUtil {
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
	public static void clearCache(NguoiDung nguoiDung) {
		getPersistence().clearCache(nguoiDung);
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
	public static List<NguoiDung> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NguoiDung> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NguoiDung> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NguoiDung update(NguoiDung nguoiDung)
		throws SystemException {
		return getPersistence().update(nguoiDung);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NguoiDung update(NguoiDung nguoiDung,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nguoiDung, serviceContext);
	}

	/**
	* Caches the nguoi dung in the entity cache if it is enabled.
	*
	* @param nguoiDung the nguoi dung
	*/
	public static void cacheResult(ispace.model.NguoiDung nguoiDung) {
		getPersistence().cacheResult(nguoiDung);
	}

	/**
	* Caches the nguoi dungs in the entity cache if it is enabled.
	*
	* @param nguoiDungs the nguoi dungs
	*/
	public static void cacheResult(
		java.util.List<ispace.model.NguoiDung> nguoiDungs) {
		getPersistence().cacheResult(nguoiDungs);
	}

	/**
	* Creates a new nguoi dung with the primary key. Does not add the nguoi dung to the database.
	*
	* @param id the primary key for the new nguoi dung
	* @return the new nguoi dung
	*/
	public static ispace.model.NguoiDung create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the nguoi dung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the nguoi dung
	* @return the nguoi dung that was removed
	* @throws ispace.NoSuchNguoiDungException if a nguoi dung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchNguoiDungException {
		return getPersistence().remove(id);
	}

	public static ispace.model.NguoiDung updateImpl(
		ispace.model.NguoiDung nguoiDung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nguoiDung);
	}

	/**
	* Returns the nguoi dung with the primary key or throws a {@link ispace.NoSuchNguoiDungException} if it could not be found.
	*
	* @param id the primary key of the nguoi dung
	* @return the nguoi dung
	* @throws ispace.NoSuchNguoiDungException if a nguoi dung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchNguoiDungException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the nguoi dung with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the nguoi dung
	* @return the nguoi dung, or <code>null</code> if a nguoi dung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the nguoi dungs.
	*
	* @return the nguoi dungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.NguoiDung> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nguoi dungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.NguoiDungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nguoi dungs
	* @param end the upper bound of the range of nguoi dungs (not inclusive)
	* @return the range of nguoi dungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.NguoiDung> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nguoi dungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.NguoiDungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nguoi dungs
	* @param end the upper bound of the range of nguoi dungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nguoi dungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.NguoiDung> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nguoi dungs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nguoi dungs.
	*
	* @return the number of nguoi dungs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NguoiDungPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NguoiDungPersistence)PortletBeanLocatorUtil.locate(ispace.service.ClpSerializer.getServletContextName(),
					NguoiDungPersistence.class.getName());

			ReferenceRegistry.registerReference(NguoiDungUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NguoiDungPersistence persistence) {
	}

	private static NguoiDungPersistence _persistence;
}