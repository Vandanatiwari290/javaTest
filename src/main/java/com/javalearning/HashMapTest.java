package com.javalearning;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[]args){
        //does not allow duplicate
        //allows null values
        //no guarantee for ordering
        HashMap map=new HashMap();
        map.put("name","Vandana");
        map.put("roll no","4");
        map.put("class","computer science");
        map.put("designation","engineer");
        map.put("job","engineer");
        map.put("salary","");
        map.put("job","engineer");
        System.out.println(map);
        System.out.println((String) map.get("name"));
        System.out.println(map.get("roll no"));
        System.out.println(map.get("salary"));

    }
}
