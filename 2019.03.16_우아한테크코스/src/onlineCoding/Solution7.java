package onlineCoding;

public class Solution7 {

	public String solution7(String cryptogram) {
        StringBuffer brown = new StringBuffer(cryptogram);

        int bool = 0;	//�ߺ� ���ڰ� �� �̻� ������ while�� ������������ �Ǻ��ϱ� ���� ����
        
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
