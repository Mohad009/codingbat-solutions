public class LastTwo {
    public static String lastTwo(String str) {
  if(str.length()==0) return str;
  if(str.length()<2) return str;
  String last2=str.substring(str.length()-2);
  String swap=str.substring(0,str.length()-2)+
  last2.substring(1)+last2.substring(0,1);
  return swap;
}
public static void main(String[] args) {
    System.out.println(LastTwo.lastTwo("Pretty"));
}
}
