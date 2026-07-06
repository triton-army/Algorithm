class Solution12925 {
    public int solution(String s) {
        if(s.charAt(0) == '-'){
            String retm = s.substring(1);
            return Integer.parseInt(s);
        }
        else if(s.charAt(0) == '+'){
            String retp = s.substring(1);
            return Integer.parseInt(s);
        } 
        else{
            return Integer.parseInt(s);
        }
    }
}