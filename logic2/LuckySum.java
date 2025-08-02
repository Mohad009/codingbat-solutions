public class LuckySum {
    public static int luckySum(int a, int b, int c) {
  if(a==13) return 0;
  else if(a==13  && c==13) return 0;
  else if(b==13 && a!=13) return a;
  else if(c==13 &&a!=13 &&b!=13) return a+b;

  return a+b+c;
}
public static void main(String[] args) {
    System.out.println(LuckySum.luckySum(1,13,3));
}
}
