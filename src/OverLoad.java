public class OverLoad {
    //方法重载
    /*
        多个方法在同一个类中
        多个方法具有相同的方法名
        多个方法的参数，类型，数量不同


     */
    public static void main(String[] args) {
    int result1=sum(5,6);
        System.out.println(result1);
    double result2 =sum(2.0,3.1);
        System.out.println(result2);
   int resule3= sum(5,6,7);
        System.out.println(resule3);
    }

    //求两个Int类型的数据和的方法
    public static int sum(int a, int b) {
        return a + b;
    }

    //求两个double类型的数据和的方法
    public static double sum(double a, double b) {
        return a + b;
    }

    // 求三个Int类型的数据和的方法
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
