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

package com.test.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.test.service.ClpSerializer;
import com.test.service.chucdanhLocalServiceUtil;
import com.test.service.chucdanhServiceUtil;
import com.test.service.loaivanbanLocalServiceUtil;
import com.test.service.loaivanbanServiceUtil;
import com.test.service.nhanvienLocalServiceUtil;
import com.test.service.nhanvienServiceUtil;
import com.test.service.nhomLocalServiceUtil;
import com.test.service.nhomServiceUtil;
import com.test.service.phongbanLocalServiceUtil;
import com.test.service.phongbanServiceUtil;
import com.test.service.sovanbanLocalServiceUtil;
import com.test.service.sovanbanServiceUtil;

/**
 * @author Duy Nguyen
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			chucdanhLocalServiceUtil.clearService();

			chucdanhServiceUtil.clearService();
			loaivanbanLocalServiceUtil.clearService();

			loaivanbanServiceUtil.clearService();
			nhanvienLocalServiceUtil.clearService();

			nhanvienServiceUtil.clearService();
			nhomLocalServiceUtil.clearService();

			nhomServiceUtil.clearService();
			phongbanLocalServiceUtil.clearService();

			phongbanServiceUtil.clearService();
			sovanbanLocalServiceUtil.clearService();

			sovanbanServiceUtil.clearService();
		}
	}
}