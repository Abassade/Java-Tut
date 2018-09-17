

package A;

import javax.swing.JOptionPane;


public class MathAid extends Stopwatch{

    public static void main (String args []){
        int count=0;
        int correct_count=0;
        
           start();
        while(count<10){
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        
        // case where num1 is less than num2 swap them
        if(num1<num2){
        
            int temp =num1;
            num1=num2;
            num2=temp;
        }
        
        try{
        
            
        String res = JOptionPane.showInputDialog(null,
                "What is "+num1+" - "+num2+" ?");
        
        int response = Integer.parseInt(res);
        
        String checker="";
        if(response == num1-num2){
        
            correct_count++;
        checker = "Wow! You are correct";
        
        }else{
        
        checker = "Oops! You are wrong\n The correct answer = "+(num1-num2);
        }
        JOptionPane.showMessageDialog(null, checker);
        }
        catch(NumberFormatException e){
            
        e.getMessage();
        }
        count++;
        stop();
        }
        JOptionPane.showMessageDialog(null, "You got "+correct_count+" out of 10\nThe time spent is "+time()+" seconds");
        
    }
}
