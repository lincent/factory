package org.example.factorymethod.cakes;

import org.example.Cake;

public class Brownie implements Cake {
  public void bake()
  {
    System.out.println("Baking Brownie for 10 minutes");
  }

  public void getIngredients()
  {
    System.out.println("Brownie Ingredients Acquired");
  }

  public void mixIngredients()
  {
    System.out.println("Brownie Ingredients Mixed");
  }

  public void putIngredientsInTin()
  {
    System.out.println("Brownie Ingredients Scooped into Square tin");
  }
}
