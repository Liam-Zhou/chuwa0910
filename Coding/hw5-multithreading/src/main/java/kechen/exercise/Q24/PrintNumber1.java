package kechen.exercise.Q24;

public class PrintNumber1 {
    private static int n = 1;

    public static void main(String[] args) {
        // 创建了3个thread，并且并发的执行printNumber()
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber(){
        int count = 10;
        while(count-- > 0){
            System.out.println(Thread.currentThread().getName() + ": " + n++);
            try{
                Thread.sleep(1000);  // sleeps for 1 second
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        PrintNumber1.class.notifyAll();
    }
}
