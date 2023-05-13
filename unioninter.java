import java.util.*;
class test
{
 String n;
 void accept( )
{
 Scanner sc = new Scanner(System.in);
 System .out.println("Enter the values ");
 n=sc.next();
}
 void show( )
{
System.out.println("the values are"+n);
}
}

class unioninter
{
public static void main(String args[])
{
test t1 = new test[5];
test t2 = new test[5];

System.out.println("Enter for first set");
t1.accept();
System.out.println("Enter for second set");
t2.accept();

}
}
