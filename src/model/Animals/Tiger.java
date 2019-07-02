package model.Animals;

import model.Animal;
import model.GatherFoodStrategies.Hunt;
import model.MovementStrategies.Walk;
import model.ReproductionStrategies.Sexual;

public class Tiger extends Animal {

    public Tiger() {
        super("Tiger", new Walk(), new Hunt(), new Sexual());
    }
}
