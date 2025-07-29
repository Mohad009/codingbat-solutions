import java.util.Arrays;

public class Front11 {
    public static int[] front11(int[] a, int[] b) {
  if(a.length>0 &&b.length>0) return new int[]{a[0],b[0]};
else if(a.length>0) return new int[]{a[0]};
else if(b.length>0) return new int[]{b[0]};
return new int[0];
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(Front11.front11(new int[]{1,3,4,6}, new int[]{})));
}
}
