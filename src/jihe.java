import java.util.Enumeration;
import java.util.Properties;

public class jihe  {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("username", "zhangsan");
        props.setProperty("password", "123456");
        props.setProperty("email", "zhangsan@itcast.cn");
        Enumeration e = props.propertyNames();
        while(e.hasMoreElements()) {
            String name = (String) e.nextElement();
            String value = props.getProperty(name);
            System.out.println(name + "=" + value);
        }
    }
}
