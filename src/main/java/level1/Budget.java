package level1;

import java.util.Arrays;

//예산
public class Budget {
    public static void main(String[] args) {

        int[] d = {2, 2, 3, 3};
        int budget = 10;
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum <= budget) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
