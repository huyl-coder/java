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

import com.test.NoSuchphongbanException;

import com.test.model.impl.phongbanImpl;
import com.test.model.impl.phongbanModelImpl;
import com.test.model.phongban;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the phongban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see phongbanPersistence
 * @see phongbanUtil
 * @generated
 */
public class phongbanPersistenceImpl extends BasePersistenceImpl<phongban>
	implements phongbanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link phongbanUtil} to access the phongban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = phongbanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(phongbanModelImpl.ENTITY_CACHE_ENABLED,
			phongbanModelImpl.FINDER_CACHE_ENABLED, phongbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(phongbanModelImpl.ENTITY_CACHE_ENABLED,
			phongbanModelImpl.FINDER_CACHE_ENABLED, phongbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(phongbanModelImpl.ENTITY_CACHE_ENABLED,
			phongbanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public phongbanPersistenceImpl() {
		setModelClass(phongban.class);
	}

	/**
	 * Caches the phongban in the entity cache if it is enabled.
	 *
	 * @param phongban the phongban
	 */
	@Override
	public void cacheResult(phongban phongban) {
		EntityCacheUtil.putResult(phongbanModelImpl.ENTITY_CACHE_ENABLED,
			phongbanImpl.class, phongban.getPrimaryKey(), phongban);

		phongban.resetOriginalValues();
	}

	/**
	 * Caches the phongbans in the entity cache if it is enabled.
	 *
	 * @param phongbans the phongbans
	 */
	@Override
	public void cacheResult(List<phongban> phongbans) {
		for (phongban phongban : phongbans) {
			if (EntityCacheUtil.getResult(
						phongbanModelImpl.ENTITY_CACHE_ENABLED,
						phongbanImpl.class, phongban.getPrimaryKey()) == null) {
				cacheResult(phongban);
			}
			else {
				phongban.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phongbans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(phongbanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(phongbanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phongban.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(phongban phongban) {
		EntityCacheUtil.removeResult(phongbanModelImpl.ENTITY_CACHE_ENABLED,
			phongbanImpl.class, phongban.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<phongban> phongbans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (phongban phongban : phongbans) {
			EntityCacheUtil.removeResult(phongbanModelImpl.ENTITY_CACHE_ENABLED,
				phongbanImpl.class, phongban.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phongban with the primary key. Does not add the phongban to the database.
	 *
	 * @param id the primary key for the new phongban
	 * @return the new phongban
	 */
	@Override
	public phongban create(long id) {
		phongban phongban = new phongbanImpl();

		phongban.setNew(true);
		phongban.setPrimaryKey(id);

		return phongban;
	}

	/**
	 * Removes the phongban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the phongban
	 * @return the phongban that was removed
	 * @throws com.test.NoSuchphongbanException if a phongban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phongban remove(long id)
		throws NoSuchphongbanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the phongban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phongban
	 * @return the phongban that was removed
	 * @throws com.test.NoSuchphongbanException if a phongban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phongban remove(Serializable primaryKey)
		throws NoSuchphongbanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			phongban phongban = (phongban)session.get(phongbanImpl.class,
					primaryKey);

			if (phongban == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchphongbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phongban);
		}
		catch (NoSuchphongbanException nsee) {
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
	protected phongban removeImpl(phongban phongban) throws SystemException {
		phongban = toUnwrappedModel(phongban);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phongban)) {
				phongban = (phongban)session.get(phongbanImpl.class,
						phongban.getPrimaryKeyObj());
			}

			if (phongban != null) {
				session.delete(phongban);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phongban != null) {
			clearCache(phongban);
		}

		return phongban;
	}

	@Override
	public phongban updateImpl(com.test.model.phongban phongban)
		throws SystemException {
		phongban = toUnwrappedModel(phongban);

		boolean isNew = phongban.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phongban.isNew()) {
				session.save(phongban);

				phongban.setNew(false);
			}
			else {
				session.merge(phongban);
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

		EntityCacheUtil.putResult(phongbanModelImpl.ENTITY_CACHE_ENABLED,
			phongbanImpl.class, phongban.getPrimaryKey(), phongban);

		return phongban;
	}

	protected phongban toUnwrappedModel(phongban phongban) {
		if (phongban instanceof phongbanImpl) {
			return phongban;
		}

		phongbanImpl phongbanImpl = new phongbanImpl();

		phongbanImpl.setNew(phongban.isNew());
		phongbanImpl.setPrimaryKey(phongban.getPrimaryKey());

		phongbanImpl.setId(phongban.getId());
		phongbanImpl.setTen(phongban.getTen());

		return phongbanImpl;
	}

	/**
	 * Returns the phongban with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phongban
	 * @return the phongban
	 * @throws com.test.NoSuchphongbanException if a phongban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phongban findByPrimaryKey(Serializable primaryKey)
		throws NoSuchphongbanException, SystemException {
		phongban phongban = fetchByPrimaryKey(primaryKey);

		if (phongban == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchphongbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phongban;
	}

	/**
	 * Returns the phongban with the primary key or throws a {@link com.test.NoSuchphongbanException} if it could not be found.
	 *
	 * @param id the primary key of the phongban
	 * @return the phongban
	 * @throws com.test.NoSuchphongbanException if a phongban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phongban findByPrimaryKey(long id)
		throws NoSuchphongbanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the phongban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phongban
	 * @return the phongban, or <code>null</code> if a phongban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phongban fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		phongban phongban = (phongban)EntityCacheUtil.getResult(phongbanModelImpl.ENTITY_CACHE_ENABLED,
				phongbanImpl.class, primaryKey);

		if (phongban == _nullphongban) {
			return null;
		}

		if (phongban == null) {
			Session session = null;

			try {
				session = openSession();

				phongban = (phongban)session.get(phongbanImpl.class, primaryKey);

				if (phongban != null) {
					cacheResult(phongban);
				}
				else {
					EntityCacheUtil.putResult(phongbanModelImpl.ENTITY_CACHE_ENABLED,
						phongbanImpl.class, primaryKey, _nullphongban);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(phongbanModelImpl.ENTITY_CACHE_ENABLED,
					phongbanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phongban;
	}

	/**
	 * Returns the phongban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the phongban
	 * @return the phongban, or <code>null</code> if a phongban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phongban fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the phongbans.
	 *
	 * @return the phongbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<phongban> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phongbans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.phongbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phongbans
	 * @param end the upper bound of the range of phongbans (not inclusive)
	 * @return the range of phongbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<phongban> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the phongbans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.phongbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phongbans
	 * @param end the upper bound of the range of phongbans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of phongbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<phongban> findAll(int start, int end,
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

		List<phongban> list = (List<phongban>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHONGBAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHONGBAN;

				if (pagination) {
					sql = sql.concat(phongbanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<phongban>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<phongban>(list);
				}
				else {
					list = (List<phongban>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the phongbans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (phongban phongban : findAll()) {
			remove(phongban);
		}
	}

	/**
	 * Returns the number of phongbans.
	 *
	 * @return the number of phongbans
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

				Query q = session.createQuery(_SQL_COUNT_PHONGBAN);

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
	 * Initializes the phongban persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.phongban")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<phongban>> listenersList = new ArrayList<ModelListener<phongban>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<phongban>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(phongbanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHONGBAN = "SELECT phongban FROM phongban phongban";
	private static final String _SQL_COUNT_PHONGBAN = "SELECT COUNT(phongban) FROM phongban phongban";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phongban.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No phongban exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(phongbanPersistenceImpl.class);
	private static phongban _nullphongban = new phongbanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<phongban> toCacheModel() {
				return _nullphongbanCacheModel;
			}
		};

	private static CacheModel<phongban> _nullphongbanCacheModel = new CacheModel<phongban>() {
			@Override
			public phongban toEntityModel() {
				return _nullphongban;
			}
		};
}