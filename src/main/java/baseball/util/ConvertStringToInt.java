package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToInt {

    public List<Integer> convert(String number){
        List<Integer> convertedNumber = new ArrayList<>();

        for(String s : number.split((""))){
            convertedNumber.add(Integer.parseInt(s));
        }

        return convertedNumber;
    }
}
