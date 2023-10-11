package vehicle;

public class Motocycle extends Vehicle {
    public Motocycle(){}

    public Motocycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Xe máy{" +
                "Thương hiệu='" + this.getBrand() + '\'' +
                ", Màu sắc='" + this.getColor() + '\'' +
                '}';
    }
}
