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

import com.test.NoSuchnhanvienException;

import com.test.model.impl.nhanvienImpl;
import com.test.model.impl.nhanvienModelImpl;
import com.test.model.nhanvien;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nhanvien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see nhanvienPersistence
 * @see nhanvienUtil
 * @generated
 */
public class nhanvienPersistenceImpl extends BasePersistenceImpl<nhanvien>
	implements nhanvienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link nhanvienUtil} to access the nhanvien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = nhanvienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
			nhanvienModelImpl.FINDER_CACHE_ENABLED, nhanvienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
			nhanvienModelImpl.FINDER_CACHE_ENABLED, nhanvienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
			nhanvienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public nhanvienPersistenceImpl() {
		setModelClass(nhanvien.class);
	}

	/**
	 * Caches the nhanvien in the entity cache if it is enabled.
	 *
	 * @param nhanvien the nhanvien
	 */
	@Override
	public void cacheResult(nhanvien nhanvien) {
		EntityCacheUtil.putResult(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
			nhanvienImpl.class, nhanvien.getPrimaryKey(), nhanvien);

		nhanvien.resetOriginalValues();
	}

	/**
	 * Caches the nhanviens in the entity cache if it is enabled.
	 *
	 * @param nhanviens the nhanviens
	 */
	@Override
	public void cacheResult(List<nhanvien> nhanviens) {
		for (nhanvien nhanvien : nhanviens) {
			if (EntityCacheUtil.getResult(
						nhanvienModelImpl.ENTITY_CACHE_ENABLED,
						nhanvienImpl.class, nhanvien.getPrimaryKey()) == null) {
				cacheResult(nhanvien);
			}
			else {
				nhanvien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nhanviens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(nhanvienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(nhanvienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nhanvien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(nhanvien nhanvien) {
		EntityCacheUtil.removeResult(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
			nhanvienImpl.class, nhanvien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<nhanvien> nhanviens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (nhanvien nhanvien : nhanviens) {
			EntityCacheUtil.removeResult(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
				nhanvienImpl.class, nhanvien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nhanvien with the primary key. Does not add the nhanvien to the database.
	 *
	 * @param id the primary key for the new nhanvien
	 * @return the new nhanvien
	 */
	@Override
	public nhanvien create(long id) {
		nhanvien nhanvien = new nhanvienImpl();

		nhanvien.setNew(true);
		nhanvien.setPrimaryKey(id);

		return nhanvien;
	}

	/**
	 * Removes the nhanvien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the nhanvien
	 * @return the nhanvien that was removed
	 * @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhanvien remove(long id)
		throws NoSuchnhanvienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the nhanvien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nhanvien
	 * @return the nhanvien that was removed
	 * @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhanvien remove(Serializable primaryKey)
		throws NoSuchnhanvienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			nhanvien nhanvien = (nhanvien)session.get(nhanvienImpl.class,
					primaryKey);

			if (nhanvien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnhanvienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhanvien);
		}
		catch (NoSuchnhanvienException nsee) {
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
	protected nhanvien removeImpl(nhanvien nhanvien) throws SystemException {
		nhanvien = toUnwrappedModel(nhanvien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhanvien)) {
				nhanvien = (nhanvien)session.get(nhanvienImpl.class,
						nhanvien.getPrimaryKeyObj());
			}

			if (nhanvien != null) {
				session.delete(nhanvien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhanvien != null) {
			clearCache(nhanvien);
		}

		return nhanvien;
	}

	@Override
	public nhanvien updateImpl(com.test.model.nhanvien nhanvien)
		throws SystemException {
		nhanvien = toUnwrappedModel(nhanvien);

		boolean isNew = nhanvien.isNew();

		Session session = null;

		try {
			session = openSession();

			if (nhanvien.isNew()) {
				session.save(nhanvien);

				nhanvien.setNew(false);
			}
			else {
				session.merge(nhanvien);
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

		EntityCacheUtil.putResult(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
			nhanvienImpl.class, nhanvien.getPrimaryKey(), nhanvien);

		return nhanvien;
	}

	protected nhanvien toUnwrappedModel(nhanvien nhanvien) {
		if (nhanvien instanceof nhanvienImpl) {
			return nhanvien;
		}

		nhanvienImpl nhanvienImpl = new nhanvienImpl();

		nhanvienImpl.setNew(nhanvien.isNew());
		nhanvienImpl.setPrimaryKey(nhanvien.getPrimaryKey());

		nhanvienImpl.setId(nhanvien.getId());
		nhanvienImpl.setTen(nhanvien.getTen());

		return nhanvienImpl;
	}

	/**
	 * Returns the nhanvien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhanvien
	 * @return the nhanvien
	 * @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhanvien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnhanvienException, SystemException {
		nhanvien nhanvien = fetchByPrimaryKey(primaryKey);

		if (nhanvien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnhanvienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhanvien;
	}

	/**
	 * Returns the nhanvien with the primary key or throws a {@link com.test.NoSuchnhanvienException} if it could not be found.
	 *
	 * @param id the primary key of the nhanvien
	 * @return the nhanvien
	 * @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhanvien findByPrimaryKey(long id)
		throws NoSuchnhanvienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the nhanvien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhanvien
	 * @return the nhanvien, or <code>null</code> if a nhanvien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhanvien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		nhanvien nhanvien = (nhanvien)EntityCacheUtil.getResult(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
				nhanvienImpl.class, primaryKey);

		if (nhanvien == _nullnhanvien) {
			return null;
		}

		if (nhanvien == null) {
			Session session = null;

			try {
				session = openSession();

				nhanvien = (nhanvien)session.get(nhanvienImpl.class, primaryKey);

				if (nhanvien != null) {
					cacheResult(nhanvien);
				}
				else {
					EntityCacheUtil.putResult(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
						nhanvienImpl.class, primaryKey, _nullnhanvien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(nhanvienModelImpl.ENTITY_CACHE_ENABLED,
					nhanvienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhanvien;
	}

	/**
	 * Returns the nhanvien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the nhanvien
	 * @return the nhanvien, or <code>null</code> if a nhanvien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nhanvien fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the nhanviens.
	 *
	 * @return the nhanviens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nhanvien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhanviens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhanvienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhanviens
	 * @param end the upper bound of the range of nhanviens (not inclusive)
	 * @return the range of nhanviens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nhanvien> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhanviens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhanvienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhanviens
	 * @param end the upper bound of the range of nhanviens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nhanviens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nhanvien> findAll(int start, int end,
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

		List<nhanvien> list = (List<nhanvien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NHANVIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHANVIEN;

				if (pagination) {
					sql = sql.concat(nhanvienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<nhanvien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<nhanvien>(list);
				}
				else {
					list = (List<nhanvien>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nhanviens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (nhanvien nhanvien : findAll()) {
			remove(nhanvien);
		}
	}

	/**
	 * Returns the number of nhanviens.
	 *
	 * @return the number of nhanviens
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

				Query q = session.createQuery(_SQL_COUNT_NHANVIEN);

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
	 * Initializes the nhanvien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.nhanvien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<nhanvien>> listenersList = new ArrayList<ModelListener<nhanvien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<nhanvien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(nhanvienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NHANVIEN = "SELECT nhanvien FROM nhanvien nhanvien";
	private static final String _SQL_COUNT_NHANVIEN = "SELECT COUNT(nhanvien) FROM nhanvien nhanvien";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhanvien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No nhanvien exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(nhanvienPersistenceImpl.class);
	private static nhanvien _nullnhanvien = new nhanvienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<nhanvien> toCacheModel() {
				return _nullnhanvienCacheModel;
			}
		};

	private static CacheModel<nhanvien> _nullnhanvienCacheModel = new CacheModel<nhanvien>() {
			@Override
			public nhanvien toEntityModel() {
				return _nullnhanvien;
			}
		};
}