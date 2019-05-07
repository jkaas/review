import java.io.*;

public class copy {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("D:\\666.exe");
        OutputStream out = new FileOutputStream("E:\\666.exe");
        long start = System.currentTimeMillis();
        copyByBuffer(in, out);
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-start) + "毫秒");
        in.close();
        out.close();
    }

    private static void copyByBuffer(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int len;
        while((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
    }

}
