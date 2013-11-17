package query;

public interface Query {

	Query setParameter(String field, Object obj);
	
	String toString();
	
}
