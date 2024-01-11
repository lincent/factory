package org.example.abstractfactory.problem.cakes;

import java.util.ArrayList;
import java.util.List;
import org.example.Cake;

public class LemonDrizzle implements Cake {
  @Override
  public void getIngredients() {
    List<String> ingredients = new ArrayList<>();
    ingredients.add("Flour");
    ingredients.add("Butter");
    ingredients.add("Sugar");
    ingredients.add("Eggs");
    ingredients.add("Fruit");

    String stringifiedIngredients = String.join(", ", ingredients);

    System.out.printf("Lemon Drizzle ingredients acquired: %s", stringifiedIngredients);
  }

  @Override
  public void mixIngredients() {
    System.out.println("Lemon Drizzle Ingredients Mixed");
  }

  @Override
  public void putIngredientsInTin() {
    System.out.println("Lemon Drizzle Ingredients Scooped into Square tin");
  }

  @Override
  public void bake() {
    System.out.println("Lemon Drizzle Brownie for 10 minutes");
  }
}
