import java.util.HashMap;
import java.util.Map;

public class MapAB4 {
    public static Map<String, String> mapAB4(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
      String avalue = map.get("a");
      String bvalue = map.get("b");
    if(avalue.length()==bvalue.length())
      {  map.put("a","");
        map.put("b","");
      }
  else if(avalue.length()>=bvalue.length())
  {map.put("c",avalue);}
  
  else {map.put("c",bvalue);}
  }
  return map;
}
public static void main(String[] args) {
         Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "aa");
        myMap.put("b", "bbb");
    System.out.println(MapAB4.mapAB4(myMap));
}
}
