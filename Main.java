package HW9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car(UUID.randomUUID(), GenerateCar.randomBrand(), 2017, 120000, 25000),
                new Car(UUID.randomUUID(), GenerateCar.randomBrand(), 2015, 170000, 12800),
                new Car(UUID.randomUUID(), GenerateCar.randomBrand(), 2015,320000, 8500),
                new Car(UUID.randomUUID(), GenerateCar.randomBrand(), 2022, 5000, 31000),
                new Car(UUID.randomUUID(), GenerateCar.randomBrand(), 2003, 339000, 4200)
        );

        Car randomCar = new Car(UUID.randomUUID(), GenerateCar.randomBrand(), GenerateCar.randomYear(), GenerateCar.randomMileage(),
                GenerateCar.randomPrice());
        
        System.out.println("=======================================");
        System.out.println("Автомобіль із рандомним значенням полів: " + randomCar);
        System.out.println("=======================================");
List<Car> onlyTeslaAudi = cars.stream()
                .filter(car -> car.getBrand().equals(Car.Brand.TESLA) || car.getBrand().equals(Car.Brand.AUDI))
                .collect(Collectors.toList());
        System.out.println("Тільки автомобілі Тесла і Ауді: " + onlyTeslaAudi);
        System.out.println("===============================");

        List<Car> youngerThan2018 = cars.stream()
                .filter(car -> car.getYear() > 2018)
                .collect(Collectors.toList());
        System.out.println("Тільки автомобілі молодші 2018 року: " + youngerThan2018);
        System.out.println("====================================");

        List<Car> mileageLessThan40000 = cars.stream()
                .filter(car -> car.getMileage() < 40000)
                .collect(Collectors.toList());
        System.out.println("Тільки автомобілі з пробігом менше 40000: " + mileageLessThan40000);
        System.out.println("=========================================");

        List<Car> reversePriceCar = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println("Автомобілі відсортовані за ціною в порядку спадання: " + reversePriceCar);
        System.out.println("====================================================");

        Map<UUID, Car> mostCheapestCarMap = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .limit(3)
                .collect(Collectors.toMap(Car::getId, Function.identity()));
        System.out.println("Три найдешевші автомобілі: " + mostCheapestCarMap);
    }
}






