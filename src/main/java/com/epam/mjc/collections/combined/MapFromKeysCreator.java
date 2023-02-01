package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Set<String> keys = sourceMap.keySet();
        List<String> listKeys = new ArrayList<>(keys);

        List<Integer> integerList = new ArrayList<>();
        List<Set<String>> days = new ArrayList<>();
        Map<Integer, Set<String>> mainMap = new HashMap<>();
        for (int i = 0; i < listKeys.size(); i++) {
            if (!integerList.contains(listKeys.get(i).length())) {
                integerList.add(listKeys.get(i).length());
                Set<String> a = new HashSet<>();
                a.add(listKeys.get(i));
                days.add(a);

            }
        }
        for (int m = 0; m < days.size(); m++) {
            Set<String> currentSet = days.get(m);
            for (int k = 0; k < listKeys.size(); k++) {
                if (listKeys.get(k).length() == integerList.get(m)) {
                    currentSet.add(listKeys.get(k));
                    days.remove(m);
                    days.add(m, currentSet);
                }
            }
        }
        for (int i = 0; i < days.size(); i++) {
            mainMap.put(integerList.get(i), days.get(i));
        }
        return mainMap;
    }
}
