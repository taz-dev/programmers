package basic._3;

//최빈수(가장 많이 출현한 수 구하기)
public class Solution {
    public static void main(String[] args) {

        int[] inputNum = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3};
        int[] mode = new int[10];
        //index -> 출현한 수
        //index 값 -> index가 몇 번 나왔는지 저장하는 용도
        //mode[3] = 5 -> 숫자 3이 5번 출현

        for (int i = 0; i < inputNum.length; i++) {
            mode[inputNum[i]]++;
        }
        //mode[1] == 2
        //mode[2] == 4
        //mode[3] == 2
        //mode[4] == 2

        int modeNum = 0; //최빈수
        int modeCnt = 0; //최빈수가 나온 횟수

        for (int i = 1; i < mode.length; i++) {
            //mode[0] == 0 -> int i = 1로 해도 됨
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수: " + modeNum + " cnt: " + modeCnt);
    }
}
