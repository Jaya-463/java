import java.util.Scanner;

public class duplicate {
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
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==find){
                System.out.println(find+"present in arr");
                found=true;
                break;
            }if(found==true){

            System.out.println("not present");
            }
            else{
                System.out.println("number is repeated");6
              
            }
            sc.close();
        }
    }
    
}
