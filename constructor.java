public class constructor {
    double r,h;
 public constructor(double r,double h){
    this.r=r;
    this.h=h;
 }
 void demo(){
    System.out.println(2*3.14*r*(r+h));
    double volume=3.14*r*r*h;
    System.out.println(volume);

 }

 public static void main(String[] args){
      constructor obj=new constructor(5,6);
      obj.demo();
 }

 
}
