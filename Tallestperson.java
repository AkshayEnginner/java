import java.util.*;
class Person
{
String name;
int height;

void accept()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the name");
name = in.next();
System.out.println("Enter the height");
height = in.nextInt();
}

void show()
{
System.out.println("Name is"+name);
System.out.println("Height is"+height);
}

void Tallest(Person obj)
{
if(this.height > obj.height)
 this.show();
else
obj.show();
}
}
class Tallestperson
{
public static void main(String args[])
{
Person P1 = new Person();
Person P2 = new Person();
//Person t = new Person();

System.out.println("Enter info of first person");
P1.accept();
System.out.println("Enter info of Second person");
P2.accept();
 P1.Tallest(P2);
}
}