import java.util.Scanner;

public class Cyllendra {
    double r,h;
    void getradius(){
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter Rdius"));
        r=sc.nextDouble();
        System.out.println("Enter Height");
        h=sc.nextDouble();
        sc.close();
    }void calculate(){
        System.out.println(2*3.14*r*(r+h));
        double volume=3.14*r*r*h;
        System.out.println(volume);
    }
    public static void main(String[] args) {
        Cyllendra obj= new Cyllendra();
        obj.getradius();
        obj.calculate();
    }
}
