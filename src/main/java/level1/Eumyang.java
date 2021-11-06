package level1;

//음양 더하기
public class Eumyang {
    public static void main(String[] args) {

        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {

            if (signs[i] == false) {
                absolutes[i] = - absolutes[i];
            }
            answer += absolutes[i];
        }

        System.out.println(answer); //9
    }
}
