package MapStudyDemo.HashMapStudyDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author cong
 * @version 1.0
 * @ClassName: HashMapDemo01
 * @Descrip:线程不安全，底层是哈希表，无序
 * @since 2019/8/27 15:29
 */
public class HashMapDemo01 {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap();
        maps.put("省份", "江苏");
        maps.put("城市", "南京");
        maps.put("区域", "雨花台区");
        maps.put("街道", "铁心桥街道");
        maps.put("小区", "春江佳园");
        getMapsByEntrySet(maps);
        getMapsByKeySet(maps);
    }

    //    遍历Map
    public static void getMapsByEntrySet(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
    
    public static void getMapsByKeySet(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println(map.get(key));
        }
        for (String value : map.values()) {
            System.out.println("value = " + value);
        }
    }

    public static void getMapsByIterator(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }

   /* public static void getLambda(Map<String, String> map) {
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }*/
}
