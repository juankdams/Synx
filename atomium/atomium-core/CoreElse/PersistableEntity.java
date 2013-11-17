package CoreElse;

import UtilsElse.Entity;

public interface PersistableEntity<PK> extends Entity<PK> {

	void setId(PK pk);
	
}
