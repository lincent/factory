package org.example.abstractfactory.solution.cakes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.example.Cake;
import org.example.abstractfactory.solution.ingredientstores.ingredients.Ingredient;
import org.example.abstractfactory.solution.ingredientstores.IngredientFactory;

public class Brownie implements Cake {

  private final IngredientFactory ingredientFactory;

  public Brownie(IngredientFactory ingredientFactory)
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
    ingredients.add(ingredientFactory.getChocolate());

    List<String> names = ingredients
        .stream()
        .map(Ingredient::getName)
        .collect(Collectors.toList());

    String stringifiedIngredients = String.join(", ", names);

    System.out.printf("Brownie ingredients acquired: %s%n", stringifiedIngredients);
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
