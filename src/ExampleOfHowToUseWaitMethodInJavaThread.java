public class ExampleOfHowToUseWaitMethodInJavaThread {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                //wait until the t2 notifies us
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 woke up!");
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (obj) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //notify the thread1
                obj.notify();
            }
        });
        t1.start();
        t2.start();
        //wait for the threads to finish
        t1.join();
        t2.join();
        System.out.println("All threads finished");
    }
}
