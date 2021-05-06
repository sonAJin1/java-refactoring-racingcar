package model.racingCar;

import model.stratege.MoveStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CarFactory {
    /*
   각 car 생성 및 관리 (주행 거리)
    */
    private List<Car> cars = new ArrayList<>();

    public CarFactory(int carCount, MoveStrategy moveStrategy) {
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car(moveStrategy));
        }
    }

    public int getCarCount() {
        return cars.size();
    }
}
