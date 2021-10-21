package basic._1;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Student st1 = new Student("버니", "1111");
        Student st2 = new Student("테즈", "2222");
        Student st3 = new Student("루피", "3333");

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("계속 검색을 하고 싶다면 y, 종료하고 싶다면 n");
            String input = scan.next();

            if (input.equals("y")) {
                System.out.println("검색을 시작합니다");
                String name = scan.next();
                boolean flag = false; //flag변수를 사용하여 알고리즘 구현

                for (Student student : list) {
                    if (student.getName().equals(name)) {
                        System.out.println(student.getNo()); //학생이름을 입력하면 학번을 출력
                        flag = true;
                    }
                }
                
                if (!flag) { //list에 저장된 학생이 아니라면
                    System.out.println("일치하는 학생이 없음");
                }

            }else if (input.equals("n")) {
                break; //while문 빠져나감
            }
        }
        System.out.println("프로그램이 종료되었습니다");
    }
}
