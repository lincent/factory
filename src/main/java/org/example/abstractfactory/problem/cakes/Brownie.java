package org.example.abstractfactory.problem.cakes;

import java.util.ArrayList;
import java.util.List;
import org.example.Cake;

public class Brownie implements Cake {

  @Override
  public void getIngredients() {
    List<String> ingredients = new ArrayList<>();
    ingredients.add("Flour");
    ingredients.add("Butter");
    ingredients.add("Sugar");
    ingredients.add("Eggs");
    ingredients.add("Chocolate");

    String stringifiedIngredients = String.join(", ", ingredients);

    System.out.printf("Brownie ingredients acquired: %s", stringifiedIngredients);
  }

  @Override
  public void mixIngredients() {
    System.out.println("Brownie Ingredients Mixed");
  }

  @Override
  public void putIngredientsInTin() {
    System.out.println("Brownie Ingredients Scooped into Square tin");
  }

  @Override
  public void bake() {
    System.out.println("Baking Brownie for 10 minutes");
  }
}
