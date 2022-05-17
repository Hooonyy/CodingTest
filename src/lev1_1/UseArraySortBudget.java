package lev1_1;

import java.util.Arrays;

public class UseArraySortBudget {
    public int solution(int[] d, int budget){
        int answer = 0;

        Arrays.sort(d);     //부서별로 신청한 금액이 들어있는 d를 오름차순 정렬하여 효율적으로 제거

        for(int i = 0; i < d.length; i++){
            budget -= d[i];     //예산값을 하나씩 빼다가

            if(budget < 0) break;   //0보다 작아지면 break
            answer++;
        }
        return answer;
    }
}
