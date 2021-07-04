import java.util.*;

public class Array {
    public static void main(String[] args) {
        // Old Hashmaps notes
        HashMap<String, Integer> hashmap = new HashMap<>();
        System.out.println(hashmap);
        // name.put(key, value);
        hashmap.put("terry", 12);
        hashmap.put("david", 12);
        hashmap.put("marcus", 13);
        hashmap.put("mathew teacher", 30);
        System.out.println(hashmap);
        hashmap.remove("mathew teacher");
        System.out.println(hashmap);
        // way to check if something is in the hashmap
        // hashmap.containsKey
        System.out.println(hashmap.containsKey("mathew teacher"));
        System.out.println(hashmap.containsKey("david"));

        // maps do not have duplicate keys
        hashmap.put("david", 30);
        System.out.println(hashmap);

        // to retrieve a value from the map
        // name.get(key)
        System.out.println(hashmap.get("marcus"));
        hashmap.put("david", hashmap.get("terry"));
        System.out.println(hashmap);

        int[] ar = { 1, 2, 1, 3, 3, 4, 2, 1 };
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (counts.containsKey(ar[i])) {
                counts.put(ar[i], counts.get(ar[i]) + 1);

            } else {
                counts.put(ar[i], 1);
            }
        }
        System.out.println(counts);

    }

}
