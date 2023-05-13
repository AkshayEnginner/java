import java.util.*;
class Person
{
String name;
float height;

void accept()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name");
name = sc.next();
System.out.println("Enter the height");
height = sc.nextFloat();
}

void show()
{
System.out.println("Name is"+name);
System.out.println("Height is"+height);
}

Person Compare(Person obj)
{
if(this.height > obj.height)
   return this;
else
   return obj;
}
}
class Tallestpersonf
{
public static void main(String args[])
{
int n;
Scanner in = new Scanner(System.in);
System.out.println("Enter number of person");
n=in.nextInt();
Person t = new Person();
Person P[ ] = new Person[n];
for(int i=0;i<n;i++)
{
 P[i] =new Person();
 System.out.println("Enter Person"+i+"Details:");
 P[i].accept();
}

for (int i=0;i<n;i++)
{
t=t.Compare(P[i]);
}
t.show();
}
}