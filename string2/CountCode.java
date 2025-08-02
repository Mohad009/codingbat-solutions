public class CountCode {
    public static int countCode(String str) {
    int count=0;
  for(int i=0; i<=str.length()-4;i++){
    String word =str.substring(i,i+4);
  if(word.charAt(0)=='c' && 
  word.charAt(1)=='o' && 
  word.charAt(3)=='e' 
  ) count++;
  }
  return count;
}
public static void main(String[] args) {
    System.out.println(CountCode.countCode("code"));
}
}
