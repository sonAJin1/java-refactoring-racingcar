package model.racingCar;

import java.util.Objects;

public class Name {
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;
    private static final String ERROR_MIN_NAME_LENGTH = "이름은 한 글자 이상 입력해주세요.";
    private static final String ERROR_MAX_NAME_LENGTH = "이름은 5자를 초과할 수 없습니다.";
    private final String name;

    public Name(String name) {
        checkNameValidate(name);
        this.name = name;
    }

    private static void checkNameValidate(String name) throws IllegalArgumentException {
        if (name.length() < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_MIN_NAME_LENGTH);
        }
        if (name.length() >= MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_MAX_NAME_LENGTH);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
