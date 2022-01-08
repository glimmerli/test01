public class StringBuilderDemoConvert {
    public static void main(String[] args) {


        //StringBuilder 转换为 String
        //通过 toString()  可以把StringBuilder 转换成String
/*        StringBuilder sb=new StringBuilder();
        sb.append("hello world");
        //StringBuilder 转换为 String

        String s = sb.toString();
        System.out.println(s);
*/
        //String 转换成 StringBuilder
        // public StringBuilder(String s);  通过构造方法实现
        String s="hello";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);


    }




}


