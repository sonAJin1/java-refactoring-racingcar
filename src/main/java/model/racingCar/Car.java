package model.racingCar;

import model.stratege.MoveStrategy;

public class Car {
    /*
    움직인 거리에 대한 정보
     */
    private int moveRange = 0;

    public int move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            ++moveRange;
        }
        return moveRange;
    }
}
