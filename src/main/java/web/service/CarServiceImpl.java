package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private static List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("Artem", 808, "Tayota Camri"));
        cars.add(new Car("Oleg", 124, "Aka"));
        cars.add(new Car("Kirill", 653, "Nisan"));
        cars.add(new Car("NO_NAME", 000, "******"));
        cars.add(new Car("Alena", 247, "Bicycle"));
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> resultCars = new ArrayList<>();
        for (int i = 0; i < count; i++){
            resultCars.add(cars.get(i));
        }
        return resultCars;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }


}
