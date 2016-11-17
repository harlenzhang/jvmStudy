import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by harlenzhang on 2016/11/17.
 */
public class ThreadStack {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(10);
        while (true){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("in thread: " + Thread.currentThread().getId());
                    ThreadSharedObject.getInstance().greeting();
                }
            });
        }
    }
}
