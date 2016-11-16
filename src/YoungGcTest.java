import java.util.ArrayList;

/**
 * Created by harlenzhang on 2016/11/16.
 */
public class YoungGcTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<BigObject> objectList = new ArrayList<>();
        while (true){
            Thread.currentThread().sleep(500);
            BigObject object = new BigObject();
            objectList.add(object);
            System.out.println(objectList.size());
        }
    }
}
