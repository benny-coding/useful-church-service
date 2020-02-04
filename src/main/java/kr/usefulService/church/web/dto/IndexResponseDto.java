package kr.usefulService.church.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IndexResponseDto {

    private final String name;
    private final int amount;
}
