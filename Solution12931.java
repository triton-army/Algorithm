import java.util.Scanner;

public class Solution12931 {
    public int solution(int n) {
        int ori = n;
        int sum = 0;
        int count = 0;
        while(ori >= 1){
            ori /= 10;
            count++;
        }
        for(int i = 0; i < count; i++){
            sum += n%10;
            n/=10;
        }

        return sum;
    }
}