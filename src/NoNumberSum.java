public class NoNumberSum {
    public int noNumberSum(int[] numbers){
        int answer = 45;
        for(int number : numbers)
            answer -= number;

        return answer;
    }
}
