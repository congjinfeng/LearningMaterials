package main.java.testSuperDemo;

/**
 * @author cong
 * @version 1.0
 * @ClassName: Student
 * @Descrip:
 * @since 2019/8/28 15:42
 */
public class Student extends People{
    private String school;
    private String classNo;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", classNo='" + classNo + '\'' +
                '}';
    }
}
