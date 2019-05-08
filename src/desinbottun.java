import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class desinbottun {
    static int num = 1;
    public static void main(String[] args) {
        // 初始化一个frame
        Frame frame = new Frame("my frame");
        // 设置大小
        frame.setSize(300, 200);
        // 设置位置
        frame.setLocation(100, 100);
        // 设置布局管理
        frame.setLayout(new FlowLayout());
        // 添加一个按钮
        Button btn = new Button("按钮");
        frame.add(btn);
        frame.setVisible(true);
        // 添加事件监听器 监听窗口事件
        // 通过继承WindowAdapter(适配器）来实现WindowListener
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().dispose();
            }
        });
        // 为按钮添加事件  鼠标事件 事件源是按钮
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 鼠标单击了
                // 获得事件源 btn
                Button btn = (Button) e.getComponent();
                // 获得 btn 所在的容器 frame
                Frame fame = (Frame) btn.getParent();
                // 添加一个新的 btn
                Button newBtn = new Button("按钮" + num++);
                frame.add(newBtn);
                // 刷新frame的显示
                frame.setVisible(true);
                // 为mewBtn 添加事件
                newBtn.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        Button btn = (Button) e.getComponent();
                        btn.getParent().remove(btn);
                    }
                });
            }
        });
    }
}
