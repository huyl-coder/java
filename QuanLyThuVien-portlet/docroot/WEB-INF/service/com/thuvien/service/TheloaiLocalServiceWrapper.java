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

package com.thuvien.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TheloaiLocalService}.
 *
 * @author PC
 * @see TheloaiLocalService
 * @generated
 */
public class TheloaiLocalServiceWrapper implements TheloaiLocalService,
	ServiceWrapper<TheloaiLocalService> {
	public TheloaiLocalServiceWrapper(TheloaiLocalService theloaiLocalService) {
		_theloaiLocalService = theloaiLocalService;
	}

	/**
	* Adds the theloai to the database. Also notifies the appropriate model listeners.
	*
	* @param theloai the theloai
	* @return the theloai that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Theloai addTheloai(
		com.thuvien.model.Theloai theloai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.addTheloai(theloai);
	}

	/**
	* Creates a new theloai with the primary key. Does not add the theloai to the database.
	*
	* @param id the primary key for the new theloai
	* @return the new theloai
	*/
	@Override
	public com.thuvien.model.Theloai createTheloai(long id) {
		return _theloaiLocalService.createTheloai(id);
	}

	/**
	* Deletes the theloai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the theloai
	* @return the theloai that was removed
	* @throws PortalException if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Theloai deleteTheloai(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.deleteTheloai(id);
	}

	/**
	* Deletes the theloai from the database. Also notifies the appropriate model listeners.
	*
	* @param theloai the theloai
	* @return the theloai that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Theloai deleteTheloai(
		com.thuvien.model.Theloai theloai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.deleteTheloai(theloai);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _theloaiLocalService.dynamicQuery();
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
		return _theloaiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.TheloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _theloaiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.TheloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _theloaiLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _theloaiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _theloaiLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.thuvien.model.Theloai fetchTheloai(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.fetchTheloai(id);
	}

	/**
	* Returns the theloai with the primary key.
	*
	* @param id the primary key of the theloai
	* @return the theloai
	* @throws PortalException if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Theloai getTheloai(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.getTheloai(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the theloais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.TheloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of theloais
	* @param end the upper bound of the range of theloais (not inclusive)
	* @return the range of theloais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.thuvien.model.Theloai> getTheloais(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.getTheloais(start, end);
	}

	/**
	* Returns the number of theloais.
	*
	* @return the number of theloais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTheloaisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.getTheloaisCount();
	}

	/**
	* Updates the theloai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param theloai the theloai
	* @return the theloai that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Theloai updateTheloai(
		com.thuvien.model.Theloai theloai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _theloaiLocalService.updateTheloai(theloai);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _theloaiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_theloaiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _theloaiLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TheloaiLocalService getWrappedTheloaiLocalService() {
		return _theloaiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTheloaiLocalService(
		TheloaiLocalService theloaiLocalService) {
		_theloaiLocalService = theloaiLocalService;
	}

	@Override
	public TheloaiLocalService getWrappedService() {
		return _theloaiLocalService;
	}

	@Override
	public void setWrappedService(TheloaiLocalService theloaiLocalService) {
		_theloaiLocalService = theloaiLocalService;
	}

	private TheloaiLocalService _theloaiLocalService;
}