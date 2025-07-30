public class Old35 {
    public static boolean old35(int n) {
  if(n%3==0 && n%5!=0) return true;
  else if(n%5==0 && n%3!=0) return true;
  return false;
  
}
public static void main(String[] args) {
    System.out.println(Old35.old35(15));
}
}
