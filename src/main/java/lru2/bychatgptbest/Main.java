package lru2.bychatgptbest;

public class Main {

    public static void main(String[] args) {

        LRUCache<Integer, String> cache = new LRUCache<>(2);

        cache.put(1, "Val1");
        cache.put(2, "Val2");
        cache.put(3, "Val3");
        cache.put(4, "Val4");

        String str1 = cache.get(1); // value1 == 1
        String str2 = cache.get(2); // value2 == 2

        if(null == str1){
            cache.put(1, "Val1");
        }

        System.out.println(cache.get(1));
        System.out.println(str2);
    }
}
