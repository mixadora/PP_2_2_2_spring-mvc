package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> listCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes-Benz", "maybach", "Black"));
        cars.add(new Car("Porsche", "911", "White"));
        cars.add(new Car("lamborghini", "Aventador", "Red"));
        return cars;
    }
}