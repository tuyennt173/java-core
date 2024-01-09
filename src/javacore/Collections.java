package javacore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        for(String x : list) {
            System.out.println(x);
        }
        Map<String, String> map = new HashMap<>();
        map.put("test", "value of key test");
        map.put("test 2", "value of key test 2");
        
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        
        Set<String> set = new HashSet<>();
        set.add("Ngo");
        set.add("Trung");
        set.add("Tuyen");
        if(set.contains("Ngo")) {
            System.out.println("Ngo Trung Tuyen");
        }
    }
    
}
