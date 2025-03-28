import java.util.Scanner;

public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sortarr=true;
        for(int i=0;i<n-1;i++){

        if(arr[i]>arr[i+1]){
            sortarr =false;
            break;
        }
    }
        if(sortarr){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Arry is not sorted");
        }
    sc.close();

    }
    
}

