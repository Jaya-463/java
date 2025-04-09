import java.util.Scanner;

public class method3 {
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double d1,double d2){
        return d1+d2;
    }
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int num1,num2,sum;
         System.out.println("Enter first number");
         num1=sc.nextInt();
         System.out.println("Enter Second number");
         num2=sc.nextInt();
         sum=num1+num2;
         System.out.println("The sum="+sum);
         //for 3 input
         System.out.println("\nEnter three integers to add:");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         System.out.println("Sum of three integers: " + add(a, b, c));
 
         // Using the method that adds two doubles
         System.out.println("\nEnter two decimal numbers to add:");
         double d1 = sc.nextDouble();
         double d2 = sc.nextDouble();
         System.out.println("Sum of two doubles: " + add(d1, d2));
    }

}
