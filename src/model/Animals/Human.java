package model.Animals;

import model.Animal;
import model.GatherFoodStrategies.*;
import model.MovementStrategies.*;
import model.ReproductionStrategies.*;

public class Human extends Animal {

    public Human() {
        super("Human", new Walk(), new Hunt(), new Sexual());
    }
}
