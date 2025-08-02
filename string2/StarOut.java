public class StarOut {
    public static String starOut(String str) {
  String word="";
  for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='*') continue;
    if(i>0 && str.charAt(i-1)=='*') continue;
    if(i<str.length()-1 && str.charAt(i+1)=='*')continue;
    
    
    word+=str.charAt(i);
  }
  return word;
}
public static void main(String[] args) {
    System.out.println(StarOut.starOut("ab**cd"));
}
}
