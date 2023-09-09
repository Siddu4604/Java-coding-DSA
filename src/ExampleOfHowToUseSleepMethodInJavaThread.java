public class ExampleOfHowToUseSleepMethodInJavaThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                //The printStackTrace() method in Java is a tool used to handle exceptions and errors.
                // It is a method of Java's throwable class which prints the throwable along with other
                // details like the line number and class name where the exception occurred.
            }
            System.out.println("Thread woke up!");
        });
        t.start();
        System.out.println("Doing some other work..");
        t.join();
        //Thread class provides the join() method which allows one thread to wait until another thread completes its execution.
        // If t is a Thread object whose thread is currently executing, then t. join() will
        // make sure that t is terminated before the next instruction is executed by the program.
        System.out.println("Thread finished");
    }
}
