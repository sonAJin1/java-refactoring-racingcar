import model.round.GameRound;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameRoundTest {

    @Test
    @DisplayName("GameRound 생성 및 값 set 테스트")
    void setGameRoundValue() {
        GameRound gameRound = new GameRound(3);
        assertThat(gameRound.totalCount()).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("GameRound 횟수")
    @ValueSource(ints = {3, 4, 5})
    void startGame(int range) {
        GameRound gameRound = new GameRound(range);

        for (int i = 0; i < range; i++) {
            assertThat(gameRound.isPlaying()).isEqualTo(true);
        }
        assertThat(gameRound.isPlaying()).isEqualTo(false);
    }
}
