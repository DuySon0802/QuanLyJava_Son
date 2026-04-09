package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseModuleDAO {
	private Connection cnn;
	private PreparedStatement ps;
	private ResultSet rs;
	public List<CourseModule> getCourseModules(){
		List<CourseModule> lst=new ArrayList();
		String sql="SELECT * FROM DanhSachHocPhan";
	
		try {
			cnn=new DBContext().getConnection();
			ps=cnn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				CourseModule cmObj= new CourseModule();
				cmObj.setMaHP(rs.getString("maHocPhan"));
				cmObj.setTenHP(rs.getString("tenHocPhan"));
				cmObj.setSoTichChi(rs.getInt("soTinChi"));
				cmObj.setMaHPTienQuyet(rs.getString("MaHocPhanTienQuyet"));
				lst.add(cmObj);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

}
