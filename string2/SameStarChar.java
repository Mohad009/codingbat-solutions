public class SameStarChar {
    public static boolean sameStarChar(String str) {
  for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='*'){
      if(i>0 && i<str.length()-1){
        if(str.charAt(i-1)!=str.charAt(i+1)) return false;
      }
    }
  }
  return true;
}
public static void main(String[] args) {
    System.out.println(SameStarChar.sameStarChar("*xa*az"));
}
}
