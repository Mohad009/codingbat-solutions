public class Start1 {
    public static int start1(int[] a, int[] b) {
  if(a.length==0 &&b.length==0) return 0;
  if(a.length>0 &&b.length>0 && a[0]==1 && b[0]==1) return 2;
  else if(a.length>0  && a[0]==1) return 1;
  else if (b.length>0 && b[0]==1)return 1;
  return 0;
}
public static void main(String[] args) {
    System.out.println(Start1.start1(new int[]{1,3,4,6}, new int[]{1,3,6}));
}
}
