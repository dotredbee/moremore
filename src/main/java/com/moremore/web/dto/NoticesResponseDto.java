package com.moremore.web.dto;

import com.moremore.domain.notices.Notices;
import lombok.Getter;

@Getter
public class NoticesResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public NoticesResponseDto(Notices entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
