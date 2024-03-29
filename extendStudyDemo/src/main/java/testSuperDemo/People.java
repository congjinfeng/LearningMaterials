package main.java.testSuperDemo;

/**
 * @author cong
 * @version 1.0
 * @ClassName: People
 * @Descrip:
 * @since 2019/8/28 15:42
 */
public class People {
    private String name;
    private String age;
    private String height;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
