package model.MovementStrategies;

import model.MovementStrategy;

public class Walk implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("\tAnimal is walking.");
    }
}
