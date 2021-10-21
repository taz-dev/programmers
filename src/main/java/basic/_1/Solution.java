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
            System.out.println("계속 검색을 하고싶으시면 y, 종료하고 싶으면 n");
            String input = scan.next();

            if (input.equals("y")) {
                System.out.println("검색을 시작합니다");
                String name = scan.next();
                boolean flag = false;

                for (Student student : list) {
                    if (student.getName().equals(name)) {
                        System.out.println(student.getNo());
                        flag = true;
                    }
                }
                
                if (!flag) {
                    System.out.println("존재하는 학생이 없습니다");
                }

            }else if (input.equals("n")) {
                break;
            }
        }

        System.out.println("프로그램이 종료되었습니다");
    }
}
