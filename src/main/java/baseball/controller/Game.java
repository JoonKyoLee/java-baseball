package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.view.InputView;

import java.util.List;
import java.util.ArrayList;

public class Game {
    private final Computer computer;
    private final User userInput;
    private final InputView inputView = new InputView();

    private List<Integer> userInputNumber;
    private List<Integer> computerNumber;

    public Game(){
        computer = new Computer();
        computer.setComputerNumber();
        userInput = new User();

        userInputNumber = new ArrayList<>();
        computerNumber = new ArrayList<>();

        inputView.printStartMessage();
    }


}
