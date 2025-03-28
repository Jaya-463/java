 import java.util.*;
public class namee {
    public static void main(String[] args){
       int k;
        double convert=0.62137119;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter line kilometer value");
        k=sc.nextInt();
        double mile=(double)k*convert;
        System.out.println("Kilometer to mile:"+mile);
        sc.close();


    }

    
}
