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
public abstract class HouseTemplate {
 
    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("Huis is gebouwd");
    }
 
    //default implementation
    private void buildWindows() {
        System.out.println("Bouw ramen van glas");
    }
 
    //methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();
 
    private void buildFoundation() {
        System.out.println("Bouw de fundering met cement, ijzeren staven en zand");
    }
}
