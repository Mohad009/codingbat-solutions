public class BackAround {
    public static String backAround(String str) {
  
  char l=str.charAt(str.length()-1);
  return l+str+l;
}
public static void main(String[] args) {
    System.out.println(BackAround.backAround("Hello"));
}
}
