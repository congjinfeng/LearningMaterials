package CollectionStudyDemo.SetStudyDemo.LinkedSetStudyDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author cong
 * @version 1.0
 * @ClassName: HashSetDemo01
 * @Descrip:非线程安全，插入有序，唯一性(依赖两个方法：hashCode()和equals())，底层是哈希表和链表(链表保证有序，哈希表保证唯一)。
 * @since 2019/8/27 14:53
 */
public class LinkListedSetDemo01 {
    public static void main(String[] args) {
        Set sets = new LinkedHashSet();
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
