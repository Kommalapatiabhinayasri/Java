class Animal{
  void makeSound(){
    System.out.println("some sound");
  }
}
class Dog extends Animal{
  void makeSound(){
    System.out.println("wolf!");
  }
  void makeSound(String message){
    System.out.println(message);
  }
  Dog(){
    System.out.println("a dog is created");
  }
  Dog(String name){
    System.out.println("a dog named "+name+"is created");
  }
}
public class Main{
  public static void main(String[]args){
    Animal animal=new Dog();
    animal.makeSound();
    Dog dog=new Dog();
    dog.makeSound();
    dog.makeSound("bark!");
    Dog anotherDog=new Dog();
    Dog yetAnotherDog=new Dog("fido");
  }
}