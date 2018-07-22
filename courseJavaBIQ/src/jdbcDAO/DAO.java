package jdbcDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {
	
	
	private final static String sqlChain="insert into chainshops.chains (id,name) VALUES (?,?)";
	private final static String sqlShop="insert into chainshops.shops (Id,Name,City,Street,BuildingNumber,Mall,Chain) VALUES (?,?,?,?,?,?,?)";
	private final static String sqlEmployee="insert into chainshops.employee (Id,Name,ShopName,Chain,City,Mall,Street,BuildingNumber,MallGroup) VALUES (?,?,?,?,?,?,?,?,?)";
	private final static String sqlSelectShopByMall="select Name from chainshops.shops where Mall=?";
	
	protected static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException();
		}
		String url = "jdbc:mysql://localhost:3306/chainShops";
		Connection con;
			con = DriverManager.getConnection(url,"root","Aa123456");
		return con;
	}
	
	public void createChain(int Id,String Name) throws SQLException {
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement(sqlChain);
		stmt.setInt(1,Id);
		stmt.setString(2,Name);	
		int res = stmt.executeUpdate();	
		stmt.close();
		con.close();
	}
	
	public void addStoreToChain(Shop shop) throws SQLException {
		Connection con = getConnection(); 
		PreparedStatement stmt = con.prepareStatement(sqlShop);
		stmt.setInt(1,shop.getId());
		stmt.setString(2,shop.getName());
		stmt.setString(3,shop.getCity());
		stmt.setString(4,shop.getStreet());
		stmt.setInt(5,shop.getBuildingNumber());
		stmt.setString(6,shop.getMall());
		stmt.setString(7,shop.getChain());
		int res = stmt.executeUpdate();	
		stmt.close();
		con.close();
	}
	
	public void addEmployeeToChain(Employee emp) throws SQLException {
		Connection con = null;
		//PreparedStatement stmt = null;
		con = getConnection();
		try(PreparedStatement stmt = con.prepareStatement(sqlEmployee)) {
			stmt.setInt(1,emp.getId());
			stmt.setString(2,emp.getName());
			stmt.setString(3,emp.getShopName());
			stmt.setString(4,emp.getChain());
			stmt.setString(5,emp.getCity());
			stmt.setString(6,emp.getMall());
			stmt.setString(7,emp.getStreet());
			stmt.setInt(8,emp.getBuildingNumber());
			stmt.setString(9,emp.getMallGroup());
			int res = stmt.executeUpdate();	
		} 
	} 
	
	public ArrayList<String>  selectAllShopsByMall(String str) throws SQLException {
		ArrayList<String> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = getConnection();
			stmt = con.prepareStatement(sqlSelectShopByMall);
			stmt.setString(1,str);

			ResultSet res = stmt.executeQuery();
			if (res.next()) {
			     System.out.println(res.getString(1));
			     list.add(res.getString(1)) ;
			}
		} finally {
			stmt.close();
			con.close();
		}
		return list;
	}
	
	
	/*public static void DAO () throws SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/chainShops";
		Connection con = DriverManager.getConnection(url,"root","Aa123456");
		Statement stmt = con.createStatement(); 
		ResultSet rs = stmt.executeQuery("SELECT version()");
		if (rs.next()) {
		     System.out.println("Database Version : " + rs.getString(1));
		}
		stmt.close();
		con.close();
	}*/
}
