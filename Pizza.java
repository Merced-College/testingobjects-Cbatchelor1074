// Chase Batchelor
// February 4, 2026
// CPSC-39
// This is my Pizza class for my Pizza objects.

public class Pizza {
  /* Data variables (Commented due to the change to private.)
    public String title;
    public int cost;
    public String topping;
  */
  private String title;
  private int cost;
  private String topping;

  // Constructors
  public Pizza() {
    title = "Pepperoni Madness";
    cost = 10;
    topping = "Pepperoni";
  }

  // Constructor with parameters.
  public Pizza(String title, int cost, String topping) {
    this.title = title;
    this.cost = cost;
    this.topping = topping;
  }

  // States everything in a brief print.
  @Override
  public String toString() {
    return "Pizza{title = '" + title + "', cost = " + cost + ", topping = '" + topping + "'}";
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCost() {
    return cost;
  }
  
  public void setCost(int cost) {
    if (cost > 0) this.cost = cost;
  }

  public String getTopping() {
    return topping;
  }
  
  public void setTopping(String topping) {
    this.topping = topping;
  }

}