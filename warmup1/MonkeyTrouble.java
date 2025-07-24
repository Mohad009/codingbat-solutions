package warmup1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  boolean s=false;
  if(aSmile==true && bSmile==true) s=true;
  else if(aSmile==false && bSmile==false) s=true;
  if(aSmile==true && bSmile==false) s=false;
  return s;
}
}
