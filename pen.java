//import java.util.*;
public class pen {
    String color;
    String type;
    
    public void write(){
        System.out.println("My name is");
    }
    public void printColor(){
        System.out.println(this.color);
}
public static void main(String[] args){
    pen pen1=new pen();
    pen1.color="blue";
    pen1.type="gel";
    pen1.write();
    pen1.printColor();
    pen pen2 =new pen();
    pen2.color="black";
    pen2.type="Blackpoint";
    pen2.printColor();
}
}
