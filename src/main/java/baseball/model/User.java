package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> userNumber;

    public User(){
        userNumber = new ArrayList<>();
    }

    public List<Integer> getUserNumber(){
        return userNumber;
    }

    public void setUserNumber(List<Integer> userNumber){
        this.userNumber = userNumber;
    }
}