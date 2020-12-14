package incapsulation;

public class encapsulation {

	public static void main(String[] args) {
		laptop l1=new laptop();
		l1.setPrice(2500);
		System.out.println(l1.getPrice()+" "+l1.getRam());

	}
	
	 protected void doWork() {
		 System.out.println("working working");
	 }
	 
	  

}
class laptop{
	private int ram;
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	private int price;
	
	public void setPrice(int price) {
		boolean admin=true;
		
		if(admin)
		this.price=price;
		else
			System.out.println("you can not change the price");
	}
	public int getPrice() {
		return price;
	}
	}