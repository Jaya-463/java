public class repeat {
    void repeated( int n1,int n){
        if(n==0){
            return;
        }
        System.out.println(n1);
        
        repeated(n1,n-1);
        


    }
    public static void main(String[] args) {
        repeat obj =new repeat();
        obj.repeated(2, 3);
    }
    
}
