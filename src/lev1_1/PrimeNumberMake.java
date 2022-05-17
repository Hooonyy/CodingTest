package lev1_1;

import java.util.ArrayList;

public class PrimeNumberMake {
    public int solution(int[] nums){
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(i + 2 >= nums.length)break;
            for(int j = i+1; j<nums.length; j++){
                for(int h = i +2; h<nums.length; h++){
                    list.add(nums[i] + nums[j] + nums[h]);
                }
            }
        }
        for(Integer i : list){
            int cnt = 2;
            answer++;
            while (cnt < i) {
                if(i % cnt == 0){
                    answer--;
                    break;
                }
                cnt++;
            }
        }
        return answer;
    }
}
