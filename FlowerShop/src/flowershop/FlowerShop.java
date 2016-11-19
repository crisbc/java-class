/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

/**
 *
 * @author Cristina
 */
public class FlowerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FlowerSales sally = new FlowerSales("sally",303,57,40,125,56);
        FlowerSales monica = new FlowerSales("monica",225,59,46,125,52);
        FlowerSales bob = new FlowerSales("bob",170,37,36,116,57);
        
        sally.start();
        monica.start();
        bob.start();
        
        System.out.println(" Finished collecting data ");
    }
    
}
