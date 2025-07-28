public class MiddleTwo {
    public static String middleTwo(String str) {
  int half=str.length()/2;
  return str.substring(half-1,half+1);
}
public static void main(String[] args) {
    System.out.println(MiddleTwo.middleTwo("Long"));
}
}
