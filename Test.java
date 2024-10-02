public class Test {
    public static void main(String args[]) {
        Hello hello = new Hello();
        Thread t1 = new Thread(hello);
        t1.start();
        
        for(; ;){
            System.out.println("Hello from main");
        }
    }
}