import java.util.*;
public class Task2 {

    public static void main(String args[])
    {
        Scanner read= new Scanner (System.in);
        System.out.println("Enter markes obtained in Math");
        int m =read.nextInt();
        
        System.out.println("Enter markes obtained in Chemistry");
        int c =read.nextInt();
        
        System.out.println("Enter markes obtained in Physics");
        int p =read.nextInt();
        
        System.out.println("Enter markes obtained in English");
        int e =read.nextInt();
        
          System.out.println("Enter markes obtained in Computer");
        int co =read.nextInt();

        int sum = m+c+p+e+co;
        
        int avj = sum/5;
        System.out.println("Total score = "+ sum);
        System.out.println("Average marks = "+ avj+"%");
              
        if (avj<40)
        
            System.out.println("Grade obtained = 'D'");
            else if(avj>40 && avj<60)
            System.out.println("Grade obtained = 'C'");
            else if(avj>60 && avj<90)
            System.out.println("Grade obtained = 'B'");
            else if(avj>90 )
            System.out.println("Grade obtained = 'A'");
            
        } 
    }
    

