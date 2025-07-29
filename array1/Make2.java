import java.util.Arrays;

public class Make2 {
    public static int[] make2(int[] a, int[] b) {
if(a.length>=2) return new int[]{a[0],a[1]};
else if(a.length==1) return new int[]{a[0],b[0]};
return new int[]{b[0],b[1]};
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(Make2.make2(new int[]{6}, new int[]{1,3,4,6})));
}
}
