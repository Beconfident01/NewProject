package com.ll;

import com.ll.system.controller.Systemcontroller;
import com.ll.wiseSaying.controller.WiseSayingController;



import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc){
        this.sc=sc;
    }
    public void run() {
        System.out.println("==명언 앱==");

        Systemcontroller systemcontroller =new Systemcontroller();
        WiseSayingController wiseSayingController=new WiseSayingController(sc);

        while(true) {
            System.out.print("명령) ");
            String command=sc.nextLine().trim();
            Rq rq=new Rq(command);

            switch (rq.getActionCode()) {
                case "종료":
                    systemcontroller.exit();
                    return;
                case "목록":
                    wiseSayingController.list();
                    break;
                case "등록":
                    wiseSayingController.write();
                    break;
                case "삭제":
                    wiseSayingController.remove(rq);
                    break;
            }




            }
        }
    }

