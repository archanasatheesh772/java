class Product{
    int pcode;
    String pname;
    double price;
    Product(int pcode,String pname,double price)
    {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

    public class lowestpriceproduct{
 
    public static void main(String[]args)
    {
        Product p1 = new Product(100,"TV",85000);
        Product p2 = new Product(101,"laptop",50000);
        Product p3 = new Product(102,"phone",150000);
        

        Product lowest=p1;
        if(p2.price<lowest.price)
        {
            lowest=p2;
    
        }
        if(p3.price<lowest.price)
        {
            lowest=p3;
        }


        System.out.println("product with lowest price");
        System.out.println("code:"+lowest.pcode);
        System.out.println("name:"+lowest.pname);
        System.out.println("price:"+lowest.price);
    }
 }

 







    
 

