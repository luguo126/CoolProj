package mytools;


// define some parameters for connect to MySQL database
public class MysqlConnKeys {
	private static final String DB_DRIVER = "org.gjt.mm.mysql.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/fortest";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "guolu123";
	
	public static String getDbName() {
		return DB_USERNAME;
	}
	public static String getDbDriver() {
		return DB_DRIVER;
	}
	public static String getDbPassword() {
		return DB_PASSWORD;
	}
	public static String getDbUrl() {
		return DB_URL;
	}
}
