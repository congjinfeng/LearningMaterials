package Chapter1.Demo01;

public class TestExtends01 {
    
    public static void main(String[] args) {
       Children children=new Children();
       children.method1();                  //子类重新了父类方法，通过子类对象调用的是子类方法
       children.method1(1,1);           //子类重载了父类中的方法，父类中并没有该方法，通过子类调用的是子类的方法
       children.method2();                  //子类继承了父类的方法，子类没有重写这个方法，通过子类调用的是父类中的方法
       children.method2(1,1);           //子类重载了父类中的方法，父类中并没有该方法，通过子类调用的是子类的方法
       children.method3();                  //子类特有的方法，通过子类调用的是子类的方法
       System.out.println(children.name);   //成员变量不存在覆盖之类的，程序调用的时候，如果子类有同名的就调用子类的，子类没有同名的就调用父类的
       System.out.println(children.age);    //成员变量不存在覆盖之类的，程序调用的时候，如果子类有同名的就调用子类的，子类没有同名的就调用父类的
    }
    
}
