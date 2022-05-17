package lev1_2;

public class Num_x {
    public static long[] solution(int x, int n){
        long[] answer = new long[n];
        answer[0] = x;

        for(int i = 0; i<n; i++){
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }
}
