package lev1_3;

public class WhatdayIsToday {
    public String getDayName(int a, int b){
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int select = 0;
        for(int i =0; i < a-1; i++){
            select += b-1;
        }
        return day[select % 7];
}
    public static void main(String[] args)
    {
        WhatdayIsToday test = new WhatdayIsToday();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}
