import java.util.*;
class Medicine
{
    String name,company;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Medicine  name");
        name=sc.next();
        System.out.println("Enter the Company name");
        company=sc.next();
    }
}

class Dealer extends Medicine
{
    String Product_name;
    int price;
    
    void input()
    {
      super.input();  
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product name ");
        Product_name=sc.next();
        System.out.println("Enter the price ");
        price=sc.nextInt();
    }
}

class Retailer extends Dealer
{
    double salePrice;
    
   
    void cal()
    {
        salePrice=price+(price*0.015);
    }
    
    void show()
    {
        System.out.println("Saleprice = " +salePrice);
    }
}

class Inheritance
{
    public static void main(String args[])
    {
        Retailer r = new Retailer();
        r.input();
        r.input();
        r.cal();
        r.show();
    }
}