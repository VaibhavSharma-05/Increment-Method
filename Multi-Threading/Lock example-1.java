import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Proceeding with Withdrawl");
                        Thread.sleep(3000); //Simulate time taken to process the wihtdrawal.
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed wihtdrwal . Remaining Balance :  " + balance);

                    } catch (Exception e) {
                    } finally {
                        lock.unlock();
                    }

                }else{
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try again later");
            }
        } catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
