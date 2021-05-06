import model.racingCar.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    void setCar() {
        car = new Car();
    }

    @Test
    @DisplayName("자동차 전진 테스트")
    void moveTest() {
        assertThat(car.move(() -> true)).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 정지 테스트")
    void moveTest2() {
        assertThat(car.move(() -> false)).isEqualTo(0);
    }
}
