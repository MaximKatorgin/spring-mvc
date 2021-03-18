package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> carList = Arrays.asList(new Car("Tesla", 3, 180),
            new Car("Ford", 1, 150),
            new Car("Dodge", 2, 230),
            new Car("Lamborghini", 3, 250),
            new Car("Reno", 6, 130));

    public List<Car> getCars(int amount) {
        return carList.stream().limit(amount).collect(Collectors.toList());
    }
}
