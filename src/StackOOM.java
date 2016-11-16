/**
 * Created by harlenzhang on 2016/11/16.
 */
public class StackOOM {
    static int count = 0;
    public static int calculate(int n) throws InterruptedException {
        if (n == 1){
            return n;
        }else{
                Thread.currentThread().sleep(1000);
            count ++;
                System.out.println(count);
            return calculate(n-1)+2;
        }


    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println(calculate(20000));

    }
}
