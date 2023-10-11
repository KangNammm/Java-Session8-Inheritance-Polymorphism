package vehicle;


public class Car extends Vehicle {
    public Car(){
    }
    public Car(String brand, String color){
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Thương hiệu='" + this.getBrand() + '\'' +
                ", Màu sắc='" + this.getColor() + '\'' +
                '}';
    }
}
