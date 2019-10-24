package Chapter1.Demo01;

/**
 * @author cong
 * @ClassName: TestExtends02
 * @Descrip:
 * @since 2019/10/18 14:20
 */
public class TestExtends02 {
    public static void main(String[] args){
      Parent parent=new Children();


      parent.method1();
      parent.method2();

      System.out.println(parent.name);
      System.out.println(parent.age);


    }
}
