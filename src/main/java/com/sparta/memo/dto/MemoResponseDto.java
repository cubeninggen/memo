package com.sparta.memo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sparta.memo.entity.Memo;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemoResponseDto {
    private Long id;
    private String username;
    private String contents;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;


    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.username = memo.getUsername();
        this.contents = memo.getContents();
        this.title = memo.getTitle();
        this.createdAt= memo.getCreatedAt();
        this.modifiedAt = memo.getModifiedAt();
    }


}