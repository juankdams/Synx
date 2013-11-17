package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import CoreElse.EntityManager;
import CoreElse.LiveEntityReference;
import exception.LoadingException;
import repository.SaveableEntityRepository;
import UtilsElse.Entity;
import UtilsElse.Filter;
import UtilsElse.Function1;
import query.Query;

public abstract class AbstractLiveEntityRepository<PK, T extends Entity<PK>>
	implements SaveableEntityRepository<PK, T>
{
	
	protected final EntityManager em;
	
	public AbstractLiveEntityRepository(EntityManager em) {
		this.em = em;
	}
	
	public abstract long getEntityTimeToLive();
	
	protected abstract Query buildLoadQuery(PK pk);
	protected abstract Query buildSaveQuery(T entity);
	protected abstract T load(ResultSet result) throws SQLException;
	
	protected T find(Query query) {
		return em.query(query, new Function1<T, ResultSet>() {
			public T invoke(ResultSet arg1) throws Exception {
				arg1.next();
				return load(arg1);
			}
		});
	}

	public T find(PK pk) {
		return find(buildLoadQuery(pk));
	}

	public int count() {
		return -1;
	}

	public List<T> filter(Filter<T> filter) {
		return null;
	}

	public T find(Filter<T> filter) {
		return null;
	}

	public int load() throws LoadingException {
		return 0;
	}

	public boolean loaded() {
		return true;
	}

	public Iterator<T> iterator() {
		return new Iterator<T>() {
			public boolean hasNext() {
				return false;
			}

			public T next() {
				return null;
			}

			public void remove() {
			}
		};
	}
	
	public void save() {
		
	}

	public void saveLater() {
	}

	public void save(T entity) {
		Query query = buildSaveQuery(entity);
		em.execute(query);
	}
	
	public void saveLater(T entity) {
		Query query = buildSaveQuery(entity);
		em.executeLater(query);
	}
	
	public LiveEntityReference<PK, T> getReference(PK pk) {
		return new LiveEntityReference<PK, T>(pk, this);
	}
	
}
