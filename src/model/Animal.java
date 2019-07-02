package model;

public abstract class Animal {
    private String name;
    private MovementStrategy movementStrategy;
    private GatherFoodStrategy gatherFoodStrategy;
    private ReproductionStrategy reproductionStrategy;

    //Constructors
    public Animal(String name,
                  MovementStrategy movementStrategy,
                  GatherFoodStrategy gatherFoodStrategy,
                  ReproductionStrategy reproductionStrategy){
        this.name = name;
        this.movementStrategy = movementStrategy;
        this.gatherFoodStrategy = gatherFoodStrategy;
        this.reproductionStrategy = reproductionStrategy;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    //Public methods

    public void move(){
        movementStrategy.move();
    }

    public void gatherFood(){
        gatherFoodStrategy.gatherFood();
    }

    public void reproduce(){
        reproductionStrategy.reproduce();
    }
}
