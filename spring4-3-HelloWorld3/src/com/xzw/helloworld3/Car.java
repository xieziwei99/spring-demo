package com.xzw.helloworld3;

/**
 * @author xieziwei99
 * 2020-03-30
 */
public class Car {

    private String brand;
    private double price;
    private double tyrePerimeter;

    public Car() {
        System.out.println("Car's constructor...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Car's set brand...");
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTyrePerimeter() {
        return tyrePerimeter;
    }

    public void setTyrePerimeter(double tyrePerimeter) {
        this.tyrePerimeter = tyrePerimeter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyrePerimeter=" + tyrePerimeter +
                '}';
    }

    public void init() {
        System.out.println("Car's init method");
    }

    public void destroy() {
        System.out.println("Car's destroy method");
    }
}
