package lev1_0815;

public class BetweenOfSum3 {
    public long solution(int a, int b){
    long ans = 0;
    for( int i  = ((a<b)? a:b); i<=((a<b)? b:a); i++)
        ans += i;
        return ans;

    }
    public static void main(String[] args){
        BetweenOfSum3 bos = new BetweenOfSum3();
        int a = 5;
        int b = 3;
        System.out.println(bos.solution(a,b));
    }
}
