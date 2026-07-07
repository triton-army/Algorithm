import java.util.ArrayList;
import java.util.List;

class Solution12932 {
    public int[] solution(long n) {
        
        List<Long> newList = new ArrayList<>();
        while(n>=1){
            newList.add(n%10);
            n/=10;
        }
        int[] answer = new int[newList.size()];
        
        for(int i = 0; i < newList.size(); i++){
            answer[i] = newList.get(i).intValue();
        }
        

        return answer;
    }
}