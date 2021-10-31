package level1;

//자연수 뒤집어 배열로 만들기
public class NaturalNumber {
    public static void main(String[] args) {

        long n = 12345;
        String str = "" + n;
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
            System.out.print(answer[i] + " ");
        }
    }
}
