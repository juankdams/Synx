package repository.impl;

import CoreElse.EntityManager;
import repository.SaveableEntityRepository;
import UtilsElse.Entity;
import query.Query;

public abstract class AbstractSaveableEntityRepository<PK, T extends Entity<PK>>
	extends AbstractBaseEntityRepository<PK, T>
	implements SaveableEntityRepository<PK, T>
{

	protected AbstractSaveableEntityRepository(EntityManager em) {
		super(em);
	}
	
	protected abstract Query buildSaveQuery(T entity);
	
	protected void beforeSave(T entity) {}
	protected void onSaved(T entity) {}
	
	public void saveLater() {
		for (T entity : entities.values()) {
			saveLater(entity);
		}
	}
	
	public void saveLater(T entity) {
		beforeSave(entity);
		
		Query query = buildSaveQuery(entity);
		em.executeLater(query);

		onSaved(entity);
	}

	public void save() {
		for (T entity : entities.values()) {
			save(entity);
		}
	}

	public void save(T entity) {
		beforeSave(entity);
		
		Query query = buildSaveQuery(entity);
		em.execute(query);

		onSaved(entity);
	}

}
