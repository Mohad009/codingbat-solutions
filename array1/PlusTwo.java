import java.util.Arrays;

public class PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
  return new int[]{a[0],a[1],b[0],b[1]};
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(PlusTwo.plusTwo(new int[]{1,6}, new int[]{1,3})));
}
}
