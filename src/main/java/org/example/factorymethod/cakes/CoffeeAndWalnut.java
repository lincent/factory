package org.example.factorymethod.cakes;

import org.example.Cake;

public class CoffeeAndWalnut implements Cake {
  public void bake()
  {
    System.out.println("Baking Coffee and Walnut cake for 20 minutes");
  }

  public void getIngredients()
  {
    System.out.println("Coffee and Walnut cake Ingredients Acquired");
  }

  public void mixIngredients()
  {
    System.out.println("Coffee and Walnut cake Ingredients Mixed");
  }

  public void putIngredientsInTin()
  {
    System.out.println("Coffee and Walnut cake Ingredients Scooped into circle tin");
  }
}
