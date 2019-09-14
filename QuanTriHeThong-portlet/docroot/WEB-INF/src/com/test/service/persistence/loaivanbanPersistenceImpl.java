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

import com.test.NoSuchloaivanbanException;

import com.test.model.impl.loaivanbanImpl;
import com.test.model.impl.loaivanbanModelImpl;
import com.test.model.loaivanban;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the loaivanban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see loaivanbanPersistence
 * @see loaivanbanUtil
 * @generated
 */
public class loaivanbanPersistenceImpl extends BasePersistenceImpl<loaivanban>
	implements loaivanbanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link loaivanbanUtil} to access the loaivanban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = loaivanbanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
			loaivanbanModelImpl.FINDER_CACHE_ENABLED, loaivanbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
			loaivanbanModelImpl.FINDER_CACHE_ENABLED, loaivanbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
			loaivanbanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public loaivanbanPersistenceImpl() {
		setModelClass(loaivanban.class);
	}

	/**
	 * Caches the loaivanban in the entity cache if it is enabled.
	 *
	 * @param loaivanban the loaivanban
	 */
	@Override
	public void cacheResult(loaivanban loaivanban) {
		EntityCacheUtil.putResult(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
			loaivanbanImpl.class, loaivanban.getPrimaryKey(), loaivanban);

		loaivanban.resetOriginalValues();
	}

	/**
	 * Caches the loaivanbans in the entity cache if it is enabled.
	 *
	 * @param loaivanbans the loaivanbans
	 */
	@Override
	public void cacheResult(List<loaivanban> loaivanbans) {
		for (loaivanban loaivanban : loaivanbans) {
			if (EntityCacheUtil.getResult(
						loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
						loaivanbanImpl.class, loaivanban.getPrimaryKey()) == null) {
				cacheResult(loaivanban);
			}
			else {
				loaivanban.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loaivanbans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(loaivanbanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(loaivanbanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loaivanban.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(loaivanban loaivanban) {
		EntityCacheUtil.removeResult(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
			loaivanbanImpl.class, loaivanban.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<loaivanban> loaivanbans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (loaivanban loaivanban : loaivanbans) {
			EntityCacheUtil.removeResult(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
				loaivanbanImpl.class, loaivanban.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loaivanban with the primary key. Does not add the loaivanban to the database.
	 *
	 * @param id the primary key for the new loaivanban
	 * @return the new loaivanban
	 */
	@Override
	public loaivanban create(long id) {
		loaivanban loaivanban = new loaivanbanImpl();

		loaivanban.setNew(true);
		loaivanban.setPrimaryKey(id);

		return loaivanban;
	}

	/**
	 * Removes the loaivanban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the loaivanban
	 * @return the loaivanban that was removed
	 * @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public loaivanban remove(long id)
		throws NoSuchloaivanbanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the loaivanban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loaivanban
	 * @return the loaivanban that was removed
	 * @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public loaivanban remove(Serializable primaryKey)
		throws NoSuchloaivanbanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			loaivanban loaivanban = (loaivanban)session.get(loaivanbanImpl.class,
					primaryKey);

			if (loaivanban == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchloaivanbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(loaivanban);
		}
		catch (NoSuchloaivanbanException nsee) {
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
	protected loaivanban removeImpl(loaivanban loaivanban)
		throws SystemException {
		loaivanban = toUnwrappedModel(loaivanban);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(loaivanban)) {
				loaivanban = (loaivanban)session.get(loaivanbanImpl.class,
						loaivanban.getPrimaryKeyObj());
			}

			if (loaivanban != null) {
				session.delete(loaivanban);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (loaivanban != null) {
			clearCache(loaivanban);
		}

		return loaivanban;
	}

	@Override
	public loaivanban updateImpl(com.test.model.loaivanban loaivanban)
		throws SystemException {
		loaivanban = toUnwrappedModel(loaivanban);

		boolean isNew = loaivanban.isNew();

		Session session = null;

		try {
			session = openSession();

			if (loaivanban.isNew()) {
				session.save(loaivanban);

				loaivanban.setNew(false);
			}
			else {
				session.merge(loaivanban);
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

		EntityCacheUtil.putResult(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
			loaivanbanImpl.class, loaivanban.getPrimaryKey(), loaivanban);

		return loaivanban;
	}

	protected loaivanban toUnwrappedModel(loaivanban loaivanban) {
		if (loaivanban instanceof loaivanbanImpl) {
			return loaivanban;
		}

		loaivanbanImpl loaivanbanImpl = new loaivanbanImpl();

		loaivanbanImpl.setNew(loaivanban.isNew());
		loaivanbanImpl.setPrimaryKey(loaivanban.getPrimaryKey());

		loaivanbanImpl.setId(loaivanban.getId());
		loaivanbanImpl.setTen(loaivanban.getTen());

		return loaivanbanImpl;
	}

	/**
	 * Returns the loaivanban with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loaivanban
	 * @return the loaivanban
	 * @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public loaivanban findByPrimaryKey(Serializable primaryKey)
		throws NoSuchloaivanbanException, SystemException {
		loaivanban loaivanban = fetchByPrimaryKey(primaryKey);

		if (loaivanban == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchloaivanbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return loaivanban;
	}

	/**
	 * Returns the loaivanban with the primary key or throws a {@link com.test.NoSuchloaivanbanException} if it could not be found.
	 *
	 * @param id the primary key of the loaivanban
	 * @return the loaivanban
	 * @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public loaivanban findByPrimaryKey(long id)
		throws NoSuchloaivanbanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the loaivanban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loaivanban
	 * @return the loaivanban, or <code>null</code> if a loaivanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public loaivanban fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		loaivanban loaivanban = (loaivanban)EntityCacheUtil.getResult(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
				loaivanbanImpl.class, primaryKey);

		if (loaivanban == _nullloaivanban) {
			return null;
		}

		if (loaivanban == null) {
			Session session = null;

			try {
				session = openSession();

				loaivanban = (loaivanban)session.get(loaivanbanImpl.class,
						primaryKey);

				if (loaivanban != null) {
					cacheResult(loaivanban);
				}
				else {
					EntityCacheUtil.putResult(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
						loaivanbanImpl.class, primaryKey, _nullloaivanban);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(loaivanbanModelImpl.ENTITY_CACHE_ENABLED,
					loaivanbanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return loaivanban;
	}

	/**
	 * Returns the loaivanban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the loaivanban
	 * @return the loaivanban, or <code>null</code> if a loaivanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public loaivanban fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the loaivanbans.
	 *
	 * @return the loaivanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<loaivanban> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<loaivanban> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loaivanbans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.loaivanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loaivanbans
	 * @param end the upper bound of the range of loaivanbans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loaivanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<loaivanban> findAll(int start, int end,
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

		List<loaivanban> list = (List<loaivanban>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOAIVANBAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOAIVANBAN;

				if (pagination) {
					sql = sql.concat(loaivanbanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<loaivanban>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<loaivanban>(list);
				}
				else {
					list = (List<loaivanban>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the loaivanbans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (loaivanban loaivanban : findAll()) {
			remove(loaivanban);
		}
	}

	/**
	 * Returns the number of loaivanbans.
	 *
	 * @return the number of loaivanbans
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

				Query q = session.createQuery(_SQL_COUNT_LOAIVANBAN);

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
	 * Initializes the loaivanban persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.loaivanban")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<loaivanban>> listenersList = new ArrayList<ModelListener<loaivanban>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<loaivanban>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(loaivanbanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOAIVANBAN = "SELECT loaivanban FROM loaivanban loaivanban";
	private static final String _SQL_COUNT_LOAIVANBAN = "SELECT COUNT(loaivanban) FROM loaivanban loaivanban";
	private static final String _ORDER_BY_ENTITY_ALIAS = "loaivanban.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No loaivanban exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(loaivanbanPersistenceImpl.class);
	private static loaivanban _nullloaivanban = new loaivanbanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<loaivanban> toCacheModel() {
				return _nullloaivanbanCacheModel;
			}
		};

	private static CacheModel<loaivanban> _nullloaivanbanCacheModel = new CacheModel<loaivanban>() {
			@Override
			public loaivanban toEntityModel() {
				return _nullloaivanban;
			}
		};
}