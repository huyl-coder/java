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
 * Provides a wrapper for {@link loaivanbanLocalService}.
 *
 * @author Duy Nguyen
 * @see loaivanbanLocalService
 * @generated
 */
public class loaivanbanLocalServiceWrapper implements loaivanbanLocalService,
	ServiceWrapper<loaivanbanLocalService> {
	public loaivanbanLocalServiceWrapper(
		loaivanbanLocalService loaivanbanLocalService) {
		_loaivanbanLocalService = loaivanbanLocalService;
	}

	/**
	* Adds the loaivanban to the database. Also notifies the appropriate model listeners.
	*
	* @param loaivanban the loaivanban
	* @return the loaivanban that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.loaivanban addloaivanban(
		com.test.model.loaivanban loaivanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.addloaivanban(loaivanban);
	}

	/**
	* Creates a new loaivanban with the primary key. Does not add the loaivanban to the database.
	*
	* @param id the primary key for the new loaivanban
	* @return the new loaivanban
	*/
	@Override
	public com.test.model.loaivanban createloaivanban(long id) {
		return _loaivanbanLocalService.createloaivanban(id);
	}

	/**
	* Deletes the loaivanban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban that was removed
	* @throws PortalException if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.loaivanban deleteloaivanban(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.deleteloaivanban(id);
	}

	/**
	* Deletes the loaivanban from the database. Also notifies the appropriate model listeners.
	*
	* @param loaivanban the loaivanban
	* @return the loaivanban that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.loaivanban deleteloaivanban(
		com.test.model.loaivanban loaivanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.deleteloaivanban(loaivanban);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loaivanbanLocalService.dynamicQuery();
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
		return _loaivanbanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.loaivanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaivanbanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.loaivanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaivanbanLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _loaivanbanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _loaivanbanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.test.model.loaivanban fetchloaivanban(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.fetchloaivanban(id);
	}

	/**
	* Returns the loaivanban with the primary key.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban
	* @throws PortalException if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.loaivanban getloaivanban(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.getloaivanban(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.test.model.loaivanban> getloaivanbans(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.getloaivanbans(start, end);
	}

	/**
	* Returns the number of loaivanbans.
	*
	* @return the number of loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getloaivanbansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.getloaivanbansCount();
	}

	/**
	* Updates the loaivanban in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loaivanban the loaivanban
	* @return the loaivanban that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.loaivanban updateloaivanban(
		com.test.model.loaivanban loaivanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaivanbanLocalService.updateloaivanban(loaivanban);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _loaivanbanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_loaivanbanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _loaivanbanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public loaivanbanLocalService getWrappedloaivanbanLocalService() {
		return _loaivanbanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedloaivanbanLocalService(
		loaivanbanLocalService loaivanbanLocalService) {
		_loaivanbanLocalService = loaivanbanLocalService;
	}

	@Override
	public loaivanbanLocalService getWrappedService() {
		return _loaivanbanLocalService;
	}

	@Override
	public void setWrappedService(loaivanbanLocalService loaivanbanLocalService) {
		_loaivanbanLocalService = loaivanbanLocalService;
	}

	private loaivanbanLocalService _loaivanbanLocalService;
}