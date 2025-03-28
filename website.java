import java.util.*;
public class website {

    public static void main(String[] args){
        String url;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter url");
        url=sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This is commercial");

        }
        else if(url.endsWith(".in")){
            System.out.println("sigmet");
        }
        sc.close();



    }
    
}
