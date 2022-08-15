package lev1_0815;

public class BetweenOfSum {
    public long solution(int a, int b){
        long ans = 0;
        if(a == b) return a;

        long MAX = Math.max(a,b);
        long MIN = Math.min(a,b);

        for(int i =(int) MIN; i<=MAX; i++){
            ans += i;
        }
        return ans;
    }
    public static void main(String[] args){
        BetweenOfSum bos = new BetweenOfSum();
        int a = 3;
        int b = 5;
        System.out.println(bos.solution(a,b));
    }
}
