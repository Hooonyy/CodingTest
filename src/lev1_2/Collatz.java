package lev1_2;

public class Collatz {
    public int collatz(int num){
        long n = (long)num;
        for(int i =0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
    public static void main(String[] args){
        Collatz c = new Collatz();
        int ex = 6;
        System.out.println(c.collatz(ex));
    }
}
