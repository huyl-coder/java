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

package ispace.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KieuVanBanLocalService}.
 *
 * @author PC
 * @see KieuVanBanLocalService
 * @generated
 */
public class KieuVanBanLocalServiceWrapper implements KieuVanBanLocalService,
	ServiceWrapper<KieuVanBanLocalService> {
	public KieuVanBanLocalServiceWrapper(
		KieuVanBanLocalService kieuVanBanLocalService) {
		_kieuVanBanLocalService = kieuVanBanLocalService;
	}

	/**
	* Adds the kieu van ban to the database. Also notifies the appropriate model listeners.
	*
	* @param kieuVanBan the kieu van ban
	* @return the kieu van ban that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.KieuVanBan addKieuVanBan(
		ispace.model.KieuVanBan kieuVanBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.addKieuVanBan(kieuVanBan);
	}

	/**
	* Creates a new kieu van ban with the primary key. Does not add the kieu van ban to the database.
	*
	* @param id the primary key for the new kieu van ban
	* @return the new kieu van ban
	*/
	@Override
	public ispace.model.KieuVanBan createKieuVanBan(long id) {
		return _kieuVanBanLocalService.createKieuVanBan(id);
	}

	/**
	* Deletes the kieu van ban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban that was removed
	* @throws PortalException if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.KieuVanBan deleteKieuVanBan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.deleteKieuVanBan(id);
	}

	/**
	* Deletes the kieu van ban from the database. Also notifies the appropriate model listeners.
	*
	* @param kieuVanBan the kieu van ban
	* @return the kieu van ban that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.KieuVanBan deleteKieuVanBan(
		ispace.model.KieuVanBan kieuVanBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.deleteKieuVanBan(kieuVanBan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kieuVanBanLocalService.dynamicQuery();
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
		return _kieuVanBanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kieuVanBanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kieuVanBanLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _kieuVanBanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _kieuVanBanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ispace.model.KieuVanBan fetchKieuVanBan(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.fetchKieuVanBan(id);
	}

	/**
	* Returns the kieu van ban with the primary key.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban
	* @throws PortalException if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.KieuVanBan getKieuVanBan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.getKieuVanBan(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the kieu van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kieu van bans
	* @param end the upper bound of the range of kieu van bans (not inclusive)
	* @return the range of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<ispace.model.KieuVanBan> getKieuVanBans(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.getKieuVanBans(start, end);
	}

	/**
	* Returns the number of kieu van bans.
	*
	* @return the number of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKieuVanBansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.getKieuVanBansCount();
	}

	/**
	* Updates the kieu van ban in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kieuVanBan the kieu van ban
	* @return the kieu van ban that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.KieuVanBan updateKieuVanBan(
		ispace.model.KieuVanBan kieuVanBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kieuVanBanLocalService.updateKieuVanBan(kieuVanBan);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _kieuVanBanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_kieuVanBanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kieuVanBanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KieuVanBanLocalService getWrappedKieuVanBanLocalService() {
		return _kieuVanBanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKieuVanBanLocalService(
		KieuVanBanLocalService kieuVanBanLocalService) {
		_kieuVanBanLocalService = kieuVanBanLocalService;
	}

	@Override
	public KieuVanBanLocalService getWrappedService() {
		return _kieuVanBanLocalService;
	}

	@Override
	public void setWrappedService(KieuVanBanLocalService kieuVanBanLocalService) {
		_kieuVanBanLocalService = kieuVanBanLocalService;
	}

	private KieuVanBanLocalService _kieuVanBanLocalService;
}