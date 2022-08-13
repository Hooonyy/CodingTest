package lev1_2;

import javax.swing.*;

public class TestJavaArray {
    /*public static void main(String[] args){
        char[] arr = new char[26];

        for(int i = 0; i<arr.length; i++){
            arr[i] = (char)(90-i);
            System.out.print(arr[i] + "");
        }
    }*/
    public static void main(String[] args){
        String str = JOptionPane.showInputDialog("텍스트");
        char[] arr = new char[str.length()];

        String msg = "";
        for(int i = 0; i<arr.length; i++){
            arr[i] = str.charAt(str.length()-1 - i);
            msg += arr[i];
        }
        JOptionPane.showInputDialog(null, msg);
    }
}
