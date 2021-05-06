import model.racingCar.CarFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarFactoryTest {

    @Test
    @DisplayName("입력한 만큼 자동차가 만들어지는지 테스트")
    void makeCar() {
        CarFactory carFactory = new CarFactory(3);
        assertThat(carFactory.getCarCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 주행에 대한 테스트")
    void move() {

    }
}
