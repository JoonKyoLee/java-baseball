package baseball.view;

public class OutputView {
    private static final String START_BASEBALL_GAME_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String FINISH_BASEBALL_GAME_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String ASK_RESTART_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    public void printStartMessage(){
        System.out.println(START_BASEBALL_GAME_MESSAGE);
    }

    public void printFinishMessage(){
        System.out.println(FINISH_BASEBALL_GAME_MESSAGE);
        System.out.println(ASK_RESTART_GAME_MESSAGE);
    }
}
