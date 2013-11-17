package Abstractions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Interfaces.IService;


public abstract class AbstractSqlService implements IService {
	
	
	public abstract ResultSet executeQuery(String query) throws SQLException;
	public abstract PreparedStatement newTransact(String baseQuery) throws SQLException;
	protected abstract void commitTransacts();
	protected abstract void closeCons();
	protected abstract Connection createConnection(String dbHostIP, String dbName, String sqlAccountName, String sqlAccountPass);
	
	
	
}
