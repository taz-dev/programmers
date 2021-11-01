package level1;

//하샤드 수
public class HarshadNumber {
    public static void main(String[] args) {

        boolean answer = true;
        int x = 10;
        int sum = 0;
        String str = "" + x;
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i+1);
        }

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        if (x % sum == 0) {
            System.out.println(answer);
        }else {
            System.out.println(!answer);
        }
    }
}
