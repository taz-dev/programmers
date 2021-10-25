package basic._4;

//10진수를 2진수로 변환
public class Solution {
    public static void main(String[] args) {

        int number = 19;
        int[] bin = new int[100];
        int i = 0;

        while (number > 0) {
            bin[i] = number % 2;
            number /= 2;
            i++;
        }

        i--;
        for (; i >= 0; i--) {
            System.out.print(bin[i]);
        }
    }
}
