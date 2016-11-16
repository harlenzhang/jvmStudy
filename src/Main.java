import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        String temp = "hello";
        Executor executor = Executors.newFixedThreadPool(10);
        while(true){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    FinalizeObject object = new FinalizeObject();
                    System.out.println(Thread.currentThread().getId());
                }
            });
        temp = temp + "test";
            String s = temp.intern();
        }
    }
}
