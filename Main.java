import java.io.*;
import java.util.*;
import static java.lang.System.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Sandwich sw=new Sandwich();
    Sandwich sw1=new Sandwich();
    System.out.println(sw);
    System.out.println("Would you like a custom sandwich? Or would you like to try a chef's choice?");
    String option=scan.nextLine();
    option=option.toLowerCase();
    if(option.equals("custom"))
    {
    //customizer options
    System.out.println("Sandwich customizer:\nWhat meat?");
    String a=scan.nextLine();
    System.out.println("Cheese?");
    String b=scan.nextLine();
    System.out.println("Vegetables?");
    String c=scan.nextLine();
    System.out.println("Bread type?");
    String d=scan.nextLine();
    System.out.println("Sauce/dressing?");
    String e=scan.nextLine();
    System.out.println("How long would you like it(inches)?");
    int f=scan.nextInt();
    System.out.println("Toasted?");
    Scanner scan1 = new Scanner(System.in);
    String g=scan1.nextLine();
    g=g.toLowerCase();
    System.out.println("Would you like to cut the sandwich up?");
    String cut=scan.nextLine();
    cut=cut.toLowerCase();
    int cut1=0;
    int num=1;
    if(cut.equals("yes"))
    {
      System.out.println("What number of pieces would you like it cut into?");
       num=scan1.nextInt();
       cut1++;
    }
    
    boolean h=true;//
    if(g.equals("yes"))
    {
      h=true;
    } 
    if(g.equals("no"))
    {
      h=false;
    }
    sw1=new Sandwich(a,b,c,d,e,f,h);
    if(cut1>0)
    {
      sw1.cutSw(num);
    }
    System.out.println(sw1);
    } else if(option.equals("chef's choice")||option.equals("chefs choice"))
    {
      sw1=new Sandwich().chefsChoice();
      System.out.println(sw1);
    } else {
      sw1=new Sandwich();
    }
    System.out.println("\nDid you change the sandwich up? ");
    if(!sw1.equals(sw))
    {
      System.out.print("It's a different sandwich!");
    } else if(sw1.equals(sw)) {
      System.out.print("It's the same type...");
    }
  }
}