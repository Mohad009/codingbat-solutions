public class SumLimit {
    public static int sumLimit(int a, int b) {
  int result=a+b;
  String str1=String.valueOf(result);
  String str2=String.valueOf(a);;
  if(str1.length()==str2.length()) return a+b;
  else if(str1.length()>str2.length()) return a;
  else return a+b;
}
public static void main(String[] args) {
    System.out.println(SumLimit.sumLimit(8,1));
}
}
