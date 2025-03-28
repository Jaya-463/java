import java.util.*; 
public class odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr a number");
        int n=sc.nextInt();
        System.out.println("eneter natural odd number");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i+" ");
            }

        }
        sc.close();

    }
    
}
