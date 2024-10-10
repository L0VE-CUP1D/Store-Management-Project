public class Roses extends Flower {
  //Instance variables
  private String color;
  private int group;

  //Constructor Methods
  //parameter
  public Roses(String name, boolean hasPlushie, double price, String color, int group) {
    super(price, name, hasPlushie);
    this.color = color;
    this.group = group;
  }
  
  //No-Argument
  public Roses() {
    color = "red";
    group = 0;
  }


  //Accessor & Mutator Methods
  public String getColor(){
    return color;
  }
  public void String(String color){
    this.color = color;
  }
  public int getGroup(){
    return group;
  }
  public String toString(){
    return "Wow great choice of color(s)! " + color +  " is such a great color!";
  }
}