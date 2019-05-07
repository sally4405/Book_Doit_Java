package onlineCoding;

public class Solution4 {

	public static void main(String[] args) {
        int[] pobi = {97,98};
        int[] crong = {197,198};
		
		int sum;
        int multi;
        int sumP = 0;
        int sumC = 0;
                
        for(int  i = 0; i < pobi.length; i++){
            sum = pobi[i]/100 + pobi[i]%100/10 + pobi[i]%10;
            
            if(pobi[i] >= 100){
                multi = pobi[i]/100 * pobi[i]%100/10 + pobi[i]%10;
            }
            else if(pobi[i] < 100 & pobi[i] >= 10 ){
                multi = pobi[i]/10 + pobi[i]%10;
            }
            else multi = pobi[i];
            
            sumP = (sumP > sum)? sumP : sum;
            sumP = (sumP > multi)? sumP : multi;
        }
        
        for(int  i = 0; i < crong.length; i++){
            sum = crong[i]/100 + crong[i]%100/10 + crong[i]%10;
            
            if(crong[i] >= 100){
                multi = crong[i]/100 * crong[i]%100/10 + crong[i]%10;
            }
            else if(crong[i] < 100 & crong[i] >= 10 ){
                multi = crong[i]/10 * crong[i]%10;
            }
            else multi = crong[i];
            
            sumC = (sumC > sum)? sumC : sum;
            sumC = (sumC > multi)? sumC : multi;
        }


        int answer = 0;
        if(sumP == sumC) answer = 0;
        else if(sumP > sumC) answer = 1;
        else if(sumP < sumC) answer = 2;
        else answer = -1;
        
        System.out.println(answer);
        System.out.println(sumP);
        System.out.println(sumC);
        
     //   return answer;

    }

}
