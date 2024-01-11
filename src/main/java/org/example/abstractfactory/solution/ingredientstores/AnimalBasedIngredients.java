package org.example.abstractfactory.solution.ingredientstores;

import org.example.abstractfactory.solution.ingredientstores.ingredients.butters.Butter;
import org.example.abstractfactory.solution.ingredientstores.ingredients.butters.MilkButter;
import org.example.abstractfactory.solution.ingredientstores.ingredients.chocolate.Chocolate;
import org.example.abstractfactory.solution.ingredientstores.ingredients.chocolate.DarkChocolate;
import org.example.abstractfactory.solution.ingredientstores.ingredients.eggs.ChickenEgg;
import org.example.abstractfactory.solution.ingredientstores.ingredients.eggs.Egg;
import org.example.abstractfactory.solution.ingredientstores.ingredients.flours.Flour;
import org.example.abstractfactory.solution.ingredientstores.ingredients.flours.StandardFlour;
import org.example.abstractfactory.solution.ingredientstores.ingredients.lemons.Lemon;
import org.example.abstractfactory.solution.ingredientstores.ingredients.lemons.StandardLemon;
import org.example.abstractfactory.solution.ingredientstores.ingredients.sugars.StandardSugar;
import org.example.abstractfactory.solution.ingredientstores.ingredients.sugars.Sugar;

public class AnimalBasedIngredients implements IngredientFactory {

  @Override
  public Butter getButter() {
    return new MilkButter();
  }

  @Override
  public Egg getEggs() {
    return new ChickenEgg();
  }

  @Override
  public Flour getFlour() {
    return new StandardFlour();
  }

  @Override
  public Sugar getSugar() {
    return new StandardSugar();
  }

  @Override
  public Lemon getFruits() {
    return new StandardLemon();
  }

  @Override
  public Chocolate getChocolate() {
    return new DarkChocolate();
  }
}
