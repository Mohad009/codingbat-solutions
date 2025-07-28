public class FirstHalf {
    public static String firstHalf(String str) {
  if(str.length()<=1) return str;
  else return str.substring(0,str.length()/2);
}
public static void main(String[] args) {
    System.out.println(FirstHalf.firstHalf("Gigabyte"));
}
}
