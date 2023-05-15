import java.util.*;
class time
{
int hours,min,sec;

void accept()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the hours");
hours=sc.nextInt();
System.out.println("Enter the min");
min=sc.nextInt();
System.out.println("Enter the sec");
sec=sc.nextInt();
}

void show()
{
System.out.println(" hours is"+hours);
System.out.println(" min is"+min);
System.out.println(" sec is"+sec);
}

void  add(time a,time b)
{
this.sec=a.sec+b.sec;
this.min=a.min+b.min+(this.sec/60);
this.sec=this.sec%60;
this.hours=a.hours+b.hours+(this.min%60);
this.min=this.min%60;

}

void display()
{
System.out.println(hours+"hours"+":"+min+"min"+":"+sec+"sec");
}
}
 
class addtime
{
public static void main(String args[])
{
 time t1 = new time();
 time t2 = new time();
 time t = new time();

System.out.println("Enter the time 1 values");
t1.accept();
System.out.println("Enter the time 2 values");
t2.accept();
System.out.println("Show the addition of two times");
t.add(t1,t2);
t.display();
}
}