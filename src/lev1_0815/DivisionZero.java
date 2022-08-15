package lev1_0815;

import java.util.ArrayList;
import java.util.Collections;

public class DivisionZero {
    public int[] solution(int[] arr, int divisor){
        int[] ans = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i< arr.length; i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.size() == 0) list.add(-1);

        Collections.sort(list);
        ans = new int[list.size()];

        for(int i =0; i<ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;

    }
}
