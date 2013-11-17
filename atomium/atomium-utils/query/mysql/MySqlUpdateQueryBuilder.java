package query.mysql;

import query.Op;
import query.Query;
import query.UpdateQueryBuilder;

public class MySqlUpdateQueryBuilder implements UpdateQueryBuilder {
	
	private String table;
	
	private StringBuilder sb = new StringBuilder();
	
	private boolean value;

	public MySqlUpdateQueryBuilder(String table) {
		this.table = table;
	}
	
	private void print(Op op) {
		sb.append(MySqlOp.print(op));
	}

	public UpdateQueryBuilder value(String field) {
		if (value) sb.append(", ");
		else value = true;
		
		sb.append("`").append(field).append("` = '#").append(field).append("#'");
		
		return this;
	}

	public UpdateQueryBuilder value(String field, Object value) {
		if (this.value) sb.append(", ");
		else this.value = true;
		
		sb.append("`").append(field).append("` = '").append(MySqlOp.toString(value)).append("'");
		
		return this;
	}

	public UpdateQueryBuilder where(String field, Op op) {
		sb.append(" WHERE `").append(field).append("`");
		print(op);
		sb.append("'#").append(field).append("#'");
		
		return this;
	}

	public UpdateQueryBuilder where(String field, Op op, Object value) {
		sb.append(" WHERE `").append(field).append("`");
		print(op);
		sb.append("'").append(MySqlOp.toString(value)).append("'");
		
		return this;
	}

	public UpdateQueryBuilder and(String field, Op op) {
		sb.append(" AND `").append(field).append("`");
		print(op);
		sb.append("'#").append(field).append("#'");
		
		return this;
	}

	public UpdateQueryBuilder and(String field, Op op, Object value) {
		sb.append(" AND `").append(field).append("`");
		print(op);
		sb.append("'").append(MySqlOp.toString(value)).append("'");
		
		return this;
	}

	public UpdateQueryBuilder or(String field, Op op) {
		sb.append(" OR `").append(field).append("`");
		print(op);
		sb.append("'#").append(field).append("#'");
		
		return this;
	}

	public UpdateQueryBuilder or(String field, Op op, Object value) {
		sb.append(" OR `").append(field).append("`");
		print(op);
		sb.append("'").append(MySqlOp.toString(value)).append("'");
		
		return this;
	}
	
	public Query toQuery() {
		return new MySqlQuery("UPDATE `" + table + "` SET " + sb.toString() + ";");
	}

}
