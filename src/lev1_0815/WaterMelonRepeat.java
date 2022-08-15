package lev1_0815;

public class WaterMelonRepeat {
    public String solution(int s){
        String ans = "";
        for(int i = 0; i<s; i++){
            if(i % 2 ==0){
                ans += "수";
            }
            else {
                ans += "박";
            }
        }
        return ans;
    }
    public String solution2(int n){
        return new String(new char [n/2+1]).replace("\0","수박").substring(0,n);
    }

    public static void main(String[] args) {
        WaterMelonRepeat wm = new WaterMelonRepeat();
        int s = 12;
        System.out.println(wm.solution2(s));
    }
}
