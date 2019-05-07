import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class addList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zhangsan");
        list.add("wangwu");
        list.add("zhaoliu");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object object = (Object) it.next();
            System.out.println(object);
        }
    }
}
