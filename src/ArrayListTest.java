import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        Student s1= new Student("林青霞", 30);
        Student s2= new Student("林青", 10);
        Student s3= new Student("林", 20);
        //添加
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //遍历
        for(int i=0;i<array.size();i++) {
            Student s = array.get(i);
            System.out.println(s.getName()+"   "+s.getAge());
        }
        }


}
