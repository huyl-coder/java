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

package com.thuvien.service.persistence;

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

import com.thuvien.NoSuchTheloaiException;

import com.thuvien.model.Theloai;
import com.thuvien.model.impl.TheloaiImpl;
import com.thuvien.model.impl.TheloaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the theloai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see TheloaiPersistence
 * @see TheloaiUtil
 * @generated
 */
public class TheloaiPersistenceImpl extends BasePersistenceImpl<Theloai>
	implements TheloaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TheloaiUtil} to access the theloai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TheloaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
			TheloaiModelImpl.FINDER_CACHE_ENABLED, TheloaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
			TheloaiModelImpl.FINDER_CACHE_ENABLED, TheloaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
			TheloaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TheloaiPersistenceImpl() {
		setModelClass(Theloai.class);
	}

	/**
	 * Caches the theloai in the entity cache if it is enabled.
	 *
	 * @param theloai the theloai
	 */
	@Override
	public void cacheResult(Theloai theloai) {
		EntityCacheUtil.putResult(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
			TheloaiImpl.class, theloai.getPrimaryKey(), theloai);

		theloai.resetOriginalValues();
	}

	/**
	 * Caches the theloais in the entity cache if it is enabled.
	 *
	 * @param theloais the theloais
	 */
	@Override
	public void cacheResult(List<Theloai> theloais) {
		for (Theloai theloai : theloais) {
			if (EntityCacheUtil.getResult(
						TheloaiModelImpl.ENTITY_CACHE_ENABLED,
						TheloaiImpl.class, theloai.getPrimaryKey()) == null) {
				cacheResult(theloai);
			}
			else {
				theloai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all theloais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TheloaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TheloaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the theloai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Theloai theloai) {
		EntityCacheUtil.removeResult(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
			TheloaiImpl.class, theloai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Theloai> theloais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Theloai theloai : theloais) {
			EntityCacheUtil.removeResult(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
				TheloaiImpl.class, theloai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new theloai with the primary key. Does not add the theloai to the database.
	 *
	 * @param id the primary key for the new theloai
	 * @return the new theloai
	 */
	@Override
	public Theloai create(long id) {
		Theloai theloai = new TheloaiImpl();

		theloai.setNew(true);
		theloai.setPrimaryKey(id);

		return theloai;
	}

	/**
	 * Removes the theloai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the theloai
	 * @return the theloai that was removed
	 * @throws com.thuvien.NoSuchTheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Theloai remove(long id)
		throws NoSuchTheloaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the theloai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the theloai
	 * @return the theloai that was removed
	 * @throws com.thuvien.NoSuchTheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Theloai remove(Serializable primaryKey)
		throws NoSuchTheloaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Theloai theloai = (Theloai)session.get(TheloaiImpl.class, primaryKey);

			if (theloai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTheloaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(theloai);
		}
		catch (NoSuchTheloaiException nsee) {
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
	protected Theloai removeImpl(Theloai theloai) throws SystemException {
		theloai = toUnwrappedModel(theloai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(theloai)) {
				theloai = (Theloai)session.get(TheloaiImpl.class,
						theloai.getPrimaryKeyObj());
			}

			if (theloai != null) {
				session.delete(theloai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (theloai != null) {
			clearCache(theloai);
		}

		return theloai;
	}

	@Override
	public Theloai updateImpl(com.thuvien.model.Theloai theloai)
		throws SystemException {
		theloai = toUnwrappedModel(theloai);

		boolean isNew = theloai.isNew();

		Session session = null;

		try {
			session = openSession();

			if (theloai.isNew()) {
				session.save(theloai);

				theloai.setNew(false);
			}
			else {
				session.merge(theloai);
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

		EntityCacheUtil.putResult(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
			TheloaiImpl.class, theloai.getPrimaryKey(), theloai);

		return theloai;
	}

	protected Theloai toUnwrappedModel(Theloai theloai) {
		if (theloai instanceof TheloaiImpl) {
			return theloai;
		}

		TheloaiImpl theloaiImpl = new TheloaiImpl();

		theloaiImpl.setNew(theloai.isNew());
		theloaiImpl.setPrimaryKey(theloai.getPrimaryKey());

		theloaiImpl.setId(theloai.getId());
		theloaiImpl.setTen(theloai.getTen());

		return theloaiImpl;
	}

	/**
	 * Returns the theloai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the theloai
	 * @return the theloai
	 * @throws com.thuvien.NoSuchTheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Theloai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTheloaiException, SystemException {
		Theloai theloai = fetchByPrimaryKey(primaryKey);

		if (theloai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTheloaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return theloai;
	}

	/**
	 * Returns the theloai with the primary key or throws a {@link com.thuvien.NoSuchTheloaiException} if it could not be found.
	 *
	 * @param id the primary key of the theloai
	 * @return the theloai
	 * @throws com.thuvien.NoSuchTheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Theloai findByPrimaryKey(long id)
		throws NoSuchTheloaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the theloai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the theloai
	 * @return the theloai, or <code>null</code> if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Theloai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Theloai theloai = (Theloai)EntityCacheUtil.getResult(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
				TheloaiImpl.class, primaryKey);

		if (theloai == _nullTheloai) {
			return null;
		}

		if (theloai == null) {
			Session session = null;

			try {
				session = openSession();

				theloai = (Theloai)session.get(TheloaiImpl.class, primaryKey);

				if (theloai != null) {
					cacheResult(theloai);
				}
				else {
					EntityCacheUtil.putResult(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
						TheloaiImpl.class, primaryKey, _nullTheloai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TheloaiModelImpl.ENTITY_CACHE_ENABLED,
					TheloaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return theloai;
	}

	/**
	 * Returns the theloai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the theloai
	 * @return the theloai, or <code>null</code> if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Theloai fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the theloais.
	 *
	 * @return the theloais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Theloai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the theloais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.TheloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of theloais
	 * @param end the upper bound of the range of theloais (not inclusive)
	 * @return the range of theloais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Theloai> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the theloais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.TheloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of theloais
	 * @param end the upper bound of the range of theloais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of theloais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Theloai> findAll(int start, int end,
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

		List<Theloai> list = (List<Theloai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THELOAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THELOAI;

				if (pagination) {
					sql = sql.concat(TheloaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Theloai>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Theloai>(list);
				}
				else {
					list = (List<Theloai>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the theloais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Theloai theloai : findAll()) {
			remove(theloai);
		}
	}

	/**
	 * Returns the number of theloais.
	 *
	 * @return the number of theloais
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

				Query q = session.createQuery(_SQL_COUNT_THELOAI);

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
	 * Initializes the theloai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.thuvien.model.Theloai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Theloai>> listenersList = new ArrayList<ModelListener<Theloai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Theloai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TheloaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THELOAI = "SELECT theloai FROM Theloai theloai";
	private static final String _SQL_COUNT_THELOAI = "SELECT COUNT(theloai) FROM Theloai theloai";
	private static final String _ORDER_BY_ENTITY_ALIAS = "theloai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Theloai exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TheloaiPersistenceImpl.class);
	private static Theloai _nullTheloai = new TheloaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Theloai> toCacheModel() {
				return _nullTheloaiCacheModel;
			}
		};

	private static CacheModel<Theloai> _nullTheloaiCacheModel = new CacheModel<Theloai>() {
			@Override
			public Theloai toEntityModel() {
				return _nullTheloai;
			}
		};
}