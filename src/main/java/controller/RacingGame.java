package controller;

import model.racingCar.CarFactory;
import model.stratege.MoveStrategy;
import ui.InputView;

public class RacingGame {
    private CarFactory carFactory;

    public RacingGame(MoveStrategy moveStrategy) {
        int gameRound = InputView.inputRacingRound();
        carFactory = new CarFactory(InputView.inputCarCount(), moveStrategy);
    }
}
