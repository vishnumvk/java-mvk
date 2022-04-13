package abstractdemo;
//example of abstract class that have method body
abstract class Bike{
	
 Bike()
 {
	 System.out.println("bike is created");
 }
 abstract void run();
 void changeGear()
 {
	 System.out.println("gear changed");
	 }
}

class Honda extends Bike{
void run(){
	System.out.println("running safely..");
	}
}


public class Abstractdemo {
	public static void main(String args[]){
		Bike obj = new Honda();
		//Bike b1 = new Bike(); b1 cannot be created since its class contains abstracted member
		obj.run();
		obj.changeGear();
		}
}
