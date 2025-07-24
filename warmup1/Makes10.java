public class Makes10 {
    public static boolean makes10(int a, int b) {
  boolean r=false;
  if(a==10 || b==10 || a+b==10)r=true;
  return r;
}
public static void main(String[] args) {
    System.out.println(Makes10.makes10(5, 5));
}
}
