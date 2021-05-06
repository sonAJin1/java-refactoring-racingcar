package ui;

import java.util.Scanner;
import java.util.Stack;

public class InputView {
    private final static String INPUT_CAR_COUNT = "자동차 대수는 몇 대 인가요?";
    private final static String INPUT_CAR_ROUND = "시도할 회수는 몇 회 인가요?";

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
}
