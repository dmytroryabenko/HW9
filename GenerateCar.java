package HW9;

import java.util.Random;

public class GenerateCar {

    public static Car.Brand randomBrand() {
        Car.Brand[] brand = Car.Brand.values();
        int randomIndex = new Random().nextInt(brand.length);
        return brand[randomIndex];
    }
    public static int randomYear() {
        int minValue = 2003;
        int maxValue = 2022;
        return new Random().nextInt(maxValue - minValue + 1) + minValue;
    }
    public static int randomMileage() {
        int minValue = 5000;
        int maxValue = 339000;
        return new Random().nextInt(maxValue - minValue + 1) + minValue;
    }
    public static int randomPrice() {
        int minValue = 4200;
        int maxValue = 31000;
        return new Random().nextInt(maxValue - minValue + 1) + minValue;
    }
}

