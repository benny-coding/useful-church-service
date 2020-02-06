package kr.usefulService.church.web;

import kr.usefulService.church.Service.QuantityService;
import kr.usefulService.church.domain.Quantity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class QuantityApiController {

    private final BibleService bibleService;

    @GetMapping("/api/v1/quantity")
    public QuantitySelectRequestDto getQuantityOfBible(@RequestBody QuantitySelectRequestDto requestDto) {
        return QuantityService.select(requestDto)
    }
}
