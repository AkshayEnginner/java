import java.util.*;
class Array
{
int i, num;
int numbers[ ] = new int[15];

void input( )
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the 10 numbers");
for(i=0;i<10;i++)
{
numbers[i]=sc.nextInt( );
}
}

void show( )
{
System.out.println("Enter values are");
for(i=0;i<10;i++)
{
System.out.println(numbers[i]+" ");
}
}

void cal( )
{
//int fg=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter any single number");
num=sc.nextInt( );
for(i=0;i<10;i++)
{
	if(num==numbers[i])
	{
                         
		System.out.println("Number found :"+num);
		break;
	}
	/*else
	{
		System.out.println("Not found ");
		
	}*/
	
}

}
}

class noinarray
{
public static void main(String args[])
{
//Array t;
Array t = new Array( );
t.input( );
t.show( );
t.cal( );
}
}

