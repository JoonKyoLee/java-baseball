package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String START_BASEBALL_GAME_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_USER_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String RESTART_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void printStartMessage(){
        System.out.println(START_BASEBALL_GAME_MESSAGE);
    }

    public String inputUserNumber(){
        System.out.print(INPUT_USER_NUMBER_MESSAGE);
        return Console.readLine();
    }
}
