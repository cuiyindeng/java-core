package com.exercise.core.collection;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            hashSet.add(random.nextInt(30));
        }
        Iterator<Integer> iterator = hashSet.iterator();
        iterator.next();
        System.out.println("hashSet" + hashSet);

        Set<Person> treeSet = new TreeSet<>();
        Person person;
        for (int i = 0; i < 10; i++) {
            person = new Person();
            treeSet.add(person);
        }

        for (Person p : treeSet) {

        }
        treeSet.iterator();
        System.out.println("treeSet" + treeSet);
    }
}
