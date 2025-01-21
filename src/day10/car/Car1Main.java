package day10.car;

import day10.car.dao.Car1DAO;
import day10.car.dto.Car1DTO;



public class Car1Main {
    public static void main(String[] args) {
        Car1DTO car = new Car1DTO("캐스퍼", "방민영");
        Car1DAO carDao = new Car1DAO(car);
        carDao.speed();

    }
}
