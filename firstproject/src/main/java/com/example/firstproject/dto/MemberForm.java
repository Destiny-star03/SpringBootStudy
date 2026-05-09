package com.example.firstproject.dto;
import com.example.firstproject.entity.Member;

public class MemberForm {
    private String title;
    private String content;

    public MemberForm(String title,String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "MemberForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Member toEntity(){
        return new Member(null, title, content);
    }
}
