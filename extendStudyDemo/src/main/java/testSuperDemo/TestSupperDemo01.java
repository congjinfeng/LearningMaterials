package main.java.testSuperDemo;

/**
 * @author cong
 * @version 1.0
 * @ClassName: TestSupperDemo01
 * @Descrip:
 * @since 2019/8/28 15:42
 */
public class TestSupperDemo01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSchool("清华大学");
        student.setClassNo("软件1505");
        student.setName("张三");
        student.setAge("15");
        student.setHeight("188");
        System.out.println(student.toString());
    }
}
