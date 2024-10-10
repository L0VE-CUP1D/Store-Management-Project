import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
  Flower nice = new Flower();
  Roses pink = new Roses("Janice", true, 10.15, "pink", 5);

    System.out.println ("Welcome to my Flower Shop! I sell Roses and Sunflowers!");
    System.out.println("----ROSES----");
    System.out.println("FOR: " + pink.getName());
    System.out.println("Color of the roses: " + pink.getColor());
    System.out.println("Amount in the group of roses: " + pink.getGroup());
    System.out.println("Price of roses: " + pink.getPrice());
    System.out.println("-------------------------");
    System.out.println(pink);
    System.out.println(nice);


    // Closes the Scanner object
    input.close();
    
  }
}