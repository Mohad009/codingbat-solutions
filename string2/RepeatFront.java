public class RepeatFront {
    public static String repeatFront(String str, int n) {
  String s="";
  if( n >= 0 && n <= str.length()){
    for(int i=n;i>=1;i--){
      s+=str.substring(0,i);

    }
  }
  return s;
}
public static void main(String[] args) {
    System.out.println(RepeatFront.repeatFront("Computer", 2));
}
}
