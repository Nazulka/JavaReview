package warmup3;

//Java Map API
//// Make a new empty map
//Map<String, String> map = new HashMap<String, String>();
//map.get(key) -- retrieves the stored value for a key, or null if that key is not present in the map.
//
//map.put(key, value) -- stores a new key/value pair in the map. Overwrites any existing value for that key.
//
//map.containsKey(key) -- returns true if the key is in the map, false otherwise.
//
//map.remove(key) -- removes the key/value pair for this key if present. Does nothing if the key is not present.

public class Map1 {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String value = map.get("a");
            map.put("a", "");
            map.put("b", value);
        } return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            String aValue = map.get("a");
            map.put("b", aValue);
            map.remove("c");
        } else {
            map.remove("c");
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aa = map.get("a");
            String bb = map.get("b");
            map.put("ab", aa+bb);
        }return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        } return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            String aValue = map.get("ice cream");
            map.put("yogurt", aValue);
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            String potatoKey = map.get("potato");
            map.put("fries", potatoKey);
        }
        if (map.containsKey("salad")) {
            String saladKey = map.get("salad");
            map.put("spinach", saladKey);
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");

            if (aVal != null && aVal.equals(bVal)) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) return map;
        if (map.containsKey("a")) {
            String aVal = map.get("a");
            map.put("b", aVal);
        }
        else if (map.containsKey("b")) {
            String bVal = map.get("b");
            map.put("a", bVal);
        }
        return map;
    }






}
