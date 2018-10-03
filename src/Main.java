public class Main {
    public static void main(String[] args) {

        //Thread variant
        Thread1 thread1 = new Thread1();
        //Runnable variant
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.run();


        System.out.println(Thread.currentThread());
        System.out.println("Done!");
    }
}
