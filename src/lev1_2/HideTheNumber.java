package lev1_2;

public class HideTheNumber {
    public String solution(String phone_number){
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i<ch.length-4; i++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
