public class XyBalance {
    
   public static boolean xyBalance(String str) {
  int check=0;
  for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='x')check++;
    else if(str.charAt(i)=='y') check=0;
  }
  return check==0;
}
public static void main(String[] args) {
    System.out.println(XyBalance.xyBalance("aaxbb"));
} 
    
}
