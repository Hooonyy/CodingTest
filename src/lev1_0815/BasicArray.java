package lev1_0815;

public class BasicArray {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
//예외처리
    public boolean solution2(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }

        } else return false;
    }
    //정규식
    public boolean solution3(String s){
        if(s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }

    public static void main(String[] args) {
        BasicArray ba = new BasicArray();
        String s = "a234";
        System.out.println(ba.solution2(s));
    }

}
