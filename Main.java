public class Main{
    public static void main(String[] args){
        int[] arr={2,4,6,5};
        int a=10;
        String name="Kunal Kushwaha";
        String name2="Kunal Kushwaha";
        String c=name;
        System.out.println(c==name);
        //System.out.println(name==name2);
        String obj =new String("Kunal");
        String obj1=new String("Kunal   ");
        System.out.println(obj==obj1);
        System.out.println(obj.equals(obj1));
    }
}