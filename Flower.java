public class Flower {
  //Instance Variabled
  
    private String name;
    private boolean hasPlushie;
    private double price;
  
  //Constructor Methods
  //no-argument
  
    public Flower() {
      name = "null";
      hasPlushie = false;
      price = 5.25;
    }
    
  
  //parameterize
  
    public Flower(double price, String name, boolean hasPlushie) {
      this.price = price;
      this.name = name;
      this.hasPlushie = hasPlushie;
    }
  
  //Accessor & Mutator Methods
  
    public String getName() {
      return name;
    }
  
    public void getName(String name) {
      this.name = name;
    }

    public boolean getHasPlushie() {
      return hasPlushie;
    }

    public double getPrice() {
      return price;
    }
  //toString Method Override
    public String toString() {
      return "Thank you for shopping with me!" ;
    }
  //other Methods









  
}