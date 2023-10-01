package baseball.util;

import java.util.List;

public class NumberValidator {
    private static final int LENGTH = 3;
    private static final int USER_NUMBER_MIN_VALUE = 1;
    private static final int USER_NUMBER_MAX_VALUE = 9;

    private static final String RESTART_NUMBER = "1";
    private static final String EXIT_GAME_NUMBER = "2";
    private static final String NOT_THREE_MESSAGE = "3개의 숫자를 입력해주세요.";
    private static final String NOT_DIFFERENT_MESSAGE = "서로 다른 숫자를 입력해주세요.";
    private static final String NOT_IN_RANGE_MESSAGE = "1 ~ 9 사이의 숫자를 입력해주세요.";


    public void userNumberValidator(List<Integer> userNumber){
        checkLength(userNumber);
        checkDifferentNumber(userNumber);
        checkNumberRange(userNumber);
    }

    public void checkLength(List<Integer> userNumber){
        if(userNumber.size() != LENGTH){
            throw new IllegalArgumentException(NOT_THREE_MESSAGE);
        }
    }

    public void checkDifferentNumber(List<Integer> userNumber){
        if(userNumber.stream()
                .distinct()
                .count() != LENGTH){
            throw new IllegalArgumentException(NOT_DIFFERENT_MESSAGE);
        }
    }

    public void checkNumberRange(List<Integer> userNumber){
        if(userNumber.stream()
                .filter(number -> USER_NUMBER_MIN_VALUE <= number && number <= USER_NUMBER_MAX_VALUE)
                .count() != LENGTH){
            throw new IllegalArgumentException(NOT_IN_RANGE_MESSAGE);
        }
    }

    public boolean restartNumberValidator(String number){
        return number.equals(RESTART_NUMBER) || number.equals(EXIT_GAME_NUMBER);
    }
}
