import java.util.Scanner;

class Classadd {
   int a,b;
   void getdata(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:-");
    a=sc.nextInt();
    System.out.println("Enter second number:-");
    b=sc.nextInt();
    sc.close();
   }void setdata(){
    System.out.println("Addition:-"+(a+b));
   }
}class demo{
   public static void main(String[] args) {
    Classadd obj=new Classadd();
    obj.getdata();
    obj.setdata();
   }
}