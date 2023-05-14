import java.util.Scanner;
class longestword{
         public static void main(String ar[])
         {
                  String str,max="";
                  Scanner sc = new Scanner(System.in);
                  System.out.print("Enter a sentence:");
                  str = sc.nextLine();  
                  String s[] = str.split(" ");
                  for(String sub:s)
                  {
                        if(max.length()<sub.length())
                        {
                             max = sub;
                        }
                  }
                  System.out.println("The longest word:"+max);  
                  System.out.println("The length of the word:"+max.length());          
        }
}