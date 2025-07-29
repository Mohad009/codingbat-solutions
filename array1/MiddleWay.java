import java.util.Arrays;

public class MiddleWay {
    public static int[] middleWay(int[] a, int[] b) {
  return new int[]{a[1],b[1]};
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(MiddleWay.middleWay(new int[]{5,2,9}, new int[]{1,3,6})));
}
}
