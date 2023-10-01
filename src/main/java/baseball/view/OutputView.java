package baseball.view;

import baseball.util.BallComparator;

import java.util.List;

public class OutputView {
    private static final String START_BASEBALL_GAME_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String FINISH_BASEBALL_GAME_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String BALL_MESSAGE = "볼 ";
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String NOTHING_MESSAGE = "낫싱";

    private BallComparator ballComparator;


    public void printStartMessage(){
        System.out.println(START_BASEBALL_GAME_MESSAGE);
    }

    public void printFinishMessage(){
        System.out.println(FINISH_BASEBALL_GAME_MESSAGE);
    }

    public void printBallStrikeMessage(){
        List<Integer> baseballResult = ballComparator.getBallStrike();
        int ball = baseballResult.get(0);
        int strike = baseballResult.get(1);

        if(ball > 0){
            System.out.print(ball + BALL_MESSAGE);
        }

        if(strike > 0){
            System.out.print(strike + STRIKE_MESSAGE);
        }

        if(ball == 0 && strike == 0){
            System.out.print(NOTHING_MESSAGE);
        }

        System.out.println();
    }
}
