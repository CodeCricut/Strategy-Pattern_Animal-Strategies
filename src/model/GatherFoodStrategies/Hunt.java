package model.GatherFoodStrategies;

import model.GatherFoodStrategy;

public class Hunt implements GatherFoodStrategy {
    @Override
    public void gatherFood() {
        System.out.println("\tAnimal is hunting for food.");
    }
}
