package model.MovementStrategies;

import model.MovementStrategy;

public class Fly implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("\tAnimal is flying.");
    }
}
