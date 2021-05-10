import model.racingCar.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    @DisplayName("0자 입력시 Exception 테스트")
    void validationTestNoInputName() {
        assertThatThrownBy(() ->
                new Name("")
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 한 글자 이상 입력해주세요.");
    }

    @Test
    @DisplayName("5자 초과 입력시 Exception 테스트")
    void validationTestOverInputName() {
        assertThatThrownBy(() ->
                new Name("다섯글자이상초과테스트")
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 5자를 초과할 수 없습니다.");
    }
}
