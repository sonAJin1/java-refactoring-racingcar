package model.stratege;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy{
    private static final int RANDOM_RANGE = 9;
    private static final int MOVABLE_RANDOM_RANGE = 4;

    @Override
    public boolean isMove() {
        return isMoveToRandom(getRandomValue());
    }

    private int getRandomValue() {
        Random random = new Random();
        return random.nextInt(RANDOM_RANGE);
    }

    private boolean isMoveToRandom(int randomValue) {
        return randomValue >= MOVABLE_RANDOM_RANGE;
    }
}
