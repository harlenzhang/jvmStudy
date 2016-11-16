/**
 * Created by harlenzhang on 2016/11/16.
 */
public class FinalizeObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("invoke finalize");
    }
}
