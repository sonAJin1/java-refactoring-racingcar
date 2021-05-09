package model.racingCar;

import java.util.ArrayList;
import java.util.List;

public class Names {
    private static final String REGEX = ",";
    private List<Name> names = new ArrayList<>();

    public Names(String names) {
        splitName(names);
    }

    private void splitName(String inputName) {
        String[] split = inputName.split(REGEX);
        for (String name : split) {
            names.add(new Name(name));
        }
    }
}
