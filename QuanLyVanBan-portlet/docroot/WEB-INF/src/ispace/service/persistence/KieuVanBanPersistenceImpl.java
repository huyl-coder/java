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

import ispace.NoSuchKieuVanBanException;

import ispace.model.KieuVanBan;

import ispace.model.impl.KieuVanBanImpl;
import ispace.model.impl.KieuVanBanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kieu van ban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see KieuVanBanPersistence
 * @see KieuVanBanUtil
 * @generated
 */
public class KieuVanBanPersistenceImpl extends BasePersistenceImpl<KieuVanBan>
	implements KieuVanBanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KieuVanBanUtil} to access the kieu van ban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KieuVanBanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
			KieuVanBanModelImpl.FINDER_CACHE_ENABLED, KieuVanBanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
			KieuVanBanModelImpl.FINDER_CACHE_ENABLED, KieuVanBanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
			KieuVanBanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public KieuVanBanPersistenceImpl() {
		setModelClass(KieuVanBan.class);
	}

	/**
	 * Caches the kieu van ban in the entity cache if it is enabled.
	 *
	 * @param kieuVanBan the kieu van ban
	 */
	@Override
	public void cacheResult(KieuVanBan kieuVanBan) {
		EntityCacheUtil.putResult(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
			KieuVanBanImpl.class, kieuVanBan.getPrimaryKey(), kieuVanBan);

		kieuVanBan.resetOriginalValues();
	}

	/**
	 * Caches the kieu van bans in the entity cache if it is enabled.
	 *
	 * @param kieuVanBans the kieu van bans
	 */
	@Override
	public void cacheResult(List<KieuVanBan> kieuVanBans) {
		for (KieuVanBan kieuVanBan : kieuVanBans) {
			if (EntityCacheUtil.getResult(
						KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
						KieuVanBanImpl.class, kieuVanBan.getPrimaryKey()) == null) {
				cacheResult(kieuVanBan);
			}
			else {
				kieuVanBan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all kieu van bans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KieuVanBanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KieuVanBanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the kieu van ban.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KieuVanBan kieuVanBan) {
		EntityCacheUtil.removeResult(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
			KieuVanBanImpl.class, kieuVanBan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KieuVanBan> kieuVanBans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KieuVanBan kieuVanBan : kieuVanBans) {
			EntityCacheUtil.removeResult(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
				KieuVanBanImpl.class, kieuVanBan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new kieu van ban with the primary key. Does not add the kieu van ban to the database.
	 *
	 * @param id the primary key for the new kieu van ban
	 * @return the new kieu van ban
	 */
	@Override
	public KieuVanBan create(long id) {
		KieuVanBan kieuVanBan = new KieuVanBanImpl();

		kieuVanBan.setNew(true);
		kieuVanBan.setPrimaryKey(id);

		return kieuVanBan;
	}

	/**
	 * Removes the kieu van ban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the kieu van ban
	 * @return the kieu van ban that was removed
	 * @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KieuVanBan remove(long id)
		throws NoSuchKieuVanBanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the kieu van ban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the kieu van ban
	 * @return the kieu van ban that was removed
	 * @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KieuVanBan remove(Serializable primaryKey)
		throws NoSuchKieuVanBanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KieuVanBan kieuVanBan = (KieuVanBan)session.get(KieuVanBanImpl.class,
					primaryKey);

			if (kieuVanBan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKieuVanBanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(kieuVanBan);
		}
		catch (NoSuchKieuVanBanException nsee) {
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
	protected KieuVanBan removeImpl(KieuVanBan kieuVanBan)
		throws SystemException {
		kieuVanBan = toUnwrappedModel(kieuVanBan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(kieuVanBan)) {
				kieuVanBan = (KieuVanBan)session.get(KieuVanBanImpl.class,
						kieuVanBan.getPrimaryKeyObj());
			}

			if (kieuVanBan != null) {
				session.delete(kieuVanBan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (kieuVanBan != null) {
			clearCache(kieuVanBan);
		}

		return kieuVanBan;
	}

	@Override
	public KieuVanBan updateImpl(ispace.model.KieuVanBan kieuVanBan)
		throws SystemException {
		kieuVanBan = toUnwrappedModel(kieuVanBan);

		boolean isNew = kieuVanBan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (kieuVanBan.isNew()) {
				session.save(kieuVanBan);

				kieuVanBan.setNew(false);
			}
			else {
				session.merge(kieuVanBan);
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

		EntityCacheUtil.putResult(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
			KieuVanBanImpl.class, kieuVanBan.getPrimaryKey(), kieuVanBan);

		return kieuVanBan;
	}

	protected KieuVanBan toUnwrappedModel(KieuVanBan kieuVanBan) {
		if (kieuVanBan instanceof KieuVanBanImpl) {
			return kieuVanBan;
		}

		KieuVanBanImpl kieuVanBanImpl = new KieuVanBanImpl();

		kieuVanBanImpl.setNew(kieuVanBan.isNew());
		kieuVanBanImpl.setPrimaryKey(kieuVanBan.getPrimaryKey());

		kieuVanBanImpl.setId(kieuVanBan.getId());
		kieuVanBanImpl.setTen(kieuVanBan.getTen());

		return kieuVanBanImpl;
	}

	/**
	 * Returns the kieu van ban with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the kieu van ban
	 * @return the kieu van ban
	 * @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KieuVanBan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKieuVanBanException, SystemException {
		KieuVanBan kieuVanBan = fetchByPrimaryKey(primaryKey);

		if (kieuVanBan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKieuVanBanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return kieuVanBan;
	}

	/**
	 * Returns the kieu van ban with the primary key or throws a {@link ispace.NoSuchKieuVanBanException} if it could not be found.
	 *
	 * @param id the primary key of the kieu van ban
	 * @return the kieu van ban
	 * @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KieuVanBan findByPrimaryKey(long id)
		throws NoSuchKieuVanBanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the kieu van ban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the kieu van ban
	 * @return the kieu van ban, or <code>null</code> if a kieu van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KieuVanBan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KieuVanBan kieuVanBan = (KieuVanBan)EntityCacheUtil.getResult(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
				KieuVanBanImpl.class, primaryKey);

		if (kieuVanBan == _nullKieuVanBan) {
			return null;
		}

		if (kieuVanBan == null) {
			Session session = null;

			try {
				session = openSession();

				kieuVanBan = (KieuVanBan)session.get(KieuVanBanImpl.class,
						primaryKey);

				if (kieuVanBan != null) {
					cacheResult(kieuVanBan);
				}
				else {
					EntityCacheUtil.putResult(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
						KieuVanBanImpl.class, primaryKey, _nullKieuVanBan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KieuVanBanModelImpl.ENTITY_CACHE_ENABLED,
					KieuVanBanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return kieuVanBan;
	}

	/**
	 * Returns the kieu van ban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the kieu van ban
	 * @return the kieu van ban, or <code>null</code> if a kieu van ban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KieuVanBan fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the kieu van bans.
	 *
	 * @return the kieu van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KieuVanBan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kieu van bans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kieu van bans
	 * @param end the upper bound of the range of kieu van bans (not inclusive)
	 * @return the range of kieu van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KieuVanBan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the kieu van bans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kieu van bans
	 * @param end the upper bound of the range of kieu van bans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of kieu van bans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KieuVanBan> findAll(int start, int end,
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

		List<KieuVanBan> list = (List<KieuVanBan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KIEUVANBAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KIEUVANBAN;

				if (pagination) {
					sql = sql.concat(KieuVanBanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KieuVanBan>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KieuVanBan>(list);
				}
				else {
					list = (List<KieuVanBan>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the kieu van bans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KieuVanBan kieuVanBan : findAll()) {
			remove(kieuVanBan);
		}
	}

	/**
	 * Returns the number of kieu van bans.
	 *
	 * @return the number of kieu van bans
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

				Query q = session.createQuery(_SQL_COUNT_KIEUVANBAN);

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
	 * Initializes the kieu van ban persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ispace.model.KieuVanBan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KieuVanBan>> listenersList = new ArrayList<ModelListener<KieuVanBan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KieuVanBan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KieuVanBanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KIEUVANBAN = "SELECT kieuVanBan FROM KieuVanBan kieuVanBan";
	private static final String _SQL_COUNT_KIEUVANBAN = "SELECT COUNT(kieuVanBan) FROM KieuVanBan kieuVanBan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "kieuVanBan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KieuVanBan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KieuVanBanPersistenceImpl.class);
	private static KieuVanBan _nullKieuVanBan = new KieuVanBanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KieuVanBan> toCacheModel() {
				return _nullKieuVanBanCacheModel;
			}
		};

	private static CacheModel<KieuVanBan> _nullKieuVanBanCacheModel = new CacheModel<KieuVanBan>() {
			@Override
			public KieuVanBan toEntityModel() {
				return _nullKieuVanBan;
			}
		};
}