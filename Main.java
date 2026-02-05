// Chase Batchelor
// February 4, 2026
// CPSC-39
// This is my Object Testing class for my Pizza and Dog objects.


public class Main {
    public static void main(String[] args) {
        
        // A1: Initalizes object with no defined constructor.
        Pizza pizza1 = new Pizza();
        
        // A2: Prints object Directly.
        System.out.println("Printing pizza1 directly:");
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza();
        System.out.println("\nDefaults for pizza1 fields: ");
        System.out.println("title = " + pizza2.getTitle());
        System.out.println("cost = " + pizza2.getCost());
        System.out.println("topping = " + pizza2.getTopping());
        
        // Tests default & non-default constructors with public data variables.
        Pizza pizza3 = new Pizza();
        System.out.println("\npizza3 after default constructor: ");
        System.out.println("title = " + pizza3.getTitle() + ", cost = " + pizza3.getCost() + ", topping = " + pizza3.getTopping());
    
        Pizza pizza4 = new Pizza("Cheesey Madness", 8, "Cheese");
        System.out.println("\npizza3 after parameterized constructor: ");
        System.out.println("title = " + pizza4.getTitle() + ", cost = " + pizza4.getCost() + ", topping = " + pizza3.getTopping());


        System.out.println("\nPrinting objects after overriding to String():");
        System.out.println("pizza2 = " + pizza2);
        System.out.println("pizza3 = " + pizza3);

        // Directly mutating public fields
        System.out.println("\nMutating public fields directly: ");
        pizza3.setCost(12);
        pizza3.setTitle("Combination");
        System.out.println("After mutation, pizza3 = " + pizza3);

        // Mutates private fields.
        System.out.println("\nMutating via setters after making fields private: ");
        pizza3.setCost(14);
        pizza3.setTitle("Ultra-Combination");
        pizza3.setTopping("Ultra Veggies");
        System.out.println("pizza3 cost via getter = " + pizza3.getCost());
        System.out.println("pizza3 now = " + pizza3);

        }
}
