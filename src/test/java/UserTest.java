import model.racingCar.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserTest {
    @Test
    @DisplayName("유저 명수 테스트")
    void makeNewNameCount() throws IllegalAccessException {
        Users users = new Users("test1,test2");
        assertThat(users.getUserCount()).isEqualTo(2);
    }
}
