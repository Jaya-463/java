public class student {
    String name;
    int age;
    student(){

    }

    public void printInf(){
      System.out.println(this.name);
      System.out.println(this.age);
    }
   
    student(student s2){
        //System.out.println("jaya im");
    this.age=s2.age;
    this.name=s2.name;
}
    public static void main(String[] args){
    student student1=new student();
        student1.name="Jaya";
        student1.age=22;
       student s2 =new student(student1);
        s2.printInf();
    }
    
}
