package com.ll.wiseSaying.entity;

public class WiseSaying {
    private long id;
    private String authorname;
    private String content;

    public WiseSaying(long id, String authorname, String content) {
        this.id = id;
        this.authorname = authorname;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getAuthorname() {
        return authorname;
    }

    public String getContent() {
        return content;
    }
}


