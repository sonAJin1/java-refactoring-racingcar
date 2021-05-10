package model.racingCar;

import model.stratege.MoveStrategy;

public class Car {
    private int moveRange = 0;
    private final Name name;

    public Car(String name) {
        this.name = new Name(name);
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
}
