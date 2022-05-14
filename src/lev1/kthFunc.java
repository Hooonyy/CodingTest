package lev1;

import java.util.Arrays;

public class kthFunc {
    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int a = 0;
        for(int[] info : commands){
            int i = info[0];
            int j = info[0];
            int k = info[0];

            int[] buf = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(buf);
            answer[a] = buf[k-1];
            a++;

        }
        return answer;
    }
}
