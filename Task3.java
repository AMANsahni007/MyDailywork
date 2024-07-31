public class Task3 {
    int amnt =567 ,blc;
    void deposit(int d)
    {
        blc = amnt+d;
    }
    void withdraw(int a)
    {
        blc = amnt-a;

    }
   
    void checkbalance()
    {
        System.out.println(blc);
    }
    public static void main(String[] args) {
        Task3 obj = new Task3();
        obj.withdraw(458);
        obj.deposit(45);
        obj.checkbalance();
    }
}

