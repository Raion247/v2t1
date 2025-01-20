package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car() {
        brand = "Audi";
        model = "A8";
        speed = 0;
    }

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate(int accelerated) {
        speed = speed + accelerated;
        this.speed = speed;
    }

    public void decelerate(int decelerated) {
        if (speed - decelerated < 0) {
            int speed = 0;
            this.speed = speed;
            return;
        }
        speed -= decelerated;
        this.speed = speed;
    }

    public void printStatus() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
    }
}
