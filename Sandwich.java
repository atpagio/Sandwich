public class Sandwich
{
  private String meat;
  private String cheese;
  private String veggies;
  private String bread;
  private String sauce;
  private int length;
  private boolean toasted;
  int numCount=0;

  //default
  public Sandwich()
  {
    this("liver","blue cheese","brussel sprouts","cinnamon bread","hot sauce",1,true);
  }

  //user-entered parameters
  public Sandwich(String a,String b,String c,String d,String e,int f,boolean g)
  {
    setMeat(a);
    setCheese(b);
    setVeggies(c);
    setBread(d);
    setSauce(e);
    setLength(f);
    setToasted(g);
  }

  //accessors
  public String getMeat()
  {
    return meat;
  }
  public String getCheese()
  {
    return cheese;
  }
  public String getVeggies()
  {
    return veggies;
  }
  public String getBread()
  {
    return bread;
  }
  public String getSauce()
  {
    return sauce;
  }
  public int getLength()
  {
    return length;
  }
  public boolean isItToasted()
  {
    return toasted;
  }

  //mutators
  public void setMeat(String a)
  {
    meat=a;
  }
  public void setCheese(String a)
  {
    cheese=a;
  }
  public void setVeggies(String a)
  {
    veggies=a;
  }
  public void setBread(String a)
  {
    bread=a;
  }
  public void setSauce(String a)
  {
    sauce=a;
  }
  public void setLength(int a)
  {
    length=a;
  }
  public void setToasted(boolean a)
  {
    toasted=a;
  }

  //pick a random choice!
  public Sandwich chefsChoice()
  {
    int value = (1+((int)(3*Math.random())));
    if(value==1)
    {
       Sandwich a=new Sandwich("ham","swiss","lettuce","Italian","caeser dressing",6,false);
       a.cutSw(3);
       return a;
    }
    if(value==2)
    {
       Sandwich a=new Sandwich("smoked chicken","queso fresco","hot pepper","brown bread","soy sauce",15,true);
       a.cutSw(2);
       return a;
    }
    if(value==3)
    {
       Sandwich a=new Sandwich("soppressata","havarti","spinach and mangosalsa","french roll","grainy mustard and tamari",15,true);
       return a;
    } 
    Sandwich a= new Sandwich();
    return a;
  }

  //cut the sandwich?
  public void cutSw(int b)
  {
    length/=b;
    numCount+=b;
  }

  //equals
  public boolean equals(Sandwich a)
{
  a=new Sandwich();
  if(this.getMeat()==a.getMeat()&&this.getCheese()==a.getCheese()&&this.getVeggies()==a.getVeggies()&&this.getBread()==a.getBread()&&this.getSauce()==a.getSauce())
  {
    return true;
  } else {
    return false;
  }
}
  //toString, prints equals method then description of sandwich
  public String toString()
  {
    Sandwich a=new Sandwich();
    String str="";
    if(numCount>1)
    {
      str=(numCount+" "+meat+", "+cheese+", and "+veggies+" "+length+"in sandwiches on "+bread+", with "+sauce+", ");
    } else {
    str=("A "+meat+", "+cheese+", and "+veggies+" "+length+"in sandwich on "+bread+", with "+sauce+", ");
    }
    //if its toasted or not
    if(toasted==true)
    {
      str+="toasted.";
    } 
    if(toasted==false){
      str+="untoasted.";
    }
    //equals method for varying messages
    if(this.equals(a))
    {
      System.out.println("This one sounds kind of nasty... how about making something better?");
    } else {
      System.out.println("\nThat's a fantastic choice!");
    }
    return str;
  }
}