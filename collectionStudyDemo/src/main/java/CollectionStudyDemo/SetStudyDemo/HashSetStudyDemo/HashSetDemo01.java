package CollectionStudyDemo.SetStudyDemo.HashSetStudyDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author cong
 * @version 1.0
 * @ClassName: HashSetDemo01
 * @Descrip:非线程安全，无序的，唯一性(依赖两个方法：hashCode()和equals())，底层是哈希表。
 * @since 2019/8/27 14:53
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        Set sets = new HashSet();
        sets.add("阿里");
        sets.add("腾讯");
        sets.add("网易");
        sets.add("百度");
        sets.add("今日头条");
        getSetListByForEach(sets);
        getSetListByIterator(sets);
    }

    //    遍历Set
    public static void getSetListByForEach(Set<String> lists) {
        System.out.println("使用for-each遍历");
        for (String temp : lists) {
            System.out.println(temp);
        }
    }

    public static void getSetListByIterator(Set<String> lists) {
        System.out.println("使用迭代器遍历");
        Iterator iterator = lists.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
