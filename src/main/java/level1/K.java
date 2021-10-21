package level1;

import java.util.Arrays;

//k번째 수
public class K {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] change = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); //5263
            Arrays.sort(change); //2356
            answer[i] = change[commands[i][2] - 1];
        }
        System.out.println(Arrays.toString(answer));
    }
}
