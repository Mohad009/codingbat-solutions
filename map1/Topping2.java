import java.util.HashMap;
import java.util.Map;

public class Topping2 {
    public static Map<String, String> topping2(Map<String, String> map) {
  if(map.containsKey("ice cream")) map.put("yogurt",map.get("ice cream"));
  if(map.containsKey("spinach")) map.put("spinach","nuts");
  return map;
}
public static void main(String[] args) {
         Map<String, String> myMap = new HashMap<>();
        myMap.put("ice cream", "candy");
    System.out.println(Topping2.topping2(myMap));
}
}
