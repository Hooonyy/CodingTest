package lev1_2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MakeRec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString())); //stringbuilder는 문자열로 뽑을때 tostring을사용
    }
}