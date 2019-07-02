package model.ReproductionStrategies;

import model.ReproductionStrategy;

public class Sexual implements ReproductionStrategy {
    @Override
    public void reproduce() {
        System.out.println("\tAnimal is reproducing sexually.");
    }
}
