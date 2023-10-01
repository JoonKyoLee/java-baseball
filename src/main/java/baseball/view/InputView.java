package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_USER_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String RESTART_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public String inputUserNumber(){
        System.out.print(INPUT_USER_NUMBER_MESSAGE);
        return Console.readLine();
    }

    public String restartGameMessage(){
        System.out.println(RESTART_GAME_MESSAGE);
        return Console.readLine();
    }
}
