import model.racingCar.Car;
import model.racingCar.Winner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WinnerTest {

    @Test
    @DisplayName("우승자 list 출력 테스트")
    void getWinner() {
        Car car1 = new Car("test1",3);
        Car car2 = new Car("test2",1);
        Car car3 = new Car("test3",10);
        Car car4 = new Car("test4",10);
        Winner winner = new Winner(Arrays.asList(car1, car2, car3, car4));
        assertThat(winner.getWinners().contains(car1)).isEqualTo(false);
        assertThat(winner.getWinners().contains(car2)).isEqualTo(false);
        assertThat(winner.getWinners().contains(car3)).isEqualTo(true);
        assertThat(winner.getWinners().contains(car4)).isEqualTo(true);
    }
}
