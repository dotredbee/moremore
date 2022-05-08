package com.moremore.service;

import com.moremore.domain.notices.NoticesRepository;
import com.moremore.web.dto.NoticesSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class NoticesService {
    private final NoticesRepository noticesRepository;

    @Transactional
    public Long save(NoticesSaveRequestDto requestDto) {
        return noticesRepository.save(requestDto.toEntity()).getId();
    }
}
