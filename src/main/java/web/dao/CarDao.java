package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> findAll(int count);

    List<Car> getAllCars();

}
