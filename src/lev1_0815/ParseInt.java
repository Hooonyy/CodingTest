package lev1_0815;

public class ParseInt {
    public int solution(String s){
        return Integer.parseInt(s);
    }
    public int solution2(String str){
        boolean Sign = true;
        int result =0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '-')
                Sign = false;
            else if(ch != '+')
                result = result * 10 + (ch - '0');
        }
        return Sign? 1:-1 * result;
    }

    public static void main(String[] args) {
        ParseInt pi = new ParseInt();
        String s = "-1432";
        System.out.println(pi.solution(s));
    }
}
