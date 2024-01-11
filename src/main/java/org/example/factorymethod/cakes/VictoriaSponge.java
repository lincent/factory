package org.example.factorymethod.cakes;

import org.example.Cake;

public class VictoriaSponge implements Cake {
  public void bake()
  {
    System.out.println("Baking Victoria Sponge for 15 minutes");
  }

  public void getIngredients()
  {
    System.out.println("Victoria Sponge Ingredients Acquired");
  }

  public void mixIngredients()
  {
    System.out.println("Victoria Sponge Ingredients Mixed");
  }

  public void putIngredientsInTin()
  {
    System.out.println("Victoria Sponge put into two circle trays");
  }
}
