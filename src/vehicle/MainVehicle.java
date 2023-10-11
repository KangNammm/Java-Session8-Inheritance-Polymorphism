package vehicle;

public class MainVehicle {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "black");
        Car car2 = new Car("Ford", "white");
        System.out.println("Ô tô 1 là : " + car1.getBrand());
        car1.setColor("purple");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        Motocycle motor1 = new Motocycle("Honda", "red-white");
        Motocycle motor2 = new Motocycle("Suzuki", "blue");
        System.out.println(motor1.toString());
        System.out.println(motor2.toString());
    }
}
