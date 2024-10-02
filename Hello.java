public class Hello extends Thread {
    @Override
    public void run() {
        for( ; ; ) {
            System.out.println("Hello From Thread");
        }
    }
}
