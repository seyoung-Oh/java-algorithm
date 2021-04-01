
public class CastExceptionTeset {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal; // class cast Exception 발생 가능
	} 

}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
