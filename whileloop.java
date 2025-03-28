import java.util.Scanner;

public class whileloop {
    
    public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a natural number");
        int n=sc.nextInt();
       System.out.println("natural number is 1 to n");

        int i=1;
        do{
            
            System.out.println(i+"");
            i++;
        }
        while(i<=n);
           sc.close();
        }
    
        
    }
    

