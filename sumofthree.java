import java.util.*;
public class sumofthree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        double first=sc.nextDouble();
        System.out.print("enter second number");
        double second=sc.nextDouble();
        System.out.print("enter third number");
        double third=sc.nextDouble();
        double percentage=(first+second+third)/3;
        double cgpa=percentage/9.5;
        System.out.printf("Yor cgpa %.2f%%\n",cgpa);
        sc.close();

    }

    
}
