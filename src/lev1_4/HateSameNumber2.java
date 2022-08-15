package lev1_4;

import java.util.ArrayList;

public class HateSameNumber2 {
    public int[] solution(int[] arr){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int preNum = 0;
        //arr[]의 인덱스 값에 num을넣고 포문을 돌린다
        for(int num : arr){
            //인덱스 0 preNum이 num과 같지 않으면
            if(preNum != num)
                //arrayList temp에 add
                temp.add(num);
                preNum = num;
            }

            int[] answer = new int[temp.size()];
            for(int i = 0; i<answer.length; i++){
                //intValue를 하지않으면 int 타입이아닌 Integer타입으로 나온다
                answer[i] = temp.get(i).intValue();
            }
            return answer;
        }
}
