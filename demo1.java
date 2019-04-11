package org.uxfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list2.add("d");
        list2.add("e");
        list2.add("f");

        map.put("aaa", list1);
        map.put("bbb", list2);

        List<String> aaa = map.get("aaa");
        List<String> bbb = map.get("bbb");

        aaa.addAll(bbb);

        System.out.println(map);
        System.out.println(aaa);
        System.out.println(bbb);

    }

    public void test1() {

        Map<String, String> map = new HashMap<>();
        map.put("aaa", "aaa");

        String s1 = map.get("aaa");
        s1 = s1 + "!!!!!";

        System.out.println(map);

    }

}
