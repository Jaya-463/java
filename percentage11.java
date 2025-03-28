import java.util.*;
public class percentage11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first");
        float s1=sc.nextFloat();
        System.out.println("enter second");
        float s2=sc.nextFloat();
        System.out.println("enter third");
        float s3=sc.nextFloat();

        float totalpercent=(s1+s2+s3)/3;
        if(totalpercent>=40 && s1>33 && s2>33 && s3>33){
            System.out.println("passed");
        }
        else{
            System.out.println("fail");
        }



        

    }    
}
