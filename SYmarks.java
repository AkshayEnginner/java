package Student;
import java.util.*;
public class SYmarks
{
int comp,maths,elec,add;
public void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the total computer marks");
comp=sc.nextInt();
System.out.println("Enter the total maths marks");
maths=sc.nextInt();
System.out.println("Enter the total electronics marks");
elec=sc.nextInt();
cal();
}

void cal()
{
    add = comp+maths+elec;
    
}
public int total()
{
return add;
}




public void show()
{
System.out.println("computer marks are" +comp);
System.out.println("maths marks are" +maths);
System.out.println("elec marks are" +elec);
System.out.println("The sum is" +sum);
}

}