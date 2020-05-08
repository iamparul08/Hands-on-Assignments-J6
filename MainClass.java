/*Create a class named Animal which includes methods like eat() and sleep().
Create a child class of Animal named Bird and override the parent class methods.
Add a new method named fly().
Create an instance of Animal class and invoke eat and sleep methods using this object.
Create an instance of Bird class and invoke eat, sleep and fly methods using this object.*/

class Animal {
		
		public void eat() {
			System.out.println("This is eat method of Animal class.");
		}
		
		public void sleep() {
			System.out.println("This is sleep method of Animal class.");
		}
}

class Bird extends Animal {
		
		public void eat() {
			System.out.println("This is eat method of Bird class.");
		}
		
		public void sleep() {
			System.out.println("This is sleep method of Bird class.");
		}
		
		public void fly() {
			System.out.println("This is fly method of Bird class.");
		}
		
}
public class MainClass {
	public static void main(String args[]) {
		
		Animal a = new Animal();
		a.eat();
		a.sleep();
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
	}
}