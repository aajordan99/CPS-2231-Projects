public class jordanaa_Student {
	private String name;
	private int sID;
	private static int start = 100;

	public jordanaa_Student() {
		name = "";
		sID = 0;
		sID = start;
		start++;
	}

	public jordanaa_Student(String name) {
		this.name = name;
		sID = start;
		start++;
	}

	public String getName() {
		return name;
	}
	public int getID() {
		return sID;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setID(int sID) {
		this.sID = sID;
	}

	public String toString() {
		return "Student:" + name + " ID: " + sID;
	}
}
