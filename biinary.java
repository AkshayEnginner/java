import java.util.*;
class Binary
{
    public static void main(String ar[])
    {
        int num,i=0;
        int a[]=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        num=sc.nextInt();
        while(num!=0)
        {
            a[i]=num%2;
            i++;
            num=num/2;
            
         }
         while(i>0)
        {
            
            i--;
            System.out.print(a[i]);
        }
    }
}
        
    