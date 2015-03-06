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
public class GlassHouse extends HouseTemplate {
 
    @Override
    public void buildWalls() {
        System.out.println("Bouw een muur van glas");
    }
 
    @Override
    public void buildPillars() {
        System.out.println("Bouw pilaren met glas coating");
    }
 
}
