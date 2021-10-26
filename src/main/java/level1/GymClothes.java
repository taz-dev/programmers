package level1;

import java.util.Arrays;

//체육복
public class GymClothes {
    public static void main(String[] args) {

        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                } else if (lost[i] == reserve[j] + 1) {
                    lost[i] = -1;
                    reserve[j] =-1;
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
