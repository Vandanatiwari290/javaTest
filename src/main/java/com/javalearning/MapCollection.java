package com.javalearning;

import org.apache.commons.collections.map.HashedMap;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
            System.out.println(map);
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "vandana");
        map.put("b", "tiwari");
        map.put("c", "vandu");
        mapBully(map);


    }

}
