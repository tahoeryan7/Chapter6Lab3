// ***************************************************************

//   Shop.java

//

//   Uses the Item class to create items and add them to a shopping

//   cart stored in an ArrayList.

// ***************************************************************


import java.util.ArrayList;

import java.util.Scanner;


public class Shop

{

    public static void main (String[] args)

    {

        ArrayList<Item> cart = new ArrayList<Item>();


        Item item;

        String itemName;

        double itemPrice;

        int quantity;

        Scanner scan = new Scanner(System.in);


        String keepShopping = "y";


        while (keepShopping.equals("y")) 

            {

                System.out.print ("Enter the name of the item: ");

                itemName = scan.next();
                String ItemName = itemName;

                System.out.print ("Enter the unit price: ");

                itemPrice = scan.nextDouble();
                double ItemPrice = itemPrice;

                System.out.print ("Enter the quantity: ");

                quantity = scan.nextInt();
                int Quantity = quantity;

                // *** create a new item and add it to the cart
                Item thing= new Item(itemName, itemPrice, quantity);
                cart.add(thing);
                



                // *** print the contents of the cart object using println
                //System.out.println("You want " + ItemName);
                //System.out.println(ItemName + " is " + ItemPrice);
                //System.out.println("You want " + Quantity + " Of these");
                //System.out.println("Your total Price is " + ItemPrice * Quantity);

                System.out.print ("Continue shopping (y/n)? ");

                keepShopping = scan.next();

            }


        checkOut(cart);

    }


   public static void checkOut(ArrayList<Item> yourCart) {
       Scanner scan = new Scanner(System.in); 
       System.out.println();
       System.out.println("Your Cart Has");
       ArrayList<Integer> itemsRemoved= new ArrayList<Integer>();
       
        //You do NOT need a getter method (think about public instance variables)
        
        for(int i=0; i <yourCart.size(); i++){
            System.out.println(yourCart.get(i));
            System.out.println("Remove this Item? y/n");
            String answer= scan.next();
            if(answer.equals("y")){
                itemsRemoved.add(i);
            }
        }
        for(int i : itemsRemoved){
            yourCart.remove(i);
        }
        //Print the contents of the cart (you may use the toString() method
        System.out.println();

        //Ask the user if they would like to remove an item.  If yes, remove that item.


        //Print final total of items and final price (total)
        double total= 0;
        for(Item i : yourCart) {
            total += i.price * i.quantity;
        }
        System.out.println("You have purchased " + yourCart + " it will cost " + total);
        


}

}