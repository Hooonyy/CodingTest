package lev1_0815;

import java.util.ArrayList;
import java.util.Collections;

public class SortOfIndex {
    public String[] solution(String[] str, int n) {
        String[] ans = {};
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<str.length; i++){
            list.add(""+str[i].charAt(n) + str[i]);
        }
        Collections.sort(list);

        ans = new String[list.size()];
        for(int i = 0; i <list.size(); i++){
            ans[i] = list.get(i).substring(1, list.get(i).length());
        }

        return ans;
    }
}
