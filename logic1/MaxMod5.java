public class MaxMod5 {
    public static int maxMod5(int a, int b) {
  int r1=a%5;
  int r2=b%5;
  if(a>b&& r1==r2) return b;
  else if(b>a&& r1==r2) return a;
  else if(a>b) return a;
  else if(a==b) return 0;
  return b;
}
public static void main(String[] args) {
    System.out.println(MaxMod5.maxMod5(6, 2));
}
}
