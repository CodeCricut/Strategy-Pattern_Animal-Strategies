package model.Animals;

import model.Animal;
import model.GatherFoodStrategies.Hunt;
import model.MovementStrategies.Fly;
import model.MovementStrategies.Swim;
import model.ReproductionStrategies.Sexual;

public class Tuna extends Animal {

    public Tuna() {
        super("Tuna Fish", new Swim(), new Hunt(), new Sexual());
    }
}
