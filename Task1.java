import java.util.*;
public class Task1
{
    int num;
    int g=34;
    int i;                                 // Number which user have to
    void main()
    {
        Scanner read =new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        num = read.nextInt();
        while(num!=g)                                     //while loop for taking multipal input again and again 
        {
            if(num<g)
            System.out.println("Enter a larger number");
            
            else
            System.err.println("Enter a smaller number");
            num = read.nextInt();
            i++;
        }
        System.out.println("Congratulations you won");                //final output
        System.err.println("final score ="+i);

    }
}
