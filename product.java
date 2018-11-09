public class product {
	private String television;
	private String computer;
	private double tPrice;
	private double cPrice;
	
	public product() {
		television = "";
		computer = "";
		tPrice = 0.0;
		cPrice = 0.0;
	}
	public product(String tv, String pc, double tP, double cP) {
		television = tv;
		computer = pc;
		tPrice = tP;
		cPrice = cP;
	}
	public String getTelevision(){
		return television;
	}
	public String getComputer() {
		return computer;
	}
	public double getTPrice() {
		return tPrice;
	}
	public double getCPrice() {
		return cPrice;
	}
	public void setTelevision(String newTv) {
		television = newTv;
	}
	public void setComputer(String newPc) {
		computer = newPc;
	}
	public void setcPrice(double newtPrice) {
		tPrice = newtPrice;
	}
	public void settPrice(double newcPrice) {
		cPrice = newcPrice;
	}
}
