package com.example.demoSpringApp.rest;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CarController {
    Map<String, Car> cars = new HashMap<>();

    @PostMapping("car")
    @ResponseStatus(HttpStatus.CREATED)
    public Car createCar(@RequestBody Car car) {
        cars.put(car.getBrand(), car);
        return car;
    }

    @GetMapping("car")
    @ResponseStatus(HttpStatus.OK)
    public Car getCar(@RequestParam String brand) {
        return cars.get(brand);
    }

    @GetMapping("cars")
    public List<Car> getAllCars() {
        return cars.values().stream().toList();
    }

    @PutMapping("car")
    public Car setCar(@RequestBody Car car) {
        Car oldCar = cars.get(car.getBrand());
        cars.put(car.getBrand(), car);
        return car;
    }

    @PutMapping("setPopularity")
    public Car setPopularity(@RequestParam String brand, @RequestParam Popularity popularity) {
        Car car = cars.get(brand);
        car.setPopularity(popularity);
        cars.put(brand, car);
        return car;
    }

    @PutMapping("setModel")
    public Car setModel(@RequestParam String brand, @RequestParam String model) {
        Car car = cars.get(brand);
        car.setModel(model);
        cars.put(brand, car);
        return car;
    }

    @PutMapping("setType")
    public Car setType(@RequestParam String model, @RequestParam CarType type) {
        Car car = cars.get(model);
        car.setType(type);
        cars.put(model, car);
        return car;
    }

    @GetMapping("carType")
    public List<Car> getCarsByType(@RequestParam CarType type) {
        return cars.values().stream().filter(car -> car.getType()
                .equals(type))
                .toList();
    }

    @DeleteMapping("car")
    public Car deleteCarsByBrand(@RequestParam String brand) {
        Car car = cars.get(brand);
        cars.remove(brand);
        return car;
    }

    @DeleteMapping("car")
    public Car deleteCarsByModel(@RequestParam String model) {
        Car car = cars.get(model);
        cars.remove(model);
        return car;
    }

}
