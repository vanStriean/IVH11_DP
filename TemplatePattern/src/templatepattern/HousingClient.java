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
public class HousingClient {
 
    public static void main(String[] args) {
         
        HouseTemplate houseType = new WoodenHouse();
         
        //using template method
        houseType.buildHouse();
        System.out.println("************");
         
        houseType = new GlassHouse();
         
        houseType.buildHouse();
    }
 
}
