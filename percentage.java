import java.util.*;
public class percentage{
    public static void main(String[] args){
        int total =0,subject=5;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.print("Enter use marks"+i+":");
            total +=sc.nextInt();
        }
        sc.close();
        int maxMarks =subject*100;
        double percentage=(total/(double)maxMarks)*100;

        System.out.println("\nTotal Marks"+total);
        System.out.println("percentage:"+percentage +"%");
    } 
}