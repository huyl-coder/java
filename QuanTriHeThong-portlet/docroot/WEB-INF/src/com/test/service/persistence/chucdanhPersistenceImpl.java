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

package com.test.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchchucdanhException;

import com.test.model.chucdanh;
import com.test.model.impl.chucdanhImpl;
import com.test.model.impl.chucdanhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the chucdanh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see chucdanhPersistence
 * @see chucdanhUtil
 * @generated
 */
public class chucdanhPersistenceImpl extends BasePersistenceImpl<chucdanh>
	implements chucdanhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link chucdanhUtil} to access the chucdanh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = chucdanhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
			chucdanhModelImpl.FINDER_CACHE_ENABLED, chucdanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
			chucdanhModelImpl.FINDER_CACHE_ENABLED, chucdanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
			chucdanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public chucdanhPersistenceImpl() {
		setModelClass(chucdanh.class);
	}

	/**
	 * Caches the chucdanh in the entity cache if it is enabled.
	 *
	 * @param chucdanh the chucdanh
	 */
	@Override
	public void cacheResult(chucdanh chucdanh) {
		EntityCacheUtil.putResult(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
			chucdanhImpl.class, chucdanh.getPrimaryKey(), chucdanh);

		chucdanh.resetOriginalValues();
	}

	/**
	 * Caches the chucdanhs in the entity cache if it is enabled.
	 *
	 * @param chucdanhs the chucdanhs
	 */
	@Override
	public void cacheResult(List<chucdanh> chucdanhs) {
		for (chucdanh chucdanh : chucdanhs) {
			if (EntityCacheUtil.getResult(
						chucdanhModelImpl.ENTITY_CACHE_ENABLED,
						chucdanhImpl.class, chucdanh.getPrimaryKey()) == null) {
				cacheResult(chucdanh);
			}
			else {
				chucdanh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all chucdanhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(chucdanhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(chucdanhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the chucdanh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(chucdanh chucdanh) {
		EntityCacheUtil.removeResult(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
			chucdanhImpl.class, chucdanh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<chucdanh> chucdanhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (chucdanh chucdanh : chucdanhs) {
			EntityCacheUtil.removeResult(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
				chucdanhImpl.class, chucdanh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new chucdanh with the primary key. Does not add the chucdanh to the database.
	 *
	 * @param id the primary key for the new chucdanh
	 * @return the new chucdanh
	 */
	@Override
	public chucdanh create(long id) {
		chucdanh chucdanh = new chucdanhImpl();

		chucdanh.setNew(true);
		chucdanh.setPrimaryKey(id);

		return chucdanh;
	}

	/**
	 * Removes the chucdanh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the chucdanh
	 * @return the chucdanh that was removed
	 * @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public chucdanh remove(long id)
		throws NoSuchchucdanhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the chucdanh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the chucdanh
	 * @return the chucdanh that was removed
	 * @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public chucdanh remove(Serializable primaryKey)
		throws NoSuchchucdanhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			chucdanh chucdanh = (chucdanh)session.get(chucdanhImpl.class,
					primaryKey);

			if (chucdanh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchchucdanhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(chucdanh);
		}
		catch (NoSuchchucdanhException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected chucdanh removeImpl(chucdanh chucdanh) throws SystemException {
		chucdanh = toUnwrappedModel(chucdanh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(chucdanh)) {
				chucdanh = (chucdanh)session.get(chucdanhImpl.class,
						chucdanh.getPrimaryKeyObj());
			}

			if (chucdanh != null) {
				session.delete(chucdanh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (chucdanh != null) {
			clearCache(chucdanh);
		}

		return chucdanh;
	}

	@Override
	public chucdanh updateImpl(com.test.model.chucdanh chucdanh)
		throws SystemException {
		chucdanh = toUnwrappedModel(chucdanh);

		boolean isNew = chucdanh.isNew();

		Session session = null;

		try {
			session = openSession();

			if (chucdanh.isNew()) {
				session.save(chucdanh);

				chucdanh.setNew(false);
			}
			else {
				session.merge(chucdanh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
			chucdanhImpl.class, chucdanh.getPrimaryKey(), chucdanh);

		return chucdanh;
	}

	protected chucdanh toUnwrappedModel(chucdanh chucdanh) {
		if (chucdanh instanceof chucdanhImpl) {
			return chucdanh;
		}

		chucdanhImpl chucdanhImpl = new chucdanhImpl();

		chucdanhImpl.setNew(chucdanh.isNew());
		chucdanhImpl.setPrimaryKey(chucdanh.getPrimaryKey());

		chucdanhImpl.setId(chucdanh.getId());
		chucdanhImpl.setTen(chucdanh.getTen());
		chucdanhImpl.setMa(chucdanh.getMa());

		return chucdanhImpl;
	}

	/**
	 * Returns the chucdanh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the chucdanh
	 * @return the chucdanh
	 * @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public chucdanh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchchucdanhException, SystemException {
		chucdanh chucdanh = fetchByPrimaryKey(primaryKey);

		if (chucdanh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchchucdanhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return chucdanh;
	}

	/**
	 * Returns the chucdanh with the primary key or throws a {@link com.test.NoSuchchucdanhException} if it could not be found.
	 *
	 * @param id the primary key of the chucdanh
	 * @return the chucdanh
	 * @throws com.test.NoSuchchucdanhException if a chucdanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public chucdanh findByPrimaryKey(long id)
		throws NoSuchchucdanhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the chucdanh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the chucdanh
	 * @return the chucdanh, or <code>null</code> if a chucdanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public chucdanh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		chucdanh chucdanh = (chucdanh)EntityCacheUtil.getResult(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
				chucdanhImpl.class, primaryKey);

		if (chucdanh == _nullchucdanh) {
			return null;
		}

		if (chucdanh == null) {
			Session session = null;

			try {
				session = openSession();

				chucdanh = (chucdanh)session.get(chucdanhImpl.class, primaryKey);

				if (chucdanh != null) {
					cacheResult(chucdanh);
				}
				else {
					EntityCacheUtil.putResult(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
						chucdanhImpl.class, primaryKey, _nullchucdanh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(chucdanhModelImpl.ENTITY_CACHE_ENABLED,
					chucdanhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return chucdanh;
	}

	/**
	 * Returns the chucdanh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the chucdanh
	 * @return the chucdanh, or <code>null</code> if a chucdanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public chucdanh fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the chucdanhs.
	 *
	 * @return the chucdanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<chucdanh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<chucdanh> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the chucdanhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.chucdanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chucdanhs
	 * @param end the upper bound of the range of chucdanhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of chucdanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<chucdanh> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<chucdanh> list = (List<chucdanh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CHUCDANH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHUCDANH;

				if (pagination) {
					sql = sql.concat(chucdanhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<chucdanh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<chucdanh>(list);
				}
				else {
					list = (List<chucdanh>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the chucdanhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (chucdanh chucdanh : findAll()) {
			remove(chucdanh);
		}
	}

	/**
	 * Returns the number of chucdanhs.
	 *
	 * @return the number of chucdanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CHUCDANH);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the chucdanh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.chucdanh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<chucdanh>> listenersList = new ArrayList<ModelListener<chucdanh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<chucdanh>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(chucdanhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CHUCDANH = "SELECT chucdanh FROM chucdanh chucdanh";
	private static final String _SQL_COUNT_CHUCDANH = "SELECT COUNT(chucdanh) FROM chucdanh chucdanh";
	private static final String _ORDER_BY_ENTITY_ALIAS = "chucdanh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No chucdanh exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(chucdanhPersistenceImpl.class);
	private static chucdanh _nullchucdanh = new chucdanhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<chucdanh> toCacheModel() {
				return _nullchucdanhCacheModel;
			}
		};

	private static CacheModel<chucdanh> _nullchucdanhCacheModel = new CacheModel<chucdanh>() {
			@Override
			public chucdanh toEntityModel() {
				return _nullchucdanh;
			}
		};
}