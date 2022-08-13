package lev1_4;

public class BringCenterStr2 {
    String getsolution(String s){
        String str = "";

        if(s.length() == 0){
            System.out.println("해당숫자는 연산이 불가능합니다.");
        }else {
            str = s.substring((s.length()-1)/2, s.length()/2 +1);
        }
        return str;
    }
    public static void main(String[] args){
        BringCenterStr2 se = new BringCenterStr2();
        System.out.println(se.getsolution(""));
    }
}
