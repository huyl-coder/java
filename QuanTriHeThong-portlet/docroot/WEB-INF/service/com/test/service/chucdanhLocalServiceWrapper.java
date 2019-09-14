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
 * Provides a wrapper for {@link chucdanhLocalService}.
 *
 * @author Duy Nguyen
 * @see chucdanhLocalService
 * @generated
 */
public class chucdanhLocalServiceWrapper implements chucdanhLocalService,
	ServiceWrapper<chucdanhLocalService> {
	public chucdanhLocalServiceWrapper(
		chucdanhLocalService chucdanhLocalService) {
		_chucdanhLocalService = chucdanhLocalService;
	}

	/**
	* Adds the chucdanh to the database. Also notifies the appropriate model listeners.
	*
	* @param chucdanh the chucdanh
	* @return the chucdanh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.chucdanh addchucdanh(com.test.model.chucdanh chucdanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.addchucdanh(chucdanh);
	}

	/**
	* Creates a new chucdanh with the primary key. Does not add the chucdanh to the database.
	*
	* @param id the primary key for the new chucdanh
	* @return the new chucdanh
	*/
	@Override
	public com.test.model.chucdanh createchucdanh(long id) {
		return _chucdanhLocalService.createchucdanh(id);
	}

	/**
	* Deletes the chucdanh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh that was removed
	* @throws PortalException if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.chucdanh deletechucdanh(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.deletechucdanh(id);
	}

	/**
	* Deletes the chucdanh from the database. Also notifies the appropriate model listeners.
	*
	* @param chucdanh the chucdanh
	* @return the chucdanh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.chucdanh deletechucdanh(
		com.test.model.chucdanh chucdanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.deletechucdanh(chucdanh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _chucdanhLocalService.dynamicQuery();
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
		return _chucdanhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.chucdanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _chucdanhLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.chucdanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _chucdanhLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _chucdanhLocalService.dynamicQueryCount(dynamicQuery);
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
		return _chucdanhLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.test.model.chucdanh fetchchucdanh(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.fetchchucdanh(id);
	}

	/**
	* Returns the chucdanh with the primary key.
	*
	* @param id the primary key of the chucdanh
	* @return the chucdanh
	* @throws PortalException if a chucdanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.chucdanh getchucdanh(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.getchucdanh(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.test.model.chucdanh> getchucdanhs(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.getchucdanhs(start, end);
	}

	/**
	* Returns the number of chucdanhs.
	*
	* @return the number of chucdanhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getchucdanhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.getchucdanhsCount();
	}

	/**
	* Updates the chucdanh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param chucdanh the chucdanh
	* @return the chucdanh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.chucdanh updatechucdanh(
		com.test.model.chucdanh chucdanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chucdanhLocalService.updatechucdanh(chucdanh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _chucdanhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_chucdanhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _chucdanhLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public chucdanhLocalService getWrappedchucdanhLocalService() {
		return _chucdanhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedchucdanhLocalService(
		chucdanhLocalService chucdanhLocalService) {
		_chucdanhLocalService = chucdanhLocalService;
	}

	@Override
	public chucdanhLocalService getWrappedService() {
		return _chucdanhLocalService;
	}

	@Override
	public void setWrappedService(chucdanhLocalService chucdanhLocalService) {
		_chucdanhLocalService = chucdanhLocalService;
	}

	private chucdanhLocalService _chucdanhLocalService;
}