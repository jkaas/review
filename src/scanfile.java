import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class scanfile {
    public static void main(String[] args) {
        //创建一个File对象 封装路径 d：
        File die = new File("C:\\Users\\73946\\IdeaProjects\\review\\src");
        //创建一个List集合用于存放路径
        List<String> list = new ArrayList<String>();
        //调用方法
        listAllJavaFiles(die, list);
        //输出
        for(String filename : list)
            System.out.println(filename);
    }
    static void listAllJavaFiles(File dir, List<String> list) {
        //获得 dir 目录中所有的文件
        File[] files = dir.listFiles();
        // 如果数组为null说明dir是不可打开的目录或者不是目录
        if(files == null) {
            return;
        }
        //遍历数组 获得子文件
        for(File file : files) {
            //判断
            if(file.isDirectory()) {
                //说明文件是目录  需要递归
                listAllJavaFiles(file, list);
            } else {
                // 说明是标准文件
                // 判断是不是java文件，如果是存入list
                if(file.getName().endsWith(".java")) {
                    list.add(file.getAbsolutePath());
                }
            }
        }
    }
}
