package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> getListCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes-Benz", "maybach", "Black"));
        cars.add(new Car("Porsche", "911", "White"));
        cars.add(new Car("lamborghini", "Aventador", "Red"));
        cars.add(new Car("Toyota", "Supra", "Red"));
        cars.add(new Car("Kia", "K5", "blue"));
        return cars;
    }

    @Override
    public List<Car> countCars(int count) {
        List<Car> carList = getListCar();
        List<Car> listOfCars = carList.stream().limit(count).collect(Collectors.toList());
        return listOfCars;
    }
}