/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

/**
 *
 * @author Imkr
 */
public class WoodenHouse extends HouseTemplate {
 
    @Override
    public void buildWalls() {
        System.out.println("Bouw een muur van hout");
    }
 
    @Override
    public void buildPillars() {
        System.out.println("Bouw pilaren van hout");
    }
 
}
