import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock FairLock = new ReentrantLock(true);

    public void accessResource() {
        FairLock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " Acquired the lock ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            FairLock.unlock();
            System.out.println(Thread.currentThread().getName() + " Released the lock");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FairLockExample example = new FairLockExample();

        Runnable task = new Runnable() {
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");
        Thread thread3 = new Thread(task, "thread3");

        thread1.start();
        Thread.sleep(80);
        thread2.start();
        Thread.sleep(80);
        thread3.start();
    }
}