package model.racingCar;

import java.util.*;

public class Winner {
    private final List<Car> winners = new ArrayList<>();

    public Winner(List<Car> cars) {
        compareWinner(cars);
    }

    private void compareWinner(List<Car> cars) {
        int maxMoveRange = setMaxMoveRange(cars);

        for (Car car : cars) {
            setWinner(maxMoveRange, car);
        }
    }

    private int setMaxMoveRange(List<Car> cars) {
        return cars.stream().max(Comparator.comparingInt(Car::getMoveRange)).get().getMoveRange();
    }

    private void setWinner(int maxMoveRange, Car car) {
        if (maxMoveRange <= car.getMoveRange()) {
            winners.add(car);
        }
    }

    public List<Car> getWinners() {
        return winners;
    }
}
