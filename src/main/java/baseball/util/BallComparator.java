package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class BallComparator {
    private static final int LENGTH = 3;
    private int strike;
    private int ball;
    private List<Integer> result;

    public List<Integer> calculateBallStrike(List<Integer> computer, List<Integer> user){
        result = new ArrayList<>();
        ball = 0;
        strike = 0;

        for(int i = 0; i < LENGTH; i++){
            countBall(user, computer.get(i), i);
            countStrike(computer.get(i), user.get(i));
        }

        result.add(ball);
        result.add(strike);
    }

    public void countBall(List<Integer> userNumber, int computerDigit, int index){
        if(userNumber.get(index) != computerDigit && userNumber.contains(computerDigit)){
            ball++;
        }
    }

    public void countStrike(int computerNumber, int userNumber){
        if(computerNumber == userNumber){
            strike++;
        }
    }
}
