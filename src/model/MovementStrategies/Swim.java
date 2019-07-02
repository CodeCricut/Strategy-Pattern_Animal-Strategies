package model.MovementStrategies;

import model.MovementStrategy;

public class Swim implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("\tAnimal is swimming.");
    }
}
