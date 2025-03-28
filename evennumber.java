import java.util.Scanner;

public class evennumber {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n= sc.nextInt();
    System.out.println("sum of even number");
    int i=1,sum=0;
    while(i<=n){
        if(n%2==0){
            sum =sum+i;
        

        }
        i++;
    }
    System.out.println(sum);
    sc.close();
    }
    
}
