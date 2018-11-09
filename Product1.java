public class Product1 {
	private String product;
	private double price;
	private int productId;
	private static int productSeq = 1;
	
	public Product1() {
		product = " ";
		price = 0.0;
		productId = 0;
		productSeq = 0;
		productId = productSeq;
		productSeq++;
	}
	public Product1(String product, double price) {
		this.product = product;
		this.price = price;
		productId = productSeq;
		productSeq++;
	}
	public String getProduct() {
		return product;
	}
	public double getPrice() {
		return price;
	}
	public int getProdId() {
		return productId;
	}
	public int getProdSeq() {
		return productSeq;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setProdId(int productId) {
		this.productId = productId;
	}
	public String toString() {
		return "Product Name " + product + "\nPrice $" + price + "\nProduct ID: " + productId;
	}
}
