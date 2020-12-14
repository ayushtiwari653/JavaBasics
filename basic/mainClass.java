package basic;

import incapsulation.encapsulation;

public class mainClass {
	
	public static void main(String[] args) {
		//person p1=new person(23,"Ayush Tiwari");
		//person p2=new person(22,"Shubham yadav");
		
		/*System.out.println(p1.age+"<---"+p1.name);
		System.out.println(p2.age+"<---"+p2.name);*/
		// p1.eat();
		//compile time Polymorphism 
		//p2.walk();
		//p2.walk(20);
		//System.out.println(person.count);
		//Developer d1=new Developer(23,"Ayush");
		//d1.walk();
		
	
		
		
	}
}
 
class Developer extends person{

	Developer(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	void walk() {
		System.out.println("Developer "+name+" is walking");
	}
}

class person{
	protected String name;// property
	int age;
	static int count=0;
	/*person(){
		count++;
		name="";
		age=0;
	}*/
	person(int age,String name){
		//this();
		this.age=age;
		this.name=name;	
	}
	
	
	void walk() { //method1
		System.out.println(name+" is walking");
	}
	void walk(int steps) {
		System.out.println(name+" walking "+steps+ " steps");
	}
	void eat() {//method2
		System.out.println(name+" is eating");
	}
	void doWork() {
		System.out.println(name+" is doing work");
	}
 }