package model.round;

public class GameRound {
    /*
    게임 라운드가 얼마나 진행되었는지 관리
     */
    private int gameRound = 0;
    private int currentRound = 0;

    public GameRound(int gameRound) {
        this.gameRound = gameRound;
    }

    public int totalCount() {
        return gameRound;
    }

    public boolean isPlaying() { //
        if (currentRound < totalCount()) {
            currentRound ++;
            return true;
        }
       return false;
    }
}
