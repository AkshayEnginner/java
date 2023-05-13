import java.util.*;
class akshay
{
    int income;
   
     void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income");
        income=sc.nextInt();
        
        if(income<500000)
        {
            System.out.println("NO tax");
        }
        else if(income>500000&&income<1000000)
        {
            double l = income*0.2 ;
             System.out.println("your tax to be paid" + l);
        }
        else if (income>1000000)
        {
            double x = income*0.3;
            System.out.println("your tax to be paid" + x);
        }
        
        
    }
}
class main
{
    public static void main(String args[])
    {
        akshay a = new akshay();
        a.input();
    }
}