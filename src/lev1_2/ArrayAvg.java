package lev1_2;

import java.util.Arrays;

public class ArrayAvg {
    public int getMean(int[] array){
        return (int) Arrays.stream(array).average().orElse(0);
    }
    public static void main(String[] args){
        int x[] = {5,4,3};
        ArrayAvg arrayAvg = new ArrayAvg();
        System.out.println("평균값 : " + arrayAvg.getMean(x));
    }
}
