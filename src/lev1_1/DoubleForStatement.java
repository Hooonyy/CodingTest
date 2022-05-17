package lev1_1;

public class DoubleForStatement {
    public int solution(int left, int right){
        int answer = 0;

        for(int i = left; i<=right; i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if(i % Math.sqrt(i)==0){        //제곱근 반환메소드
                answer -= i;
            }
            //제곱수가 아닌경우 약수의 개수가 짝수
            else{
                answer += i;
            }
        }
        return answer;
    }
}
