package lev1_2;

public class MathSqrt {
    public long solution(long n){
        if(Math.pow((int)Math.sqrt(n),2) == n) {
            return (long) Math.pow(Math.sqrt(n)+1,2);
        }
        return -1;
    }
}
