public class Sandwich
{
  //declaring meat, cheese, and bread, cheese is set at certain amount
  private String meat;
  private String cheese;
  private String bread;
  private String veggies;
  private int numMeats;
  private int numVeggies;
  private boolean pickMeat;
  private boolean pickCheese;
  private boolean pickVeggies;

  //default
  public Sandwich()
  {
    //this("ham","swiss","lettuce","Italian")
  }
  //parameters of meat, cheese, bread, and veggies
  public Sandwich(String a, String b, String c, String d)
  {
    meat=a;
    cheese=b;
    veggies=c;
    bread=d;
  }

  //accessors

  //mutators

  //pick a random meat

  //equals method

  //toString method
  public String toString()
  {
    String str="";
    return str;
  }
}