package CollectionStudyDemo.ListStudyDemo.VectorStudyDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author cong
 * @version 1.0
 * @ClassName: VectorDemo01
 * @Descrip:线程安全，有序的，可重复，底层是数组实现，查询快，增删慢。
 * @since 2019/8/27 14:38
 */
public class VectorDemo01 {
    public static void main(String[] args){
        Vector<String> vectors=new Vector();
        vectors.add("中国");
        vectors.add("美国");
        vectors.add("英国");
        vectors.add("法国");
        vectors.add("德国");
        getAllvectorsByIndex(vectors);
        getAllListByForEach(vectors);
        getAllListByIterator(vectors);
    }
    // 遍历ArrayList
    public static void getAllvectorsByIndex(Vector<String> vectors) {
        System.out.println("使用for循环遍历");
        for (int i = 0; i < vectors.size(); i++) {
            System.out.println(vectors.get(i));
        }
    }

    public static void getAllListByForEach(Vector<String> vectors) {
        System.out.println("使用for-each遍历");
        for (String temp : vectors) {
            System.out.println(temp);
        }
    }

    public static void getAllListByIterator(Vector<String> vectors) {
        System.out.println("使用迭代器遍历");
        Iterator iterator = vectors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
