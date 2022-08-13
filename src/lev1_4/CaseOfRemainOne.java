package lev1_4;

import java.util.stream.IntStream;
//나머지가 1이되는수 찾기
public class CaseOfRemainOne {
    public int Solution(int n){
        //stream은 함수비용이 적은 코드에서는 성능이 좋지 않기때문에 단순반복문엔 사용을 자제
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
