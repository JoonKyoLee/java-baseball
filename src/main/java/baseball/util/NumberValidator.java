package baseball.util;

import java.util.List;

public class NumberValidator {
    private static final int LENGTH = 3;
    private static final int USER_NUMBER_MIN_VALUE = 1;
    private static final int USER_NUMBER_MAX_VALUE = 9;

    private static final String RESTART_NUMBER = "1";
    private static final String EXIT_GAME_NUMBER = "2";

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

    public boolean restartNumberValidator(String number){
        return number.equals(RESTART_NUMBER) || number.equals(EXIT_GAME_NUMBER);
    }
}
