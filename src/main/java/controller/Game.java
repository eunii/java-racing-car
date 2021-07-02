package controller;

import domain.Car;
import domain.MovingStrategy;
import domain.RacingGame;
import domain.RandomMovingStrategy;
import utils.CarNameParser;
import utils.MoveCountParser;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {

    static OutputView outputView = new OutputView();
    static InputView inputView = new InputView();
    static CarNameParser carNameParser = new CarNameParser();
    static MoveCountParser moveCountParser = new MoveCountParser();
    static MovingStrategy strategy = new RandomMovingStrategy();

    public static void main(String[] args) {
        start();
    }

    public static void start() {

//        List<String> carNames = outputView.askCarNameAndGetCarNames(carNameParser, inputView);
//        int repeatCount = outputView.askRepeatCountandGetCounts(moveCountParser,inputView);
//        outputView.printRaceStart();
//
//        List<Car> cars = new ArrayList<>();
//        for (String carname : carNames) {
//            cars.add(new Car(carname));
//        }
//
//        RacingGame racingGame = new RacingGame();
//        for (int i = 0; i < repeatCount; i++) {
//            cars = racingGame.runOnce(cars,strategy);
//            outputView.printOneRoundResult(cars);
//        }
//
//        List<Car> winners = racingGame.getWinners();
//        outputView.printWinners(winners);
    }

}
