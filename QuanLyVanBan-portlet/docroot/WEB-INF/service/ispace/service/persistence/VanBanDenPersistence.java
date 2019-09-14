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

import com.liferay.portal.service.persistence.BasePersistence;

import ispace.model.VanBanDen;

/**
 * The persistence interface for the van ban den service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see VanBanDenPersistenceImpl
 * @see VanBanDenUtil
 * @generated
 */
public interface VanBanDenPersistence extends BasePersistence<VanBanDen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VanBanDenUtil} to access the van ban den persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the van ban den in the entity cache if it is enabled.
	*
	* @param vanBanDen the van ban den
	*/
	public void cacheResult(ispace.model.VanBanDen vanBanDen);

	/**
	* Caches the van ban dens in the entity cache if it is enabled.
	*
	* @param vanBanDens the van ban dens
	*/
	public void cacheResult(java.util.List<ispace.model.VanBanDen> vanBanDens);

	/**
	* Creates a new van ban den with the primary key. Does not add the van ban den to the database.
	*
	* @param id the primary key for the new van ban den
	* @return the new van ban den
	*/
	public ispace.model.VanBanDen create(long id);

	/**
	* Removes the van ban den with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the van ban den
	* @return the van ban den that was removed
	* @throws ispace.NoSuchVanBanDenException if a van ban den with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.VanBanDen remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchVanBanDenException;

	public ispace.model.VanBanDen updateImpl(ispace.model.VanBanDen vanBanDen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the van ban den with the primary key or throws a {@link ispace.NoSuchVanBanDenException} if it could not be found.
	*
	* @param id the primary key of the van ban den
	* @return the van ban den
	* @throws ispace.NoSuchVanBanDenException if a van ban den with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.VanBanDen findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchVanBanDenException;

	/**
	* Returns the van ban den with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the van ban den
	* @return the van ban den, or <code>null</code> if a van ban den with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.VanBanDen fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the van ban dens.
	*
	* @return the van ban dens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.VanBanDen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the van ban dens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of van ban dens
	* @param end the upper bound of the range of van ban dens (not inclusive)
	* @return the range of van ban dens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.VanBanDen> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the van ban dens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of van ban dens
	* @param end the upper bound of the range of van ban dens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of van ban dens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.VanBanDen> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the van ban dens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of van ban dens.
	*
	* @return the number of van ban dens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}