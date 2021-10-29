package level1;

import java.util.LinkedList;
import java.util.List;

//크레인 인형뽑기 게임
public class Crane {
    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int answer = 0;

        List<Integer> list = new LinkedList<Integer>();
        list.add(-1);

        for (int k = 0; k < moves.length; k++) {
            for (int i = 0; i < board.length; i++) {

                if (board[i][moves[k] - 1] != 0) {

                    if (list.get(list.size() - 1) == board[i][moves[k] - 1]) {
                        list.remove(list.size() - 1);
                        board[i][moves[k] - 1] =0;
                        answer += 2;
                    } else {
                        list.add(board[i][moves[k] - 1]);
                        board[i][moves[k] - 1] =0;
                    }
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
