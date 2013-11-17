package repository;

import UtilsElse.Entity;

public interface EntityRepository<PK, T extends Entity<PK>> extends
		PersistableEntityRepository<PK, T>,
		SaveableEntityRepository<PK, T>
{

}
