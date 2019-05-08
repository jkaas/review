public class sfirstb {
    public static void main(String[] args) {
        StringBuffer sbn = new StringBuffer("Hello world and happy new year");
        StringBuffer ss = new StringBuffer("");
        String s = sbn.toString();
        String[] sb = s.split(" ");
        for (int i = 0; i < sb.length; i++) {
            sb[i] = sb[i].substring(0,1).toUpperCase() + sb[i].substring(1);
        }
        for (int i = 0; i < sb.length; i++) {
            ss.append(sb[i]);
            ss.append(" ");
        }
        System.out.println(ss);
    }
}
