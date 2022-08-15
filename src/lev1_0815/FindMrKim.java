package lev1_0815;

public class FindMrKim {
    public String solution(String[] seoul){
        String ans = "";

        for(int i =0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")){
                ans = "김서방은" + i + "에있다.";
            }
        }
        return ans;
    }
//Enhanced for
    public String solution2(String[] seoul){
        int x =0;
        for(String name:seoul){
            if(name.equals("Kim"))
                break;
            x++;
        }
        return "김서방은 "+ x +"에 있다";
    }

    public static void main(String[] args) {
        FindMrKim fk = new FindMrKim();
        String[] seoul = {"jane","Kim","mathu","jason"};
        System.out.println(fk.solution2(seoul));
    }
}
