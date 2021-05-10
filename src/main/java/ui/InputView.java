package ui;

import java.util.Scanner;

public class InputView {
    private final static String INPUT_CAR_COUNT = "자동차 대수는 몇 대 인가요?";
    private final static String INPUT_CAR_ROUND = "시도할 회수는 몇 회 인가요?";
    private final static String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";

    private final static Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static int inputCarCount() {
        System.out.println(INPUT_CAR_COUNT);
        return SCANNER.nextInt();
    }

    public static int inputRacingRound() {
        System.out.println(INPUT_CAR_ROUND);
        return SCANNER.nextInt();
    }

    public static String inputCarsName() {
        System.out.println(INPUT_CAR_NAME);
        return SCANNER.next();
    }
}
