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
 * Provides a wrapper for {@link TheloaiService}.
 *
 * @author PC
 * @see TheloaiService
 * @generated
 */
public class TheloaiServiceWrapper implements TheloaiService,
	ServiceWrapper<TheloaiService> {
	public TheloaiServiceWrapper(TheloaiService theloaiService) {
		_theloaiService = theloaiService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _theloaiService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_theloaiService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _theloaiService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TheloaiService getWrappedTheloaiService() {
		return _theloaiService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTheloaiService(TheloaiService theloaiService) {
		_theloaiService = theloaiService;
	}

	@Override
	public TheloaiService getWrappedService() {
		return _theloaiService;
	}

	@Override
	public void setWrappedService(TheloaiService theloaiService) {
		_theloaiService = theloaiService;
	}

	private TheloaiService _theloaiService;
}