public class getfilename {
    public static void main(String[] args) {
        System.out.println(getExtname("Persion.java"));
    }
    public static String getExtname(String filename) {
        int index = filename.lastIndexOf(".");
        String extname = filename.substring(index + 1);
        return extname;
    }
}
