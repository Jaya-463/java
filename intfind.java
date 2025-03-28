import java.util.Scanner;

public class intfind {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter use size of arr");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number that is available in or not");
        int find =sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==find){
                System.out.println(find+"present in arr");
                break;
            }else{
            System.out.println("not present");
            }
            sc.close();
        }
    }
    
}
