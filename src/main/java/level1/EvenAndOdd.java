package level1;

//짝수와 홀수
public class EvenAndOdd {
    public static void main(String[] args) {

        int num = 3;
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        System.out.println(answer);
    }
}
