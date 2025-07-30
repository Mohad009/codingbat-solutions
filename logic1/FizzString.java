public class FizzString {
    public static String fizzString(String str) {
  char first=str.charAt(0);
  char last=str.charAt(str.length()-1);
  if(first=='f' && last!='b') return "Fizz";
  else if(first!='f'&& last=='b') return "Buzz";
  else if(str.charAt(0)=='f' && str.charAt(str.length()-1)=='b') return "FizzBuzz";
  return str;
}
public static void main(String[] args) {
    System.out.println(FizzString.fizzString("fib"));
}
}
