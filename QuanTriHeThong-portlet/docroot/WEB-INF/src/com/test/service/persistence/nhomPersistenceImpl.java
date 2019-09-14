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

import com.test.NoSuchnhomException;

import com.test.model.impl.nhomImpl;
import com.test.model.impl.nhomModelImpl;
import com.test.model.nhom;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nhom service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see nhomPersistence
 * @see nhomUtil
 * @generated
 */
public class nhomPersistenceImpl extends BasePersistenceImpl<nhom>
	implements nhomPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link nhomUtil} to access the nhom persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = nhomImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(nhomModelImpl.ENTITY_CACHE_ENABLED,
			nhomModelImpl.FINDER_CACHE_ENABLED, nhomImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(nhomModelImpl.ENTITY_CACHE_ENABLED,
			nhomModelImpl.FINDER_CACHE_ENABLED, nhomImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(nhomModelImpl.ENTITY_CACHE_ENABLED,
			nhomModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public nhomPersistenceImpl() {
		setModelClass(nhom.class);
	}

	/**
	 * Caches the nhom in the entity cache if it is enabled.
	 *
	 * @param nhom the nhom
	 */
	@Override
	public void cacheResult(nhom nhom) {
		EntityCacheUtil.putResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
			nhomImpl.class, nhom.getPrimaryKey(), nhom);

		nhom.resetOriginalValues();
	}

	/**
	 * Caches the nhoms in the entity cache if it is enabled.
	 *
	 * @param nhoms the nhoms
	 */
	@Override
	public void cacheResult(List<nhom> nhoms) {
		for (nhom nhom : nhoms) {
			if (EntityCacheUtil.getResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
						nhomImpl.class, nhom.getPrimaryKey()) == null) {
				cacheResult(nhom);
			}
			else {
				nhom.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nhoms.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(nhomImpl.class.getName());
		}

		EntityCacheUtil.clearCache(nhomImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nhom.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(nhom nhom) {
		EntityCacheUtil.removeResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
			nhomImpl.class, nhom.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<nhom> nhoms) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (nhom nhom : nhoms) {
			EntityCacheUtil.removeResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
				nhomImpl.class, nhom.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nhom with the primary key. Does not add the nhom to the database.
	 *
	 * @param id the primary key for the new nhom
	 * @return the new nhom
	 */
	@Override
	public nhom create(long id) {
		nhom nhom = new nhomImpl();

		nhom.setNew(true);
		nhom.setPrimaryKey(id);

		return nhom;
	}

	/**
	 * Removes the nhom with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the nhom
	 * @return the nhom that was removed
	 * @throws com.test.NoSuchnhomException if a nhom with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhom remove(long id) throws NoSuchnhomException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the nhom with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nhom
	 * @return the nhom that was removed
	 * @throws com.test.NoSuchnhomException if a nhom with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhom remove(Serializable primaryKey)
		throws NoSuchnhomException, SystemException {
		Session session = null;

		try {
			session = openSession();

			nhom nhom = (nhom)session.get(nhomImpl.class, primaryKey);

			if (nhom == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnhomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhom);
		}
		catch (NoSuchnhomException nsee) {
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
	protected nhom removeImpl(nhom nhom) throws SystemException {
		nhom = toUnwrappedModel(nhom);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhom)) {
				nhom = (nhom)session.get(nhomImpl.class, nhom.getPrimaryKeyObj());
			}

			if (nhom != null) {
				session.delete(nhom);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhom != null) {
			clearCache(nhom);
		}

		return nhom;
	}

	@Override
	public nhom updateImpl(com.test.model.nhom nhom) throws SystemException {
		nhom = toUnwrappedModel(nhom);

		boolean isNew = nhom.isNew();

		Session session = null;

		try {
			session = openSession();

			if (nhom.isNew()) {
				session.save(nhom);

				nhom.setNew(false);
			}
			else {
				session.merge(nhom);
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

		EntityCacheUtil.putResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
			nhomImpl.class, nhom.getPrimaryKey(), nhom);

		return nhom;
	}

	protected nhom toUnwrappedModel(nhom nhom) {
		if (nhom instanceof nhomImpl) {
			return nhom;
		}

		nhomImpl nhomImpl = new nhomImpl();

		nhomImpl.setNew(nhom.isNew());
		nhomImpl.setPrimaryKey(nhom.getPrimaryKey());

		nhomImpl.setId(nhom.getId());
		nhomImpl.setTen(nhom.getTen());

		return nhomImpl;
	}

	/**
	 * Returns the nhom with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom
	 * @return the nhom
	 * @throws com.test.NoSuchnhomException if a nhom with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhom findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnhomException, SystemException {
		nhom nhom = fetchByPrimaryKey(primaryKey);

		if (nhom == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnhomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhom;
	}

	/**
	 * Returns the nhom with the primary key or throws a {@link com.test.NoSuchnhomException} if it could not be found.
	 *
	 * @param id the primary key of the nhom
	 * @return the nhom
	 * @throws com.test.NoSuchnhomException if a nhom with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhom findByPrimaryKey(long id)
		throws NoSuchnhomException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the nhom with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom
	 * @return the nhom, or <code>null</code> if a nhom with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhom fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		nhom nhom = (nhom)EntityCacheUtil.getResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
				nhomImpl.class, primaryKey);

		if (nhom == _nullnhom) {
			return null;
		}

		if (nhom == null) {
			Session session = null;

			try {
				session = openSession();

				nhom = (nhom)session.get(nhomImpl.class, primaryKey);

				if (nhom != null) {
					cacheResult(nhom);
				}
				else {
					EntityCacheUtil.putResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
						nhomImpl.class, primaryKey, _nullnhom);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(nhomModelImpl.ENTITY_CACHE_ENABLED,
					nhomImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhom;
	}

	/**
	 * Returns the nhom with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the nhom
	 * @return the nhom, or <code>null</code> if a nhom with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhom fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the nhoms.
	 *
	 * @return the nhoms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nhom> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhoms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhoms
	 * @param end the upper bound of the range of nhoms (not inclusive)
	 * @return the range of nhoms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nhom> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhoms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhoms
	 * @param end the upper bound of the range of nhoms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nhoms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nhom> findAll(int start, int end,
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

		List<nhom> list = (List<nhom>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NHOM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHOM;

				if (pagination) {
					sql = sql.concat(nhomModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<nhom>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<nhom>(list);
				}
				else {
					list = (List<nhom>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the nhoms from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (nhom nhom : findAll()) {
			remove(nhom);
		}
	}

	/**
	 * Returns the number of nhoms.
	 *
	 * @return the number of nhoms
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

				Query q = session.createQuery(_SQL_COUNT_NHOM);

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
	 * Initializes the nhom persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.nhom")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<nhom>> listenersList = new ArrayList<ModelListener<nhom>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<nhom>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(nhomImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NHOM = "SELECT nhom FROM nhom nhom";
	private static final String _SQL_COUNT_NHOM = "SELECT COUNT(nhom) FROM nhom nhom";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhom.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No nhom exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(nhomPersistenceImpl.class);
	private static nhom _nullnhom = new nhomImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<nhom> toCacheModel() {
				return _nullnhomCacheModel;
			}
		};

	private static CacheModel<nhom> _nullnhomCacheModel = new CacheModel<nhom>() {
			@Override
			public nhom toEntityModel() {
				return _nullnhom;
			}
		};
}