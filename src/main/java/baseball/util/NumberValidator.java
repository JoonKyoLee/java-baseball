package baseball.util;

import baseball.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class NumberValidator {
    private static final int LENGTH = 3;
    private static final int USER_NUMBER_MIN_VALUE = 1;
    private static final int USER_NUMBER_MAX_VALUE = 9;

    public boolean userNumberValidator(List<Integer> userNumber){
        return checkLength(userNumber)
                && checkDifferentNumber(userNumber)
                && checkNumberRange(userNumber);
    }

    public boolean checkLength(List<Integer> userNumber){
        return userNumber.size() == LENGTH;
    }

    public boolean checkDifferentNumber(List<Integer> userNumber){
        return userNumber.stream()
                .distinct()
                .count() == LENGTH;
    }

    public boolean checkNumberRange(List<Integer> userNumber){
        return userNumber.stream()
                .filter(number -> USER_NUMBER_MIN_VALUE <= number && number <= USER_NUMBER_MAX_VALUE)
                .count() == LENGTH;
    }
}
