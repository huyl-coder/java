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
 * Provides a wrapper for {@link chucdanhService}.
 *
 * @author Duy Nguyen
 * @see chucdanhService
 * @generated
 */
public class chucdanhServiceWrapper implements chucdanhService,
	ServiceWrapper<chucdanhService> {
	public chucdanhServiceWrapper(chucdanhService chucdanhService) {
		_chucdanhService = chucdanhService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _chucdanhService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_chucdanhService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _chucdanhService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public chucdanhService getWrappedchucdanhService() {
		return _chucdanhService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedchucdanhService(chucdanhService chucdanhService) {
		_chucdanhService = chucdanhService;
	}

	@Override
	public chucdanhService getWrappedService() {
		return _chucdanhService;
	}

	@Override
	public void setWrappedService(chucdanhService chucdanhService) {
		_chucdanhService = chucdanhService;
	}

	private chucdanhService _chucdanhService;
}