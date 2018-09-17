package A;


import java.util.Random;
import java.util.Scanner;




public class CIA{

   private static Random random = new Random();
   static Scanner in = new Scanner(System.in);
  private static int counter =5;
   
  // private enum Status {OVER}; 
    
    public static void main (String args []){
    
        System.out.println("--------------You start with 5 lives--------------\n");
          play();   
    }
    
    public static void play(){
        
        int first = random.nextInt(12);
        int second = random.nextInt(12);

        int answer = first*second;
        
    System.out.println("What is "+first+" times "+second+" ?");
    int response = in.nextInt();
    
    while(response!=answer){
    counter--;
    if(counter<=0){
    
         System.out.println("-----Game Over!-----");
         System.exit(0);
               
    }else{
        if(counter==1){
            System.out.println("Oops! you are wrong ----You have "+counter+" more live\n");
            play();
            }else{
    System.out.println("Oops! you are wrong ----You have "+counter+" more lives\n");
     
            play(); }
    }}
    
    while(response==answer){
        
        if(counter<=0){
    
             System.out.println("-----Game Over!-----");
             System.exit(0);
    }else{
            if(counter==1){
            System.out.println("Wow! you are correct ----You still have "+counter+" more live\n");
            play();
            }
            else{
    System.out.println("Wow! you are correct ----You still have "+counter+" more lives\n");
    play();}
        }
   
        
        }
    }
   
}