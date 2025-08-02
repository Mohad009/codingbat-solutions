public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
    String s="";
  for(int i=0;i<n;i++){
   s+=str.substring(str.length()-n); 
  }return s;
}
public static void main(String[] args) {
    System.out.println(RepeatEnd.repeatEnd("yes", 1));
}
}
