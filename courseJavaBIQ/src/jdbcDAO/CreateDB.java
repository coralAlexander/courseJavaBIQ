package jdbcDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class CreateDB {
	
	Connection con ;
	public CreateDB () throws ClassNotFoundException, SQLException {
		con=DAO.getConnection();	
	}
}
