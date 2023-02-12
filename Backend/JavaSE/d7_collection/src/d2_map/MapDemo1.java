package d2_map;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
//        Map<String,Integer> maps = new HashMap<>();
        Map<String,Integer> maps = new LinkedHashMap<>();
        maps.put("NIKE",10);
        maps.put("APPLE",10);
        maps.put("ADIDAS",10);
        maps.put("PEEK",10);
        maps.put("NIKE",10);
        maps.put(null,null);
        System.out.println(maps);
        //2、清空集合
//        maps.clear();
        System.out.println(maps);

        //3、判断集合是否为空
        System.out.println(maps.isEmpty());

        //4、根据键获取对应的值
        System.out.println(maps.get("NIKE"));

        //5、根据键删除整个元素,删除键会返回对应的值
        System.out.println(maps.remove("APPLE"));

        //6、判断是否包含某个键
        System.out.println(maps.containsKey("PEEK"));

        //7、判断是否包含某个值
        System.out.println(maps.containsValue(10));

        //8、获取全部键的集合，返回一个Set集合，因为Map集合和Set集合的特点是一样的
        Set<String> strings = maps.keySet();
        strings.removeIf(s->Objects.isNull(s));
        System.out.println(strings);

        //9、获取所有值的集合,返回的是Collection集合不是Set集合，因为怕值出现一样的时候用Set会出现值的丢失,所以使用Collection集合
        Collection<Integer> values = maps.values();
        System.out.println(values);

        //10、集合大小
        System.out.println(maps.size());
        //11、合并集合
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("1",1);
        hashMap.put("12",12);
        hashMap.put("13",13);

        maps.putAll(hashMap);

        System.out.println(maps);

        maps.forEach((k,v)-> System.out.println(k+"->"+v));


    }
}
