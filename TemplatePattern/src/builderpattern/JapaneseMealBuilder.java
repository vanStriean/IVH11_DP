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
public class JapaneseMealBuilder implements MealBuilder {

	private Meal meal;

	public JapaneseMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Sake");
	}

	@Override
	public void buildMainCourse() {
		meal.setMainCourse("Kip Teriyaki");
	}

	@Override
	public void buildSide() {
		meal.setSide("Miso Soep");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
