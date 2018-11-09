public class ch9lab3ex {
	public static void main(String[] args) {
		
		lab3 item1 = new lab3();
		lab3 item2 = new lab3();
		System.out.println(item1.getLaptop() + " $" + item1.getLPrice());
		System.out.println(item2.getPrinter() + " $" + item2.getPPrice());
		item1.setlPrice(999.00);
		item2.setpPrice(329.99);
		System.out.println(item1.getLaptop() + " $" + item1.getLPrice());
		System.out.println(item2.getPrinter() + " $" + item2.getPPrice());		
	}
	
}
