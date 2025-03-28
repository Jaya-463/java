import java.util.*; 
class calculators {


    public static void main (String[]args){
        int ans=sum2();
        System.out.println(ans);
        int anss=sum3(2, 2);
        System.out.println(anss);
    
    }
    static int sum3(int a,int b){
        int sum=a+b;
    }
    //return value
    static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        int num1=sc.nextInt();
        System.out.print("Enter secnd number");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
        sc.close();
        return sum;

    }
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        int num1=sc.nextInt();
        System.out.print("Enter secnd number");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
        sc.close();
    }
    
}


