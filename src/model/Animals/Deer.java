package model.Animals;

import model.Animal;
import model.GatherFoodStrategies.*;
import model.MovementStrategies.*;
import model.ReproductionStrategies.*;

public class Deer extends Animal {

    public Deer() {
        super("Deer", new Walk(), new Forage(), new Sexual());
    }
}
