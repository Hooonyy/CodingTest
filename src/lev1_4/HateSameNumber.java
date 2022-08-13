package lev1_4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HateSameNumber {
    public int[] solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int value = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != value){
                answer.add(arr[i]);
                value = arr[i];
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

}
