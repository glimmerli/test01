public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();
    }
    //方法格式
/*    public static void 方法名(){

   }
   */
    //方法 判断数据是否为偶数
    public static void isEvenNumber (){
        int number =10;
        //判断
        if(number%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("基数");
        }
    }
}
