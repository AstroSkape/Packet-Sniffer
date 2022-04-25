package PacketSniffer;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect_db {
	static Connection con = null;
	static int id = 1;
	public static Connection getConnection()
	{
		if(con!=null)
			return con;
		return obtainConnection();
	}
	private static Connection obtainConnection()
	{
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/postgres",
							"postgres", "root");
		}
		catch(Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return con;
	}
}
