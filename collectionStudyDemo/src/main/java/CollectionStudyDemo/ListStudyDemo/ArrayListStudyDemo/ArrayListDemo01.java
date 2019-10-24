package CollectionStudyDemo.ListStudyDemo.ArrayListStudyDemo;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author cong
 * @version 1.0
 * @ClassName: ArrayListDemo01
 * @Descrip:非线程安全，有序的，可重复，底层是数组实现,查询快，增删慢。
 * @since 2019/8/27 14:17
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList();
        lists.add("中国");
        lists.add("美国");
        lists.add("英国");
        lists.add("法国");
        lists.add("德国");
        getAllListByIndex(lists);
        getAllListByForEach(lists);
        getAllListByIterator(lists);
    }

    // 遍历ArrayList
    public static void getAllListByIndex(List lists) {
        System.out.println("使用for循环遍历");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }

    public static void getAllListByForEach(List<String> lists) {
        System.out.println("使用for-each遍历");
        for (String temp : lists) {
            System.out.println(temp);
        }
    }

    public static void getAllListByIterator(List<String> lists) {
        System.out.println("使用迭代器遍历");
        Iterator iterator = lists.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
