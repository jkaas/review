public class FMaxMini {
    public static void main(String[] args) {
        int[] array = {5,10,-8,-2,-500,50,200};
        //最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("数组中最大的数是:" + max);
        //最小数
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("数组中最小的数是: " + min);
    }
}
