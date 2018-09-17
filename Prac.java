
package A;

import java.util.Random;


public class Prac {

    private static enum Which {HEAD, TAIL};
   static Random rand = new Random();

    public static void main (String args []){
    
       // toss(20000000);
        
        sorting(new int [] {5,2,3,7,9,0,14,52,45,23});
    
    }
    
    public static void sorting(int arr []){
    
    int i;
    int j;
        for(i=0; i<arr.length; i++){
            int temp = 0;
        
        for(j=i; j>0; j--){
        
        if(arr[j-1]>arr[j])
          temp = arr[j];
        arr[j]=arr[j-1];
        arr[j-1] = temp;
        
        }
        
        }System.out.println(arr[j]);
        
       
    
    }
    
    public static void toss(int n){
        Which which=null;
        int ch=0, ct=0;
    int i;
    for(i=0; i<n; i++){
    int toss = 1+rand.nextInt(2);
        if(toss==2){
        ch++;
        which = Which.HEAD;    
        }
        if(toss==1){
            ct++;
        which = Which.TAIL;    
        }
    }
    System.out.println(ch+" heads and "+ct+" tails");
//    switch(which){
//    
//        case HEAD:
//            System.out.println(ch+" HEAD");
//            break;
//        case TAIL:
//            System.out.println(ct+" TAIL");
//            break;
//        default :
//            break;
//               
//    }
   
    
    
    }
}
