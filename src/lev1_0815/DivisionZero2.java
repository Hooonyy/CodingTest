package lev1_0815;

import java.util.Arrays;

public class DivisionZero2 {
    public int[] solution(int[] arr, int divisor){
        return Arrays.stream(arr).filter(f -> f % divisor == 0).toArray();
    }
    public static void main(String[] args){
        DivisionZero2 div = new DivisionZero2();
        int[] arr = {5,9,7,10};
        System.out.println(Arrays.toString(div.solution(arr,5)));
    }
}
