public class NearTen {
    public static boolean nearTen(int num) {
  return num%10<=2 || num%10>=8;
}
public static void main(String[] args) {
    System.out.println(NearTen.nearTen(12));
}
}
