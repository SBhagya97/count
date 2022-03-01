import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map =new java.util.HashMap<>();

        map.put("a",10);
        map.put("b",20);
        map.put("c",30);

        System.out.println("size of map is:"+map.size());
        System.out.println(map);
    }
}
