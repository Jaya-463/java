public class Stringexample {
    static String greet(){
        String greeting="How are you";
        return greeting;
} 
static String mygreet(String greet){
    String message="love me";
    return message;
}   
    public static void main(String[] args) {
        String message=greet();
        System.out.println(message);

        String message =mygreet();
    }
    
}
