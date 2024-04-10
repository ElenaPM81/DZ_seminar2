package seminar2.task1;


public class Animal {

    private String name;
    private int age;


    public Animal(String name,int age) {
        this.age = age;
        this.name = name;
    }


}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name,age);
    }
    public void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name,age);
    }
    public void makeSound() {
        System.out.println("Meow");
    }
}
