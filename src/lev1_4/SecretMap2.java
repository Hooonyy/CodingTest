package lev1_4;

public class SecretMap2 {
    public String solution(int n, int m){
        if( n==0){
            if(m>0){
                String str = "";
                for(int i = 0; i<m; i++){
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 1 == 0 ? solution(n/2, m-1) + " " : solution(n/2, m-1) + "#";
        }
    }
    public String[] solution(int n, int [] arr1, int[] arr2){
        String[] answer = new String[n];
        int[] secretMap = new int[n];
        for(int i =0; i<n; i++){
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = solution(secretMap[i], n);
        }
        return answer;
    }
}
