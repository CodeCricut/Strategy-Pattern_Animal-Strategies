package model.Animals;

import model.Animal;
import model.GatherFoodStrategies.*;
import model.MovementStrategies.*;
import model.ReproductionStrategies.*;

public class Eagle extends Animal {

    public Eagle() {
        super("Eagle", new Fly(), new Hunt(), new Sexual());
    }
}
