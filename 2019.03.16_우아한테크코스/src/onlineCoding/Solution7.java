package onlineCoding;

public class Solution7 {

	public String solution7(String cryptogram) {
        StringBuffer brown = new StringBuffer(cryptogram);

        int bool = 0;	//중복 문자가 더 이상 없으면 while을 빠져나가도록 판별하기 위한 변수
        
        do{     
         bool = 0;    
         for(int i = 0; i <= brown.length()-2; i++){
             if(brown.charAt(i) == brown.charAt(i+1)) {
                brown.delete(i,i+2);
                bool = 1;
              }
         }                                
        }while(bool == 1);

        String answer = brown.toString();
        return answer;
    }

}
