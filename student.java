public class student extends Person {
	private String major;

	public student() {
		super();
		major = "";
	}
	public student(String name, int birthYear, String major) {
		super(name, birthYear);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Major: " + major;
	}
}
