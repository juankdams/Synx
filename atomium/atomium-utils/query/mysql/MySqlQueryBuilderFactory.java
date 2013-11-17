package query.mysql;

import query.DeleteQueryBuilder;
import query.InsertQueryBuilder;
import query.QueryBuilderFactory;
import query.SelectQueryBuilder;
import query.UpdateQueryBuilder;
import org.joda.time.format.DateTimeFormatter;

public class MySqlQueryBuilderFactory implements QueryBuilderFactory {

	public SelectQueryBuilder select(String table, String... fields) {
		return new MySqlSelectQueryBuilder(table, fields);
	}

	public InsertQueryBuilder insert(String table) {
		return new MySqlInsertQueryBuilder(table);
	}

	public UpdateQueryBuilder update(String table) {
		return new MySqlUpdateQueryBuilder(table);
	}

	public DeleteQueryBuilder delete(String table) {
		return new MySqlDeleteQueryBuilder(table);
	}

	public DateTimeFormatter dateTimeFormatter() {
		return MySqlOp.DATE_TIME_FORMATTER;
	}

}
