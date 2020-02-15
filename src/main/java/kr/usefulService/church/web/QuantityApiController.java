package kr.usefulService.church.web;

import kr.usefulService.church.service.quantity.QuantityService;
import kr.usefulService.church.web.dto.QuantityListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class QuantityApiController {

    private final QuantityService quantityService;

    @GetMapping("/api/quantity/{purpose}")
    public List<QuantityListResponseDto>getquantity(@PathVariable String purpose){
        System.out.println("ApiController : " + quantityService.findThisMonthASC(purpose));
        return quantityService.findThisMonthASC(purpose);
    }



}
