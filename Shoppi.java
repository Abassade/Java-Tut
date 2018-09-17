
package A;

//import java.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//
//public class Shoppi {
//
//    public static void main(String args []){
//         
//        peri_triangle(new int []{3,5,7,9,23,2});
//        
//    }
//    
//    public static void peri_triangle(int [] arr){
//
//         int p = 0, q = 0,r = 0;
//             
//        int i;
//        Arrays.sort(arr);
//        for (i=0; i<arr.length-4; i++){
//        
//             p = arr[i];
//             q = arr[i+1];
//             r = arr[i+2];
//          
//             if(p+q>r && r+q>p && q+p>r){
//            
//            System.out.println(r);
//                 
//             }
//        }
//    }
//}


public class Shoppi {

public static void main(String args []){

int list [] = {5,7,12,1,10,6,2,3,23,4,9};
//
//list = new int [15];
//list[3] = 5;
//
//List li = new ArrayList();
//li.add(0, new Integer(5));

for(int i=0; i<list.length; i++){

   int t=list[i];
  //  System.out.print(t+"\n");
    int k;
    
    for(k=i-1; k>=0 && list[k]>t; k--){
    
    list[k+1]=list[k];
    }
    list[k+1]=t;
    
  //  System.out.println(t);
}









}


}

