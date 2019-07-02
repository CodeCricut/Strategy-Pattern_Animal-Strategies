package model.Animals;

import model.Animal;
import model.GatherFoodStrategies.*;
import model.MovementStrategies.*;
import model.ReproductionStrategies.*;

public class KomodoDragon extends Animal {

    public KomodoDragon() {
        super("Komodo Dragon", new Walk(), new Hunt(), new Asexual());
    }
}
