package CoreElse;

import UtilsElse.Entity;
import UtilsElse.Reference;

public interface EntityReference<PK, T extends Entity<PK>> extends Reference<T> {
	PK getPk();
}
