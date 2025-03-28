import java.util.*;
 class car {
  String color;
  String name;
  void getcolor(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter color");
    color=sc.nextLine();
    System.out.println("Enter name");
    name=sc.nextLine();
    sc.close();

  }
  void setdata(){
    System.out.println("color"+color);
    System.out.println("name"+name);
  }

  public static void main(String[] args) {
       
    car c1=new car();
    car c2=new car();
    c1.getcolor();
    c2.getcolor();
    c1.setdata();
    c2.setdata();
    
}
 }