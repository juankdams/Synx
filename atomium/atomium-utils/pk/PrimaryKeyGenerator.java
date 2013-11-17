package pk;

public interface PrimaryKeyGenerator<PK> {
	
	void setMax(PK pk);
	
	PK next();
	
}
