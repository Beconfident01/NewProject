package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==명언 앱==");
        Scanner sc =new Scanner(System.in);
        int i=0;

        while(true) {
            System.out.print("명령) ");

            String answer =sc.nextLine();
            if(answer.equals("등록")) {
                i++;
                    System.out.println("명언 : 현재를 사랑하라.");
                    System.out.println("작가 : 작자미상");
                    System.out.println(i + "번 명언이 등록되었습니다.");

            }
            if(answer.equals("목록")){

                System.out.println("번호 / 작가 / 명언");
                System.out.println("---------------------");
                for(int k=i;k>=1;k--) {
                    System.out.println(k + "/ 작자미상 / 현재를 사랑하라.");
                }
            }




            if(answer.equals("종료")){
                break;
            }

        }
        sc.close();
    }

}