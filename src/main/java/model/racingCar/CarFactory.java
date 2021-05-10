package model.racingCar;

import model.stratege.MoveStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory {
    private static final String REGEX = ",";
    private List<Car> cars = new ArrayList<>();

    public CarFactory(String carNames) {
        Arrays.stream(splitName(carNames)).forEach(name -> cars.add(new Car(name)));
    }

    private static String[] splitName(String inputName) {
        return inputName.split(REGEX);
    }

    public int getCarCount() {
        return cars.size();
    }

    public void moveCars(MoveStrategy moveStrategy) {
        for (Car car : cars) {
            car.move(moveStrategy);
        }
    }

    public List<CarDTO> getMoveResult() {
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(new CarDTO(car.getMoveRange(), car.getName()));
        }
        return carDTOS;
    }
}
