package seminar2.task1;


//Создайте абстрактный класс "Animal" с полями "name" и "age".
//Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat")
// с уникальными полями и методами.
//Создайте массив объектов типа "Animal" и с использованием Reflection API
// выполните следующие действия:
//Выведите на экран информацию о каждом объекте.
//Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Class<?> animalClass = Animal.class;
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Bobik", 5);
        animals[1] = new Cat("Murzik", 4);
        animals[2] = new Dog("Strelka", 3);
        animals[3] = new Cat("Vaska", 4);
        animals[4] = new Dog("Sharik", 3);

        for (Animal animal : animals){

            Field nameAnimal = animalClass.getDeclaredField("name");
            nameAnimal.setAccessible(true);
            Field ageAnimal = animalClass.getDeclaredField("age");
            ageAnimal.setAccessible(true);


            System.out.println("Object: " + animal.getClass().getSimpleName() + ", name: " + nameAnimal.get(animal) + ", age: " + ageAnimal.get(animal));
            animal.getClass().getDeclaredMethod("makeSound").invoke(animal);

        }
    }
}


