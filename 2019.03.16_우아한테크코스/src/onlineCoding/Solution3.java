package onlineCoding;

public class Solution3 {

	public String solution3(String word) {
        StringBuffer momSay = new StringBuffer(word);
        
        for(int i = 0; i < word.length(); i++){
            if(momSay.charAt(i) > 96 & momSay.charAt(i) < 123){		//소문자
                char ch = (char)(219 - momSay.charAt(i));
                momSay.setCharAt(i, ch);
            }
            else if(momSay.charAt(i) > 64 & momSay.charAt(i) < 91){		//대문자
                char ch = (char)(155 - momSay.charAt(i));
                momSay.setCharAt(i, ch);
            }                            
        }

        String result = momSay.toString();
        
        return result;
    }
}
