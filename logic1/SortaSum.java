public class SortaSum {
    public static int sortaSum(int a, int b) {
  if(a+b>=10 &&a+b<=19) return 20;
  else return a+b;
}
public static void main(String[] args) {
    System.out.println(SortaSum.sortaSum(5, 9));
}
}
