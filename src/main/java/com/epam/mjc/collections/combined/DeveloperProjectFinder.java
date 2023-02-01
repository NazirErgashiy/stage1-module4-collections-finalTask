package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> developerProjects = new LinkedList<>();

        Set<String> projectNames = projects.keySet();
        List<String> projectNamesList = new ArrayList<>(projectNames);
        Collection<Set<String>> projectDeveloperNames = projects.values();
        List<Set<String>> projDevNames = new ArrayList<>(projectDeveloperNames);

        for (int i = 0; i < projectNamesList.size(); i++) {
            Set<String> currentSet = projDevNames.get(i);
            if (currentSet.contains(developer)) {
                if (!developerProjects.contains(projectNamesList.get(i))) {
                    developerProjects.add(projectNamesList.get(i));
                }
            }
        }

        return developerProjects;
    }
}
