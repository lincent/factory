package org.example.abstractfactory.solution.cakes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.example.Cake;
import org.example.abstractfactory.solution.ingredientstores.ingredients.Ingredient;
import org.example.abstractfactory.solution.ingredientstores.IngredientFactory;

public class LemonDrizzle implements Cake {
  private final IngredientFactory ingredientFactory;

  public LemonDrizzle(IngredientFactory ingredientFactory)
  {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void getIngredients() {
    List<Ingredient> ingredients = new ArrayList<>();
    ingredients.add(ingredientFactory.getFlour());
    ingredients.add(ingredientFactory.getButter());
    ingredients.add(ingredientFactory.getSugar());
    ingredients.add(ingredientFactory.getEggs());
    ingredients.add(ingredientFactory.getFruits());

    List<String> names = ingredients
        .stream()
        .map(Ingredient::getName)
        .collect(Collectors.toList());

    String stringifiedIngredients = String.join(", ", names);

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
