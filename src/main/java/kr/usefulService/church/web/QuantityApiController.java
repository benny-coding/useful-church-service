package kr.usefulService.church.web;

import kr.usefulService.church.service.quantity.QuantityService;
import kr.usefulService.church.web.dto.QuantityListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class QuantityApiController {

    private final QuantityService quantityService;

    @GetMapping("/api/quantity")
    public List<QuantityListResponseDto>getquantity(){
        return quantityService.findThisMonthASC();
    }



}
