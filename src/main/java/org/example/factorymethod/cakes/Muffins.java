package org.example.factorymethod.cakes;

import org.example.Cake;

public class Muffins implements Cake {
  public void bake()
  {
    System.out.println("Baking Muffins for 15 minutes");
  }

  public void getIngredients()
  {
    System.out.println("Muffin Ingredients Acquired");
  }

  public void mixIngredients()
  {
    System.out.println("Muffin Ingredients Mixed");
  }

  public void putIngredientsInTin()
  {
    System.out.println("Ingredients put in wrappers in Muffin tray");
  }
}
