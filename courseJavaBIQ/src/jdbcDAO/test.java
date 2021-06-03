package jdbcDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);

		DAO dao = new DAO();
		//dao.createChain(2, "Fox");
		/*Shop shop1 = new Shop(1, "Rekushet-Herzlia", "Herzlia", "Rav KUK", 1, "7 stars", "Rekushet");
		dao.addStoreToChain(shop1);		*/
		/*Employee emp = new Employee(2, "Dudu", "Rekushet-Herzlia", "Rekushet", "Herzlia", "7 stars", "Rav Kuk", 1, "Moe");
		dao.addEmployeeToChain(emp);*/
		dao.selectAllShopsByMall("7 stars");
		
	}
}
