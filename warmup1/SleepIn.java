

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
  boolean s=true;
  if(weekday==false && vacation==false) s=true;
  else if (weekday==true && vacation==false) s=false;
  else if (weekday==false && vacation==true)s=true;
  return s;
}
public static void main(String []args){
    System.out.println(SleepIn.sleepIn(false,true));
}
}
