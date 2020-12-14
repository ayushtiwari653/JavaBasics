package Interfaces;

public class Interfaces implements car,person{

	public static void main(String[] args) {
		Interfaces i1=new Interfaces();
		i1.start();
		i1.Run();
	}
	
	public void start() {
		System.out.println("my car is starting ");
		
	}

	
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Run() {
		System.out.println("Car is runing");
		
	}

}

interface car{
	// these all are default public abstract
	void start();
	void Run();
}

interface person{
	void walk();
}
