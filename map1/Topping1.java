import java.util.HashMap;
import java.util.Map;

public class Topping1 {
    public static Map<String, String> topping1(Map<String, String> map) {
   map.put("bread","butter");
  if(map.containsKey("ice cream")) map.put("ice cream","cherry");
  return map;
}
public static void main(String[] args) {
         Map<String, String> myMap = new HashMap<>();;
    System.out.println(Topping1.topping1(myMap));
}
}
