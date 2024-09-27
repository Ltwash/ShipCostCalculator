import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double itemCost;
        double shippingCost;
        double totalCost;


        System.out.println("Please input the cost of your item");
        itemCost = in.nextDouble();

        if (itemCost < 100){
            shippingCost = itemCost * .02;
            totalCost = itemCost + shippingCost;
            System.out.println("The total cost is " + totalCost + ", The shipping cost is " + shippingCost + " The original cost was " + itemCost);
        }
        else if (itemCost > 100){
            System.out.println("Shipping on your purchase is free! The total cost is " + itemCost);
        }



































    }
}