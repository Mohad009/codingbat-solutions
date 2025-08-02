public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
  String s="";
  for(int i=1;i<=count;i++){
    s+=word;
    if(i<count)s+=sep;
  }
  return s;
}
public static void main(String[] args) {
    System.out.println(RepeatSeparator.repeatSeparator("After", "This", 3));
}
}
