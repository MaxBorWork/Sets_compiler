package by.borisevich.compiler.model;

import java.util.*;

public class Variables {
    private int depth = -1;
    private List<HashMap<String, String>> hashMap = new LinkedList<>();
    private Map<String, String> totalHashMap = new HashMap<>();

    public void increase() {
        depth++;
        hashMap.add(new LinkedHashMap<String, String>());
    }

    public void decrease() {
        depth--;
        for (String s : hashMap.get(depth + 1).keySet())
            totalHashMap.remove(s);
        hashMap.remove(depth + 1).clear();
    }

    public void put(String key, String value) {
        hashMap.get(depth).put(key, value);
        totalHashMap.put(key, value);
    }

    public String get(String key) {
        return totalHashMap.get(key);
    }
}
