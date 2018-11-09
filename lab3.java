public class lab3 {
		private String laptop;
		private String printer;
		private double lPrice;
		private double pPrice;
		
		public lab3() {
			laptop = "Laptop";
			printer = "Printer";
			lPrice = 799.99;
			pPrice = 219.99;
		}
		
		public lab3(String pc, String prnt, double lP, double pP) {
			laptop = pc;
			printer = prnt;
			lPrice = lP;
			pPrice = pP;
		}
		public String getLaptop(){
			return laptop;
		}
		public String getPrinter() {
			return printer;
		}
		public double getLPrice() {
			return lPrice;
		}
		public double getPPrice() {
			return pPrice;
		}
		public void setLaptop(String newLaptop) {
			laptop = newLaptop;
		}
		public void setPrinter(String newP) {
			printer = newP;
		}
		public void setlPrice(double newlPrice) {
			lPrice = newlPrice;
		}
		public void setpPrice(double newpPrice) {
			pPrice = newpPrice;
		}
	}


