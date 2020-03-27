package com.xzw.helloworld;

/**
 * @author xieziwei99
 * 2020-03-27
 */
public class Car {

    private String brand;
    private String corp;
    private double price;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public Car() {
    }

    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int speed) {
        this.brand = brand;
        this.corp = corp;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
