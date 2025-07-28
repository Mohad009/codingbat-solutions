public class MiddleThree {
    public static String middleThree(String str) {
  if(str.length()<=3) return str;
  int half=(str.length()/2)-1;
  return (str.substring(half,str.length()-half));
  
  
}
public static void main(String[] args) {
    System.out.println(MiddleThree.middleThree("coding"));
}
}
