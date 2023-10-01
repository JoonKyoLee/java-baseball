package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.util.ConvertStringToInt;
import baseball.util.NumberValidator;
import baseball.util.BallComparator;

import java.util.List;
import java.util.ArrayList;

public class Game {
    private static final int FINISH_STRIKE_NUMBER = 3;
    private static final String RESTART_MESSAGE = "1";
    private final Computer computer;
    private final User userInput;
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final ConvertStringToInt convertStringToInt = new ConvertStringToInt();
    private final NumberValidator numberValidator = new NumberValidator();
    private final BallComparator ballComparator = new BallComparator();

    private List<Integer> userInputNumber;
    private List<Integer> computerNumber;

    public Game(){
        computer = new Computer();
        userInput = new User();

        userInputNumber = new ArrayList<>();
        computerNumber = new ArrayList<>();

        outputView.printStartMessage();
    }

    public void playGame(){
        computer.setComputerNumber();
        computerNumber = computer.getComputerNumber();

        do{
            userInputNumber = convertStringToInt.convert(inputView.inputUserNumber());

            numberValidator.userNumberValidator(userInputNumber);

            ballComparator.setBallStrike(computerNumber, userInputNumber);

            outputView.printBallStrikeMessage(ballComparator.getBallStrike());

        } while(!finishGame());

        outputView.printFinishMessage();
    }

    public boolean finishGame(){
        return (ballComparator.getBallStrike().get(1)) == FINISH_STRIKE_NUMBER;
    }

    public boolean restart(){
        String restartMessage = inputView.restartGameMessage();
        if(!numberValidator.restartNumberValidator(restartMessage)){
            throw new IllegalArgumentException();
        }

        return restartMessage.equals(RESTART_MESSAGE);
    }
}
