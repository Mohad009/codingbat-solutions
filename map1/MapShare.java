import java.util.HashMap;
import java.util.Map;

public class MapShare {
    public static Map<String, String> mapShare(Map<String, String> map) {
  if(map.containsKey("c")) map.remove("c");
  if(map.containsKey("a")) {
    map.put("b",map.get("a"));
  }
  return map;
}
public static void main(String[] args) {
         Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "aaa");
        myMap.put("b", "aaa");
        myMap.put("c", "a");
    System.out.println(MapShare.mapShare(myMap));
}
}
