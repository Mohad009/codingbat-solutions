package warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
  boolean s=true;
  if(weekday==false && vacation==false) s=true;
  else if (weekday==true && vacation==false) s=false;
  else if (weekday==false && vacation==true)s=true;
  return s;
}
}
