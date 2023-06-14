package session.com.six;

public class AnimalMain {

	public static void main(String[] args) {
		System.out.println("___________ creating cat___________");
		AnimalAbstract an=new Cat();
		AnimalAbstract ann=new Dog();
		an.name();
		an.eat();
		an.sound();
		System.out.println("___________ creating dog___________");
		ann.name();
		ann.eat();
		ann.sound();
		
	}

}
