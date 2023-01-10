package web.services;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class ServiceCars {

    List<Car> listCars;


    Car car1 = new Car("gaz", "black", 1);
    Car car2 = new Car("az2", "black", 2);
    Car car3 = new Car("vaz3", "black", 3);
    Car car4 = new Car("raz4", "black", 4);
    Car car5 = new Car("naz5", "black", 5);


    {
        listCars = new ArrayList<>();
        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);

    }
    public List<Car> show(int id) {
        if ((id > 0) && (id < 5)) return listCars.subList(0, id);
        else return listCars;
    }



}
