import java.util.HashMap;
import java.util.Map;

public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")){
    map.put("ab",map.get("a")+map.get("b"));
    return map;
  }
  return map;
}
public static void main(String[] args) {
         Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "Hello");
        myMap.put("b", "Friend");
    System.out.println(MapAB.mapAB(myMap));
}
}
