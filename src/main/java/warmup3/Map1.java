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



}
