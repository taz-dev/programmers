package basic._2;

//피보나치 수열
public class Solution {
    public static void main(String[] args) {

        //1. 배열
        int[] arr = new int[100];

        //An = An-1 + An-2;  n>=3
        //a1 = 1, a2 = 1
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("=========================");

        //2.
        int prePreNum = 1; //An-2
        int preNum = 1; //An-1
        System.out.print(prePreNum + " ");
        System.out.print(preNum + " ");

        for (int i = 3; i <= 10; i++) {
            int n = prePreNum + preNum;
            System.out.print(n + " ");

            prePreNum = preNum;
            preNum = n;
        }
    }
}
