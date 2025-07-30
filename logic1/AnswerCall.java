public class AnswerCall {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep) return false;
  else if(isMorning){
    if(isMom) return true;
    else return false;
  } 
  return true;
  
}
public static void main(String[] args) {
    System.out.println(AnswerCall.answerCell(true, false, false));
}
}
