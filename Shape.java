import java.util.*;
class Triangle
{
float bs,ht,area;
void input()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the height");
    ht=sc.nextFloat();
    System.out.print("Enter the base");
    bs=sc.nextFloat();
}
void cal()
{ 
  area=0.5f*ht*bs;
}
void display()
{
  System.out.print("Area" +area);
}
}
public class Shape{
public static void main(String ar[])
{

  Triangle t = new Triangle();
   t.input();
   t.cal(); 
   t.display();
}
}