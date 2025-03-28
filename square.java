public class square {
    double side;
    square(double side){
        this.side = side;
    }
    void getarea(){
        System.out.println(side*side);
     
    }
    void perimeter(){
        System.out.println(4*side);

    }
    public static void main(String[] args){
        square obj=new square(6);
        obj.getarea();
        obj.perimeter();

    }
    
}
