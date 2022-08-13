package lev1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TwoNumberSortIterator {
    public static ArrayList<Integer> solution(int[] numbers){
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1;j< numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            answer.add(iter.next());
        }
        Collections.sort(answer);
        return answer;

    }
}
