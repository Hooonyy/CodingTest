package lev1_4;

public class CaseOfRemainOne2 {
    public int Solution(int n){
        int answer = 0;
        for(int i=2; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
