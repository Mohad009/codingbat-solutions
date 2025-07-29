import java.util.Arrays;

public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
  int asum=a[0]+a[1];
  int bsum=b[0]+b[1];
  if(asum==bsum) return a;
  else if(asum>bsum)return a;
  return b;
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(BiggerTwo.biggerTwo(new int[]{4,6}, new int[]{1,3})));
}
}
