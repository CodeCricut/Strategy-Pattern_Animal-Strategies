package ui;

import model.Animal;
import model.Animals.*;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Animal> animals;

    public static void main(String[] args) {
        animals = new ArrayList<>();
        studyAnimals();
        printAnimalStrategies();
    }

    private static void studyAnimals() {
        System.out.println("Now studying animals...");
        animals.add(new Deer());
        animals.add(new Eagle());
        animals.add(new Human());
        animals.add(new KomodoDragon());
        animals.add(new Tiger());
        animals.add(new Tuna());
    }

    private static void printAnimalStrategies() {
        for (Animal animal: animals){
            System.out.println("\nNow studying the " + animal.getName());
            animal.move();
            animal.gatherFood();
            animal.reproduce();
        }
    }
}
