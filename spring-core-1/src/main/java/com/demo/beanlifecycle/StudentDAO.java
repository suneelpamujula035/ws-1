package com.demo.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//@Component
public class StudentDAO {

//	@Value("${MySql.driver}")
//	private String driver;
//	@Value("${MySql.url}")
//	private String url;
//	@Value("${MySql.username}")
//	private String username;
//	@Value("${MySql.password}")
//	private String password;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/demo";
	private String username = "root";
	private String password = "root";
	Connection con;
	
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("inside init method");
		createConnection();
	}
	public void createConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("connection created");
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
	}
	
	public void getStudents() throws SQLException, ClassNotFoundException
	{
		String query = "select * from demo.studentinfo";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
	}
	public void deleteStudent(int id) throws SQLException, ClassNotFoundException
	{
		String query = "delete from demo.studentinfo where id="+id;
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Record deleted with the id : "+id);
	}
	
	public void closeConnection() throws SQLException
	{
		System.out.println("connection closed");
		con.close();
	}
	//@PreDestroy
	public void destroy() throws SQLException
	{
		System.out.println("inside destroy method");
		closeConnection();
	}
}
