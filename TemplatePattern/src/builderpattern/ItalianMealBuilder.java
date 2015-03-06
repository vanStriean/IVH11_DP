/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Imkr
 */
public class ItalianMealBuilder implements MealBuilder {

	private Meal meal;

	public ItalianMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Rode Wijn");
	}

	@Override
	public void buildMainCourse() {
		meal.setMainCourse("Pizza");
	}

	@Override
	public void buildSide() {
		meal.setSide("Brood");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
