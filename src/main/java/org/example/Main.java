package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==명언 앱==");
        Scanner sc =new Scanner(System.in);
        while(true) {
            System.out.print("명령) ");
            String answer =sc.nextLine();

            if(answer.equals("등록")){
                System.out.println("명언 : 현재를 사랑하라.");
                System.out.println("작가 : 작자미상");
                System.out.println("1번 명언이 등록되었습니다.");
            }

            if(answer.equals("종료")){
                break;

            }
        }
        sc.close();
    }

}