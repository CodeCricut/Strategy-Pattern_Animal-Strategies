package model.GatherFoodStrategies;

import model.GatherFoodStrategy;

public class Forage implements GatherFoodStrategy {
    @Override
    public void gatherFood() {
        System.out.println("\tAnimal is foraging for food.");
    }
}
