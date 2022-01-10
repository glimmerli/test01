public class Student {
   //成员变量
    private String name;
    private int age;
    //无参构造方法
    public Student() {
        //有参构造方法
    }
    public Student(String name,int age){
        this.age=age; 
        this.name=name;
        }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
