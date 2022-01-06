public class MethodDome02 {
    public static void main(String[] args) {
        isEvenNumber(5,6);
    }
    // 定义格式
    /*
        public static 数据类型 方法名（）{
            return 数据；
            }
     */
    public static int isEvenNumber(int a,int b){
        int max;
        System.out.println((max=a>b?a:b));
        return max;
    }
}
