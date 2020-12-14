package basic;

public class Abstraction {

	public static void main(String[] args) {
		BMW car1=new BMW(1000);
		audi car2=new audi(5000); 
		car1.start();
		car2.start();
		System.out.println(car1.price);
		System.out.println(car2.price);
		car1.Break();
	}

}


class audi extends car{
	audi(){
		super.price=0;
	}
	audi(int price){
		super.price=price;
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi is Starting");
		
	}
	
}

class BMW extends car{
	BMW(){
		super.price=0;
	}
	BMW(int price){
		this();
		super.price=price;
	}

	@Override
	void start() {
		System.out.println("BMW is Starting");
		
	}
	
}


 abstract class car{
	int price;
	
	abstract void start();
	
	void Break() {
		System.out.println("car is breaking");
	}
}