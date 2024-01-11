package org.example.abstractfactory.solution.ingredientstores;

import org.example.abstractfactory.solution.ingredientstores.ingredients.butters.Butter;
import org.example.abstractfactory.solution.ingredientstores.ingredients.butters.PlantButter;
import org.example.abstractfactory.solution.ingredientstores.ingredients.chocolate.Chocolate;
import org.example.abstractfactory.solution.ingredientstores.ingredients.chocolate.PlantBasedChocolate;
import org.example.abstractfactory.solution.ingredientstores.ingredients.eggs.Egg;
import org.example.abstractfactory.solution.ingredientstores.ingredients.eggs.PlantBasedEgg;
import org.example.abstractfactory.solution.ingredientstores.ingredients.flours.Flour;
import org.example.abstractfactory.solution.ingredientstores.ingredients.flours.OrganicFlour;
import org.example.abstractfactory.solution.ingredientstores.ingredients.lemons.Lemon;
import org.example.abstractfactory.solution.ingredientstores.ingredients.lemons.OrganicLemon;
import org.example.abstractfactory.solution.ingredientstores.ingredients.sugars.OrganicSugar;
import org.example.abstractfactory.solution.ingredientstores.ingredients.sugars.Sugar;

public class PlantBasedIngredients implements IngredientFactory {

  @Override
  public Butter getButter() {
    return new PlantButter();
  }

  @Override
  public Egg getEggs() {
    return new PlantBasedEgg();
  }

  @Override
  public Flour getFlour() {
    return new OrganicFlour();
  }

  @Override
  public Sugar getSugar() {
    return new OrganicSugar();
  }

  @Override
  public Lemon getFruits() {
    return new OrganicLemon();
  }

  @Override
  public Chocolate getChocolate() {
    return new PlantBasedChocolate();
  }
}
