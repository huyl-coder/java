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

package com.test.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link phongbanLocalService}.
 *
 * @author Duy Nguyen
 * @see phongbanLocalService
 * @generated
 */
public class phongbanLocalServiceWrapper implements phongbanLocalService,
	ServiceWrapper<phongbanLocalService> {
	public phongbanLocalServiceWrapper(
		phongbanLocalService phongbanLocalService) {
		_phongbanLocalService = phongbanLocalService;
	}

	/**
	* Adds the phongban to the database. Also notifies the appropriate model listeners.
	*
	* @param phongban the phongban
	* @return the phongban that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.phongban addphongban(com.test.model.phongban phongban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.addphongban(phongban);
	}

	/**
	* Creates a new phongban with the primary key. Does not add the phongban to the database.
	*
	* @param id the primary key for the new phongban
	* @return the new phongban
	*/
	@Override
	public com.test.model.phongban createphongban(long id) {
		return _phongbanLocalService.createphongban(id);
	}

	/**
	* Deletes the phongban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phongban
	* @return the phongban that was removed
	* @throws PortalException if a phongban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.phongban deletephongban(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.deletephongban(id);
	}

	/**
	* Deletes the phongban from the database. Also notifies the appropriate model listeners.
	*
	* @param phongban the phongban
	* @return the phongban that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.phongban deletephongban(
		com.test.model.phongban phongban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.deletephongban(phongban);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phongbanLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.phongbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.phongbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.test.model.phongban fetchphongban(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.fetchphongban(id);
	}

	/**
	* Returns the phongban with the primary key.
	*
	* @param id the primary key of the phongban
	* @return the phongban
	* @throws PortalException if a phongban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.phongban getphongban(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.getphongban(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.test.model.phongban> getphongbans(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.getphongbans(start, end);
	}

	/**
	* Returns the number of phongbans.
	*
	* @return the number of phongbans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getphongbansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.getphongbansCount();
	}

	/**
	* Updates the phongban in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phongban the phongban
	* @return the phongban that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.phongban updatephongban(
		com.test.model.phongban phongban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongbanLocalService.updatephongban(phongban);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phongbanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phongbanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phongbanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public phongbanLocalService getWrappedphongbanLocalService() {
		return _phongbanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedphongbanLocalService(
		phongbanLocalService phongbanLocalService) {
		_phongbanLocalService = phongbanLocalService;
	}

	@Override
	public phongbanLocalService getWrappedService() {
		return _phongbanLocalService;
	}

	@Override
	public void setWrappedService(phongbanLocalService phongbanLocalService) {
		_phongbanLocalService = phongbanLocalService;
	}

	private phongbanLocalService _phongbanLocalService;
}