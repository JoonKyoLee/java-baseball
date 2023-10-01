package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.ArrayList;

public class Computer {
    private static final int GAME_NUMBER_LENGTH = 3;
    private static final int GAME_RANDOM_MIN_NUM = 1;
    private static final int GAME_RANDOM_MAX_NUM = 9;
    private List<Integer> computerNumber = new ArrayList<>();

    public List<Integer> getComputerNumber(){
        return computerNumber;
    }

    public void setComputerNumber(){
        while(computerNumber.size() < GAME_NUMBER_LENGTH){
            int randomNumber = Randoms.pickNumberInRange(GAME_RANDOM_MIN_NUM, GAME_RANDOM_MAX_NUM);
            if(!computerNumber.contains(randomNumber)){
                computerNumber.add(randomNumber);
            }
        }
    }
}
