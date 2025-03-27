import java.util.Random;
public class CoffeeOrder {
    Random rand= new Random();
    int random=10000+rand.nextInt(90000);
    // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:

    String size;
    String type;
    private int orderid = random;
    static int totalOrders = 0;
    // - size (String)
    // - type (String)
    // - orderID (String, make this one private)

    // TODO 3: Add a static int variable called totalOrders

    // TODO 4: Create a no-arg constructor
    // Set size to "medium" and type to "black"
    // Increment totalOrders
    CoffeeOrder(){
        this.size="Medium";
        this.type="Black";
        totalOrders++;
    }


    // TODO 5: Create a constructor that takes a size only
    // Set type to "black" by default
    // Increment totalOrders
    CoffeeOrder(String size){
        this.size=size;
        this.type="Black";
        totalOrders++;

    }


    // TODO 6: Create a constructor that takes size and type
    // Increment totalOrders
    CoffeeOrder(String size, String type){
        this.size=size;
        this.type=type ;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns
    // something like "Order: medium black"
    void describeOrder(){
        System.out.println("An order: "+size+" "+type);
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    static void getTotalOrders(){
        System.out.println("Total orders today: "+totalOrders);
    }
}

