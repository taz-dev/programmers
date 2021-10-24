package level1;

import java.util.ArrayList;

//모의고사
public class MathTest {
    public static void main(String[] args) {

        int[] answers = {1, 3, 2, 4, 2};

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                count[0]++;
            }
            if (answers[i] == b[i % b.length]) {
                count[1]++;
            }
            if (answers[i] == c[i % c.length]) {
                count[2]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (count[i] == max) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            System.out.print(answer[i] + " ");
        }
    }
}
