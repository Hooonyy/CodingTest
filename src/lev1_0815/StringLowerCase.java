package lev1_0815;

import java.util.Arrays;
import java.util.Collections;

public class StringLowerCase {
    public String solution(String s){
        Character[] arr = new Character[s.length()];
        for(int i =0; i<arr.length; i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        s = "";
        for(int i =0; i<arr.length; i++){
            s += arr[i];
        }
        return s;
    }
    public String solution2(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    public static void main(String[] args) {
        StringLowerCase rs = new StringLowerCase();
        System.out.println(rs.solution("Zbdxdxxd"));
    }
}
