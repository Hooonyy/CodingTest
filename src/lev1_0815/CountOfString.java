package lev1_0815;

import java.util.Locale;

public class CountOfString {
    boolean solution(String s){
        int pCount = 0, yCount =0;
        String[] arr = s.toLowerCase().split("");

        for (int i = 0; i<arr.length; i++){
            if("p".equals(arr[i])){
                pCount++;
            }else if("y".equals(arr[i])){
                yCount++;
            }
        }
        if(pCount != yCount){
            return false;
        }
        return true;
    }
    boolean solution2(String s){
        s = s.toUpperCase();
        return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e->'Y' == e).count();
    }
    public static void main(String[] args) {
        CountOfString cos = new CountOfString();
        String s = "pPoooyY";
        System.out.println(cos.solution(s));

    }
}
