package ui;

import model.racingCar.CarDTO;

import java.util.List;

public class ResultView {
    private static final String RESULT_GAME = "실행 결과";
    private static final String CAR_MOVE_RANGE = "-";
    private static final String SEPARATOR = ": ";

    private ResultView() {
    }

    public static void showResult(List<CarDTO> carDTOS) {
        System.out.println(RESULT_GAME);
        for (CarDTO carData : carDTOS) {
            System.out.print(carData.getName() + SEPARATOR);
            System.out.println(showMoveRange(carData.getMoveRange()));
        }
        System.out.println();
    }

    private static String showMoveRange(int range) {
        StringBuilder carRange = new StringBuilder();

        for (int i = 0; i < range; i++) {
            carRange.append(CAR_MOVE_RANGE);
        }
        return carRange.toString();
    }
}
