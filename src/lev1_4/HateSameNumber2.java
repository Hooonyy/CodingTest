package lev1_4;

import java.util.ArrayList;

public class HateSameNumber2 {
    public int[] solution(int[] arr){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int preNum = 0;
        for(int num : arr){
            if(preNum != num)
                temp.add(num);
                preNum = num;
            }
            int[] answer = new int[temp.size()];
            for(int i = 0; i<answer.length; i++){
                answer[i] = temp.get(i).intValue();
            }
            return answer;
        }
}
