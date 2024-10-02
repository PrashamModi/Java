public class Test {
    public static void main(String args[]) {
        Hello hello = new Hello();
        hello.start();
        for(; ;){
            System.out.println("Hello from main");
        }
    }
}