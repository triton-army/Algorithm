class Solution {
    public long solution(long n) {
        n = 118372;
        long ori = n;
        int count = 1;
        long sum = 0;
        while(ori >= 1){
            
            ori /= 10;
            count++;
        }
        for(int i = 2; i <= count; i++){
            sum += (n % 10)*Math.pow(10, count-i);
            n/=10;
        }

        return sum;
    }
}