import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter anumber");
        int n=sc.nextInt();
        System.out.println("factrial of n");
        int fact=1;

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("fac:="+fact);
        sc.close();

    }
    
}
