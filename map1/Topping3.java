import java.util.HashMap;
import java.util.Map;

public class Topping3 {
    public static Map<String, String> topping3(Map<String, String> map) {
  if(map.containsKey("potato")) map.put("fries",map.get("potato"));
  if(map.containsKey("salad")) map.put("spinach",map.get("salad"));
  return map;
}
public static void main(String[] args) {
         Map<String, String> myMap = new HashMap<>();
        myMap.put("potato", "ketchup");
        System.out.println(Topping3.topping3(myMap));
}
}
