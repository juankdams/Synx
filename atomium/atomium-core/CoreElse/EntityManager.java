package CoreElse;

import java.sql.ResultSet;

import UtilsElse.Function1;
import query.Query;
import query.QueryBuilderFactory;

public interface EntityManager {
	
	void start();
	void stop();

	QueryBuilderFactory builder();
	
	<T> T query(Query query, Function1<T, ResultSet> function);
	void executeLater(Query query);
	void execute(Query query);
	
}
