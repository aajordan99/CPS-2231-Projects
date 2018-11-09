public class jordanaa_Course1 {
private String cName;
private String deptCode;
private int rNumb;
private int vRef;
private static int value = 2000;

public jordanaa_Course1() {
	cName = "";
	deptCode = "";
	rNumb = 0;
	vRef = 0;
	vRef = value;
	value++;
}

public jordanaa_Course1(String name, String dCode, int room) {
	

	cName = name;
	deptCode = dCode;
	rNumb = room;
	vRef = value;
	value++;
}
	public String getDept() {
		return deptCode;
	}
	public int getRNumb() {
		return rNumb;
	}
	public String getcName() {
		return cName;
	}
	
	public void setDept(String deptCode) {
		this.deptCode = deptCode;
	}
	public void setRNumb(int rNumb) {
		this.rNumb = rNumb;
	}
	public void setCName(String cName) {
		this.cName = cName;
	}
	
	public String toString() {
		return " Course Name: " + cName + " Dept: " + deptCode + " CourseNumber: " + vRef + " Room number: " + rNumb;
	}

}
