package lev1_1;

public class GreedyUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];      //학생수
        int answer = n;                 //수업가능한사람

        for (int l : lost)
            people[l - 1]--;            //빌릴때마다 1사람씩 줄음 3..2..1
        for (int r : reserve)
            people[r - 1]++;            //??

        for (int i = 0; i < people.length; i++) {
            if (people[i] == -1) {
                if (i - 1 >= 0 && people[i - 1] == 1) {
                    people[i]++;        //수업가능한사람
                    people[i - 1]--;       //빌려준사람
                } else if (i + 1 < people.length && people[i + 1] == 1) {
                    people[i]++;
                    people[i + 1]--;

                } else
                    answer--;
            }
        }
        return answer;
    }
}
//https://jason-api.tistory.com/58