package lev1_0815;

public class CaesarCipher {
    String solution(String s, int n){
        String result = "";
        n = n % 26;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }else if(Character.isUpperCase(ch)){
                ch = (char) ((ch - 'A'+ n)% 26 +'A');
            }
            result += ch;
        }
        return result;
    }
    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.solution("a B z", 4));
    }
}
