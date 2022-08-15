package lev1_0815;

public class BetweenOfSum2 {
    //등차수열의 합공식 (b-a+1) * (a+b)을 이용
    public long solution(int a, int b){
        return sumAtoB(Math.min(a,b), Math.max(b,a));
    }
    private long sumAtoB(long a, long b){
        return (b -a + 1) * ( a + b)/2;
    }
}
