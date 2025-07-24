public class Parrot {
    public static boolean parrotTrouble(boolean talking, int hour) {
  boolean t=false;
  if(talking){
    if (hour<7 || hour >20) t=true;
  }
  return t;
}
public static void main(String[] args) {
    System.out.println(Parrot.parrotTrouble(true, 3));
}
}
