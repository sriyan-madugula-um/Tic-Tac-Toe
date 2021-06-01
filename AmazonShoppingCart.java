public class AmazonShoppingCart
{
    public static void main(String[] args)
    {   int TVQuantity = 2;
        double TVPrice = 2499.99;
        String TVName = "Samsung 65 in Full HD TV";
        
        int phoneQuantity = 1;
        double phonePrice = 799.99;
        String phoneName = "iPhone 12";
        
        int penQuantity = 10;
        double penPrice = 1.99;
        String penName = "BIC Ballpoint Pens";
        
        int bedQuantity = 16;
        double bedPrice = 749.99;
        String bedName = "LUCID Twin Size Bed";
        
        int pillowQuantity = 5;
        double pillowPrice = 22.99;
        String pillowName = "HIMOON Bed Pillows";
        
        double totalBeforeTax = TVQuantity*TVPrice + phoneQuantity*phonePrice + penQuantity*penPrice + bedQuantity*bedPrice + pillowQuantity*pillowPrice;
        double totalAfterTax = 1.06*totalBeforeTax;
        System.out.println("Your cart total is: $" + totalBeforeTax + ".");
        System.out.println("Your cart total after tax is: $" + totalAfterTax + ".");
        System.out.println("Your items include: " + TVQuantity + " " + TVName + "," + " " + phoneQuantity + " " + phoneName + "," + " " + penQuantity + " " + penName + "," + " " + bedQuantity + " " + bedName + "," + " and " + pillowQuantity + " " + pillowName + "."); 
        
     
    }
}    
