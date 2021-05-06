package model.racingCar;

public class CarDTO {
    private int moveRange = 0;

    public CarDTO(int moveRange) {
        this.moveRange = moveRange;
    }

    public int getMoveRange() {
        return moveRange;
    }
}
