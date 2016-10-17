package schoolwork;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// import my package
import mytools.*;


public class OperateMysqlTable {
	
	public static void main(String[] args){
		OperateMysqlTable op = new OperateMysqlTable();
		
		op.insert();
	}
	
	public void insert() {
		Connection conn = null;
		Statement sql = null;
		
		try {
			Class.forName(MysqlConnKeys.getDbDriver());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(
				MysqlConnKeys.getDbUrl(), MysqlConnKeys.getDbName(),
				MysqlConnKeys.getDbPassword());
			sql = conn.createStatement();
			
			sql.executeUpdate("INSERT INTO students VALUES('2009','郭路', 23)");
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
				sql.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
}
