package controller;

import model.racingCar.CarFactory;
import model.round.GameRound;
import model.stratege.MoveStrategy;
import ui.InputView;
import ui.ResultView;

public class RacingGame {
    private CarFactory carFactory;
    private GameRound gameRound;

    public RacingGame() {
        carFactory = new CarFactory(InputView.inputCarCount());
        gameRound = new GameRound(InputView.inputRacingRound());
    }

    public void start(MoveStrategy moveStrategy) {
        if (gameRound.isPlaying()) {
            carFactory.moveCars(moveStrategy);
            ResultView.showResult(carFactory.getMoveResult());
            start(moveStrategy);
        }
    }
}
