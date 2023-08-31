package pro.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private final Map<String, TreeType> cache = new HashMap<>();

    TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;

        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            TreeType treeType = new TreeType(name, color, texture);
            cache.put(key, treeType);
            return treeType;
        }
    }
}