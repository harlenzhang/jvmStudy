/**
 * Created by harlenzhang on 2016/11/17.
 */
public class ThreadSharedObject {

    private static ThreadSharedObject instance;

    private ThreadSharedObject(){

    }
    public static ThreadSharedObject getInstance() {
        synchronized (ThreadSharedObject.class) {
            if (instance == null)
                return new ThreadSharedObject();
            return instance;
        }
    }

    public void greeting(){
        System.out.println("hi, this is shared object between threads");
    }
}
