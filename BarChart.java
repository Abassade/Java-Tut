/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;


public class BarChart {

    public static void main(String args []){
    
    int array [] = {0,0,0,0,0,1,4,3,7,2,3};
    
    for(int i=0; i<array.length; i++){
    
        if(i==10)
        
            System.out.printf("%5d",100);
        
        else
        
        System.out.printf("%02d-%02d", i*10, i*10+9);
        
        
        for(int star=0; star<array[i]; star++)
            
            System.out.print("*");
         System.out.println();
    
    }
    
    
    }
}
