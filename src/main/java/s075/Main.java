package s075;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();
		Poodle p3 = new Poodle ("Luna", 10, 6);
        Dog dog = new Dog ("Thunder", 21);
		
		System.out.println(poodle);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(dog);
	}
}
