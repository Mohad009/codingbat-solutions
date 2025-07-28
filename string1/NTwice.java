public class NTwice {
    public static String nTwice(String str, int n) {
  return str.substring(0,n) +
         str.substring(str.length()-n,str.length());
}
public static void main(String[] args) {
    System.out.println(NTwice.nTwice("Chocolate", 3));
}
}
