package org.example.abstractfactory.solution.ingredientstores;

import org.example.abstractfactory.solution.ingredientstores.ingredients.butters.Butter;
import org.example.abstractfactory.solution.ingredientstores.ingredients.chocolate.Chocolate;
import org.example.abstractfactory.solution.ingredientstores.ingredients.eggs.Egg;
import org.example.abstractfactory.solution.ingredientstores.ingredients.flours.Flour;
import org.example.abstractfactory.solution.ingredientstores.ingredients.lemons.Lemon;
import org.example.abstractfactory.solution.ingredientstores.ingredients.sugars.Sugar;

public interface IngredientFactory {
  Butter getButter();
  Egg getEggs();
  Flour getFlour();
  Sugar getSugar();
  Lemon getFruits();
  Chocolate getChocolate();
}
