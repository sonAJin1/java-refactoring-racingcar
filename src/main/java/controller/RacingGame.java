package controller;

import model.racingCar.CarFactory;
import model.stratege.MoveStrategy;
import ui.InputView;
import ui.ResultView;

public class RacingGame {
    private CarFactory carFactory;
    private int gameRound = 0;

    public RacingGame() {
        gameRound = InputView.inputRacingRound();
        carFactory = new CarFactory(InputView.inputCarCount());
    }

    public void start(MoveStrategy moveStrategy) {
        for (int i = 0; i < gameRound; i++) {
            carFactory.moveCars(moveStrategy);
        }
       ResultView.showResult(carFactory.getMoveResult());
    }
}
