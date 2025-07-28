public class MinCat {
    public static String minCat(String a, String b) {
  if(a.length()>b.length()) {
    String acut=a.substring(a.length()-b.length());
    return acut+b;
  }else{
        String bcut=b.substring(b.length()-a.length());
    return a+bcut;
  }

}
public static void main(String[] args) {
    System.out.println(MinCat.minCat("Hello", "World"));
}
}
