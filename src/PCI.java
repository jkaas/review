public interface PCI {
    void start();
    void stop();
}
// 显卡
class Graphics implements PCI {

    public void start() { System.out.println("显卡已开启");
    }

    public void stop() {
        System.out.println("显卡已停止");
    }
}
// 网卡
class NetworkCard implements PCI {

    public void start() {
        System.out.println("网卡已开启");
    }

    public void stop() {
        System.out.println("网卡已停止");
    }

}
// 声卡
class SoundCard implements PCI {

    public void start() {
        System.out.println("声卡已开启");
    }

    public void stop() { System.out.println("声卡已停止");
    }

}
// 主板
class MainBoard {
    public void PCICardStart(PCI p) {
        p.start();
    }
    public void PCICardStop(PCI p) {
        p.stop();
    }
}
// 电脑
class Computer {
    private PCI[] pciArr = new PCI[4]; // 电脑上的PCI插槽

    public void add(PCI usb) { // 向电脑上安装一个PCI设备
        for (int i = 0; i < pciArr.length; i++) { // 循环遍历所有插槽
            if (pciArr[i] == null) { // 如果发现一个空的
                pciArr[i] = usb; // 将usb设备装在这个插槽上
                break; // 装上之后结束循环
            }
        }
    }
    public void turnOn() { // 电脑的开机功能
        for (int i = 0; i < pciArr.length; i++) { // 循环遍历所有插槽
            if (pciArr[i] != null) { // 如果发现有设备
                pciArr[i].start(); // 将PCI设备启动
            }
        }
        System.out.println("电脑开机成功");
    }
    public void turnOff() { // 电脑的关机功能
        for (int i = 0; i < pciArr.length; i++) { // 循环遍历所有插槽
            if (pciArr[i] != null) { // 如果发现有设备
                pciArr[i].stop(); // 将PCI设备关闭
            }
        }
        System.out.println("电脑关机成功");
    }
    public static void main(String[] args) {
        Computer c = new Computer();
        c.add(new Graphics());
        c.add(new NetworkCard());
        c.add(new SoundCard());
        c.turnOn();
        c.turnOff();
    }
}

