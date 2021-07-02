package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private int maxPosition = 0;
    private List<String> carNames = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<Car> winners = new ArrayList<>();
    private int tryNo = 0;

    public RacingGame(List<String> carNames, int tryNo) {
        this.carNames = carNames;
        this.tryNo = tryNo;
        for (String carname : carNames) {
            this.cars.add(new Car(carname));
        }
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public List<Car> getWinners() {
        setWinners();
        return this.winners;
    }

    private void setWinners() {
        for (Car car : this.cars) {
            updateWinner(car, winners);
        }
    }

    private void updateWinner(Car car, List<Car> winners) {
        if (car.getPosition() == maxPosition) {
            this.winners.add(car);
        }
        if (car.getPosition() > maxPosition) {
            this.winners.clear();
            this.winners.add(car);
            maxPosition = car.getPosition();
        }
    }

    public void racebyMovingStrategy(MovingStrategy strategy) {
        for (Car car : this.cars){
            car.moveByStrategy(strategy);
        }
    }

    public boolean isRunning() {
        tryNo--;
        return tryNo>=0;
    }
}