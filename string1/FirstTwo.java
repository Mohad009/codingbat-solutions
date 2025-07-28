public class FirstTwo {
    public static String firstTwo(String str) {
    if(str.length()<=1) return str;
  else return str.substring(0,2);
}
public static void main(String[] args) {
    System.out.println(FirstTwo.firstTwo("Ahmed"));
}
}
