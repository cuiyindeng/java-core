package com.exercise.core.collection;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Optional;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("c", 4);
        System.out.println(map.get("c"));

        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
        arrayList.add(map);
        Optional<Integer> integer = arrayList.stream()
                .map(mapTmp -> mapTmp
                        .entrySet().stream()
                        .map(entry -> entry.getValue())
                        .reduce(Integer::sum).orElse(0))
                .reduce(Integer::sum);
        System.out.println(integer.get());

//        arrayList.stream().map();
    }
}
