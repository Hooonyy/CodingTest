package lev1_0815;

public class findDemecal {
    public int solution(int n){
        int ans = 0;
        for(int i =2; i<=n; i++){
            boolean flag = true;
            //sqrt 제곱근 나누어떨어지면 소수 x
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    flag =false;
                    break;
                }
            }
            if (flag == true){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        findDemecal fd = new findDemecal();
        int n = 32;
        System.out.println(fd.solution(n));
    }
}
