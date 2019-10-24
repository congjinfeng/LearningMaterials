package ArrayAndCollectionStudyDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cong
 * @version 1.0
 * @ClassName: ArrayAndCollectionStudyDemo01
 * @Descrip:
 * @since 2019/8/28 16:45
 */
public class ArrayAndCollectionStudyDemo01 {
    public static void main(String[] args) {
        String[] arrays = {"中国", "美国", "英国", "法国", "澳大利亚"};
        ArrayList<String> lists = new ArrayList();
        lists.add("德国");
        lists.add("印度");
        lists.add("俄罗斯");
        lists.add("意大利");
        lists.add("巴基斯坦");
        /*subList截取List,包含1，不包含3,subList返回的是Arraylist下的一个内部类subList,强转成ArrayList会出现classCastException*/
        List list = lists.subList(1, 3);
        for (Object temp : list) {
            System.out.println(temp);
        }
        System.out.println("------------------------------");
        /*集合转数组，必须使用集合的toArray(array)*/
        String[] arrayTemp = new String[lists.size()];
        lists.toArray(arrayTemp);
        for (String atemp : arrayTemp) {
            System.out.println(atemp);
        }
        System.out.println("------------------------------");
        /*使用Arrays.asList()把数组转List,不能使用其修改集合的方法,add/remove/clear方法会抛出UnsupportedOperationException异常。*/
       List<String> arrayToLists =Arrays.asList(arrays);
       for(String arrayToList:arrayToLists){
           System.out.println(arrayToList);
       }
    }
}
