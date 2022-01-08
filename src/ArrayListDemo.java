import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
       /* //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        //创建学生对象把信息录入
        Student s = new Student();
        s.setAge(age);
        s.setName(name);
        //添加到集合中

        array.add(s);
        */
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for(int i=0 ;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName() +""+s.getAge());
        }
    }

    //创建一个方法 到达复用
        /*两个明确
            返回值类型  void   集合是个引用类型 在方法中改变外面的也会改变
            参数 ArrayList<Student> array
          */
        public static void addStudent(ArrayList<Student> array){
             //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        //创建学生对象把信息录入
        Student s = new Student();
        s.setAge(age);
        s.setName(name);
        //添加到集合中

        array.add(s);
        }
}
