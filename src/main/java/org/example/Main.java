package org.example;

import org.example.abstractfactory.problem.JacksBakery;
import org.example.abstractfactory.problem.LukesBakery;
import org.example.abstractfactory.solution.ingredientstores.AnimalBasedIngredients;
import org.example.abstractfactory.solution.ingredientstores.IngredientFactory;
import org.example.abstractfactory.solution.ingredientstores.PlantBasedIngredients;
import org.example.factorymethod.problem.Bakery;
import org.example.factorymethod.solution.HelenesBakery;

public class Main {

  public static void main(String[] args) {
    abstractFactorySolution();
  }

  private static void factoryMethodProblem() {
    Bakery bakery = new Bakery();
    bakery.orderCake(CakeTypes.Muffins);
  }

  private static void factoryMethodMaybe() {
    org.example.factorymethod.maybe.Bakery bakery = new org.example.factorymethod.maybe.Bakery();
    bakery.orderCake(CakeTypes.Muffins);
  }

  private static void factoryMethodSolution() {
    org.example.factorymethod.solution.Bakery bakery = new HelenesBakery();
    bakery.orderCake(CakeTypes.Muffins);
  }

  private static void abstractFactoryProblem() {
    System.out.println("Lukes Bakery");
    org.example.abstractfactory.problem.Bakery lukesBakery = new LukesBakery();
    lukesBakery.orderCake(CakeTypes.Brownies);

    System.out.println("Jacks Bakery");
    org.example.abstractfactory.problem.Bakery jacksBakery = new JacksBakery();
    jacksBakery.orderCake(CakeTypes.Brownies);
  }

  private static void abstractFactorySolution() {
    System.out.println("Lukes Bakery");
    IngredientFactory animalBasedIngredients = new AnimalBasedIngredients();
    org.example.abstractfactory.solution.Bakery lukesBakery = new org.example.abstractfactory.solution.LukesBakery(animalBasedIngredients);
    lukesBakery.orderCake(CakeTypes.Brownies);

    System.out.println("Jacks Bakery");
    IngredientFactory plantBasedIngredients = new PlantBasedIngredients();
    org.example.abstractfactory.solution.Bakery jacksBakery = new org.example.abstractfactory.solution.JacksBakery(plantBasedIngredients);
    jacksBakery.orderCake(CakeTypes.Brownies);
  }
}