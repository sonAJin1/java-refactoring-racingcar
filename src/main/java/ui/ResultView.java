package ui;

import model.racingCar.CarDTO;

import java.util.List;

public class ResultView {
    public static final String CAR_MOVE_RANGE = "-";

    private ResultView() {
    }

    public static void showResult(List<CarDTO> carDTOS) {
        for (CarDTO carData : carDTOS) {
            System.out.println(showMoveRange(carData.getMoveRange()));
        }
    }

    private static String showMoveRange(int range) {
        StringBuilder carRange = new StringBuilder();
        for (int i = 0; i < range; i++) {
            carRange.append(CAR_MOVE_RANGE);
        }
        return carRange.toString();
    }
}
