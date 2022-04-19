package oops_examples.abstraction;


abstract class Bike{
	
	 Bike()
	 {
		 System.out.println("bike is created");
	 }
	 abstract void run();
	 static void changeGear()
	 {
		 System.out.println("gear changed from bike");
		 }
	}

	class Honda extends Bike{
	void run(){
		System.out.println("running safely..");
		}
	   
	}
	class HondaPro extends Honda{
		public void displayMaxspeed() {
			System.out.println(" Max speed is 100kms...");
		}
		public static void changeGear() {
			   System.out.println("gear changed from HondaPro");
		   }
		
	}


	public class AbstractDemo {
		public static void main(String args[]){
			HondaPro obj = new HondaPro();
			//Bike b1 = new Bike(); b1 cannot be created since its class contains abstracted member
			//A non abstract subclass needs to override all abstract methods of parent class 
			obj.run();
			//obj.changeGear();
			Bike.changeGear();
			}
	}
