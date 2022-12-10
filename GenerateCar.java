package HW9;

import java.util.Random;

public class GenerateCar {

    public static Car.Brand randomBrand() {
        Car.Brand[] brand = Car.Brand.values();
        int randomIndex = new Random().nextInt(brand.length);
        return brand[randomIndex];
    }
    public static int randomYear() {
        return new Random().nextInt(2022);
    }
    public static int randomMileage() {
        return new Random().nextInt(339000);
    }
    public static int randomPrice() {
        return new Random().nextInt(32000);
    }
}

