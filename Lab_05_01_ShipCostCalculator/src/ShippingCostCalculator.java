public class ShippingCostCalculator {
    public static void main(String[] args)
    {
        double itemPrice = 155.99;
        final double SHIPPING_FEE = 0.02;
        final int FREE_SHIPPING = 100;
        double shippingCost;
        double totalItemPrice;

        if (itemPrice >= FREE_SHIPPING)
        {
            System.out.println("Your shipping is free. Your total price is: " + itemPrice);
        }
        else
        {
            shippingCost = itemPrice * SHIPPING_FEE;
            totalItemPrice = shippingCost + itemPrice;
            System.out.println("Your original item price before shipping costs is " + itemPrice + " Your shipping cost is: " + shippingCost + " Your total price after shipping costs is: " + totalItemPrice);

        }


    }
}
