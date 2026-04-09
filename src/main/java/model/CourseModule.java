package model;

public class CourseModule {
	private String maHP;
	private String tenHP;
	private int soTichChi;
	private String MaHPTienQuyet;
	public CourseModule() {
		super();
	}
	public CourseModule(String maHP, String tenHP, int soTichChi, String maHPTienQuyet) {
		super();
		this.maHP = maHP;
		this.tenHP = tenHP;
		this.soTichChi = soTichChi;
		MaHPTienQuyet = maHPTienQuyet;
	}
	public String getMaHP() {
		return maHP;
	}
	public void setMaHP(String maHP) {
		this.maHP = maHP;
	}
	public String getTenHP() {
		return tenHP;
	}
	public void setTenHP(String tenHP) {
		this.tenHP = tenHP;
	}
	public int getSoTichChi() {
		return soTichChi;
	}
	public void setSoTichChi(int soTichChi) {
		this.soTichChi = soTichChi;
	}
	public String getMaHPTienQuyet() {
		return MaHPTienQuyet;
	}
	public void setMaHPTienQuyet(String maHPTienQuyet) {
		MaHPTienQuyet = maHPTienQuyet;
	}
	
	

	

}
