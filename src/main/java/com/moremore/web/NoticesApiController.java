package com.moremore.web;

import com.moremore.service.NoticesService;
import com.moremore.web.dto.NoticesSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class NoticesApiController {
    private final NoticesService noticesService;

    @PostMapping("/api/v1/notices")
    public Long save(NoticesSaveRequestDto requestDto) {
        return noticesService.save(requestDto);
    }
}
