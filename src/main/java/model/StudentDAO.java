package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
	private Connection cnn;
	private PreparedStatement ps;
	//private ResultSet rs;
	public boolean checkAccount(String usn, String pwd) {
		String sql="SELECT * FROM students WHERE stdUsn=? and stdPwd=?";
		boolean check=false;
		try {
			cnn=new DBContext().getConnection();
			ps=cnn.prepareStatement(sql);
			ps.setString(1, usn);
			ps.setString(2, pwd);
			check=ps.execute();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		
	}
	

}