package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateQuoteDB 
        {
	public static int saveAccount(String q_n,String e,String m,String u_p,String q) throws ClassNotFoundException, SQLException  {
		int status=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/praveena","root","dakshith15");
		PreparedStatement ps =con.prepareStatement("insert into addstudent( Quote_name,Email,Mobile,unite_price,Quantity) values(?,?,?,?,?)");
		ps.setString(1,  q_n);
		ps.setString(2,    e);
		ps.setString(3,    m);
		ps.setString(4,  u_p);
		ps.setString(5,    q);
		status=ps.executeUpdate();
		con.close();
		return status;
		
        }
        }