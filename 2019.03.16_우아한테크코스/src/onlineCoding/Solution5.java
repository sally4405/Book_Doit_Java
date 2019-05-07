package onlineCoding;

public class Solution5 {

	public int solution6(int number) {
        StringBuffer num = new StringBuffer();
        int answer = 0;
        
        for(int i = 0; i < number; i++){
            num.append(i+1);
        }
        
        for(int j = 0; j < num.length(); j++){
            if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') answer++;
        }
        
        return answer;
    }
}
