package animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Pig");
        Dog dog1 = new Dog("Chihuahua", "yellow");
        Dog dog2 = new Dog("Pug", "white");
        Cat cat1 = new Cat("Dora");
        System.out.println("animal1 tước khi set là : " + animal1.getName());
        animal1.setName("Bird");
        System.out.println("animal1 sau khi set là : " + animal1.getName());
        dog1.setName("Corgi");
        System.out.println("Tên : " + dog1.getName());
        System.out.println("Tiếng kêu : " + dog1.makeSound());
        System.out.println("Tên : " + dog2.getName());
        System.out.println("Tiếng kêu : " + dog2.makeSound());
        System.out.println("Tên : " + cat1.getName());
        System.out.println("Tiếng kêu : " + cat1.makeSound());
    }
}
