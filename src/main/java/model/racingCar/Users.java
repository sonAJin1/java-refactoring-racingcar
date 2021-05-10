package model.racingCar;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private static final String REGEX = ",";
    private List<Name> users = new ArrayList<>();

    public Users(String names) throws IllegalAccessException {
        splitName(names);
    }

    private void splitName(String inputName) throws IllegalAccessException {
        String[] split = inputName.split(REGEX);
        for (String name : split) {
            users.add(new Name(name));
        }
    }

    public int getUserCount() {
        return users.size();
    }

}
