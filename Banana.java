
package A;

import java.util.Scanner;

public class Banana {

    
    public static void main(String[] args) {
        
        System.out.println("Enter no of banana");
        Scanner in = new Scanner(System.in);
        int Total_banana = in.nextInt();
        
        System.out.println("Enter no of camels");
        int z = in.nextInt();
        
        System.out.println("Enter no of banana eats per km");
        int k = in.nextInt();
        
        System.out.println("Enter the distance");
        int distance = in.nextInt();
        final int max_carry=1000;
        
        int no_of_trip = Total_banana/max_carry;
        int sum =0;
        
        // The main algorithm
        for(int i=1; i<=no_of_trip; i++){
        
        sum += (max_carry/(((2*i)-1)*z*k));
            
        }
        sum+=(Total_banana%max_carry)/((2*no_of_trip)+1);
        
        int max_output =sum-distance; 
        System.out.println("Maximum Output :"+max_output);
        
        String abs = "O";
        int thr [] ;
        
       System.out.println();
       
       
        
    }
    
}
