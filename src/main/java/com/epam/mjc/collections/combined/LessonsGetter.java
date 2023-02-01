package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> lessons = new HashSet<>();

        Collection<List<String>> listCollections = timetable.values();

        List<List<String>> stringList = new ArrayList<>(listCollections);

        for (int i = 0; i < stringList.size(); i++) {
            for (int k = 0; k < stringList.get(i).size(); k++) {
                lessons.add(stringList.get(i).get(k));
            }
        }
        System.out.println(lessons);

        return lessons;
    }
}
