package lev1_2;

public class EvenOrOdd {
    String evenOrOdd(int num){
    return num % 2 == 0? "Event" : "Odd";
    }
    public static void main(String[] args){
        EvenOrOdd  evenOrOdd = new EvenOrOdd();
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
    }
}
