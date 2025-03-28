import java.util.Scanner;

public class arr {
    public static void main(String[] args){
         float [] num=new float[5];
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter float number");
         for(int i=0;i<5;i++){
            num[i]=sc.nextFloat();

         }
         float sum =0;
         System.out.println("sum of array");
         for(int i=0;i<5;i++){
            sum=sum+num[i];
         }
         System.out.println("sum"+sum);
         sc.close();
    }
    
}
