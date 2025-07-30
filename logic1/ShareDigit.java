public class ShareDigit {
    public static boolean shareDigit(int a, int b) {
  int l1=a/10;
  int l2=b/10;
  int r1=a%10;
  int r2=b%10;
  
  return l1==l2 || r1==r2 || l1==r2 || l2==r1;
  
}
public static void main(String[] args) {
    System.out.println(ShareDigit.shareDigit(12,44));
}
}
