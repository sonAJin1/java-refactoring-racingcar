package model.racingCar;

public class CarDTO {
    private int moveRange = 0;
    private String name;

    public CarDTO(int moveRange, String name) {
        this.moveRange = moveRange;
        this.name = name;
    }

    public int getMoveRange() {
        return moveRange;
    }

    public String getName() {
        return name;
    }
}
