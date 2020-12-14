package basic;

public class Abstraction {

	public static void main(String[] args) {
		BMW car=new BMW();
		car.start();car.price=10000;
		
		System.out.println(car.price);
		car.Break();
	}

}


class audi extends car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi is Starting");
		
	}
	
}

class BMW extends car{

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