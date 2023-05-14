import java.util.*;
class oddeven
{
    int number;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number=sc.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd"); 
        }
    }
}
class main
{
    public static void main(String agrs[])
    {
        oddeven o = new oddeven();
        o.input();
    }
}