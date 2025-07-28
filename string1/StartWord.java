public class StartWord {
    public static String startWord(String str, String word) {
if(str.length() < word.length()) return "";
  if(word.length() == 1) return str.substring(0,1);
  if(str.substring(1, word.length()).equals(word.substring(1))) 
    return str.substring(0, word.length());
  return "";

}
public static void main(String[] args) {
    System.out.println(StartWord.startWord("Hippo", "h"));
}
}
