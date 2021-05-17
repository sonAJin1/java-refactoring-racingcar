package model.racingCar;

import model.stratege.MoveStrategy;

import java.util.Objects;

public class Car {
    private int moveRange = 0;
    private final Name name;

    public Car(String name) {
        this.name = new Name(name);
    }

    public Car(String name, int moveRange) {
        this.name = new Name(name);
        this.moveRange = moveRange;
    }

    public int move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            ++moveRange;
        }
        return moveRange;
    }

    public int getMoveRange() {
        return moveRange;
    }

    public String getName() {
        return name.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return moveRange == car.moveRange && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveRange, name);
    }
}
