package HW9;

import java.util.UUID;
public class Car {

    private UUID id;
    private Brand brand;
    private int year;
    private int mileage;
    private int price;

    public enum Brand {
        TESLA, AUDI, BMW, TOYOTA, NISSAN
    }

    public Car(UUID id, Brand brand, int year, int mileage, int price) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}


