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
