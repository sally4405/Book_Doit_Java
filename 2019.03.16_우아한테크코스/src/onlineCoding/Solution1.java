package onlineCoding;

class Solution1 {
    public int[] solution(int money) {
    	int[] answer = {0,0,0,0,0,0,0,0,0};
    	int bill = 50000;       //���� ������ ������ ����
        int sw = 0;     //���� ���� ������ 5�� ����� 10�� ����� ������ ����
        
        for(int i = 0; i <answer.length; i++){
            answer[i] = money / bill;
            money %= bill;
            if(sw == 0){
                bill /= 5;
                sw = 1;
                if(bill == 10) sw =2;            
            }
            else if(sw == 2) bill /= 10;
            else {
                bill /= 2;
                sw = 0;
            }
            if(bill == 5){
                answer[8] = bill;
                break;
            }
        }
        
        
        return answer;
    }
}
