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
public class FlowerSales extends Thread {
    String associateName;
    int salesGoal ;
    int percentOfUpsales;
    int dollarsPerHour;
    int numberOfClients;
    double THPC; // average sell per client
    int hoursWorked;
    
    public FlowerSales(String associateName,int salesGoal,int percentOfUpsales,int dollarsPerHour,int numberOfClients, int hoursWorked){
        this.associateName = associateName;
        this.salesGoal = salesGoal;
        this.percentOfUpsales = percentOfUpsales;
        this.dollarsPerHour = dollarsPerHour;
        this.numberOfClients = numberOfClients;
        this.hoursWorked = hoursWorked;
        
    }
    
    @Override
    public void run(){
        for (int i = 0; i < salesGoal; i++){
            System.out.println(associateName + " Sold an item " + i);
            
        }
        
        if(salesGoal > 100){
            System.out.println(associateName + " Met or exceeded retail sales $" + salesGoal);
        }
        else{
        System.out.println(associateName + " Retail sales not met $" + salesGoal);
        }
        
        //Gives percent of upsold items compared to the number of clients
       // percentOfUpsales = (percentOfUpsales *100)/numberOfClients ;
   
        if (percentOfUpsales > 30 ){
            System.out.println(associateName + " You have reached or exceeded percent of up sales " + percentOfUpsales + "%");
        }
        else{
            System.out.println(associateName + " You have not reached your upsale goal " + percentOfUpsales + "%");
        }
        
       // retail sold divided by number of clients
        THPC = (double) salesGoal / numberOfClients;
       
        if(THPC > 1){
            System.out.println(associateName + " Take Home Retail Per Client has been met or exceeded $" + THPC );
        }
        else{
            System.out.println(associateName + " Take Home Retail Per Client Not Met! $" + THPC);
        }
        
        if(dollarsPerHour > 34){
             System.out.println(associateName + " Service dollars per hour has been met or exceeded $" + dollarsPerHour );
        }
        else {
            System.out.println(associateName + " Service dollars per hour Not Met! $" + dollarsPerHour);
        }
        
        if(dollarsPerHour > 34 && THPC > 1 && salesGoal > 100 && percentOfUpsales > 30 ){
            System.out.println(associateName + " You have bonused for this pay period! ");
            
            //compute the amount of bonus
           int bonus = dollarsPerHour - 34;
     
           double bonus1 = (bonus * percentOfUpsales) * .01;
           double bonus2 = bonus1 * hoursWorked;
           
          double bonus3 = bonus2 + (salesGoal * .10);
          double bonus4 = bonus3 + (hoursWorked * .5);
          
          System.out.println(associateName + " This is the amount you bonused for this pay period $" + bonus4);
        }
        else {
            System.out.println(associateName + " Sorry you didnt bonus this time ");
        }
        
        
       // System.out.println("Has reached sales goal");
        yield();
    }
    
}
