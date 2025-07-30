public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday){
    if(speed <=65) return 0;
    else if(speed<=85 && speed>=66) return 1;
    else return 2;
  }else{
      if(speed <=60) return 0;
    else if(speed<=80 && speed>=61) return 1;
    else return 2;
  }
}
public static void main(String[] args) {
    System.out.println(CaughtSpeeding.caughtSpeeding(60,false));
}
}
