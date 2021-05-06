package controller;

import model.stratege.RandomMoveStrategy;

public class Main {

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        game.start(new RandomMoveStrategy());
    }

}
