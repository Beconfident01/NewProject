package com.ll.wiseSaying.controller;

import com.ll.Rq;
import com.ll.wiseSaying.entity.WiseSaying;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    private final Scanner sc;
    private long lastwiseSayingId;
    private List<WiseSaying> wiseSayings;

    public WiseSayingController(Scanner sc) {
        this.sc = sc;
        lastwiseSayingId = 0;
        wiseSayings = new ArrayList<>();
    }

    public void write() {
        long id = lastwiseSayingId + 1;
        System.out.print("명언 : ");
        String content = sc.nextLine();
        System.out.print("작가 : ");
        String authorname = sc.nextLine();
        WiseSaying wiseSaying = new WiseSaying(id, authorname, content);
        wiseSayings.add(wiseSaying);
        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
        lastwiseSayingId = id;

    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("---------------------");
        for (int i = wiseSayings.size() - 1; i >= 0; i--) {
            WiseSaying wiseSaying = wiseSayings.get(i);
            System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getAuthorname(), wiseSaying.getContent());
        }
    }

    public void remove(Rq rq) {
        long id = rq.getLongParam("id",-1);

        if (id==-1) {
            System.out.println("id(정수)를 입력해주세요.");
            return;
        }
        //입력된 id와 일치하는 명언객체찾기
        WiseSaying wiseSaying = findById(id);
        //찾은 명언객체를 리스트에서 제거
        wiseSayings.remove(wiseSaying);

        System.out.printf("%d번 명언이 삭제되었습니다.\n",id);
    }

    private WiseSaying findById(long id) {
        for (WiseSaying wiseSaying : wiseSayings) {
            if (wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }
}