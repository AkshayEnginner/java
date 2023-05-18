package Student;
import java.util.*;
public class TYmarks

{
int theory,practical,sum;
public void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the theory marks");
theory=sc.nextInt();
System.out.println("Enter the Practical marks");
practical=sc.nextInt();
}
void cal()
{
  sum = theory+practical;
}

public int sum()
{
   return sum;
}
public void show()
{
System.out.println(" theory marks are" +theory);
System.out.println(" practical marks are" +practical);
System.out.println(" 	The sum is " +sum); 
}


}
