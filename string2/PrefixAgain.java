public class PrefixAgain {
    public static boolean prefixAgain(String str, int n) {
  String p=str.substring(0,n);
  for(int i=n; i<=str.length()-n;i++){
    if(str.substring(i,i+n).equals(p)) return true;
  }
  return false;
}
public static void main(String[] args) {
    System.out.println(PrefixAgain.prefixAgain("abXYabc", 3));
}
}
