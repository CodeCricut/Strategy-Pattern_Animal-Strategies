package model.ReproductionStrategies;

import model.ReproductionStrategy;

public class Asexual implements ReproductionStrategy {
    @Override
    public void reproduce() {
        System.out.println("\tAnimal is reproducing asexually.");
    }
}
