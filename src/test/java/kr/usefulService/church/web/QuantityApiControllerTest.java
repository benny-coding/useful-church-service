package kr.usefulService.church.web;

import kr.usefulService.church.domain.QuantityRepository;
import kr.usefulService.church.service.quantity.QuantityService;
import kr.usefulService.church.web.dto.QuantityListResponseDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuantityApiControllerTest {

    @Autowired
    QuantityService quantityService;

    @Test
    public List<QuantityListResponseDto> 리스트_가져오기() {
        return quantityService.findThisMonthASC();
    }
}
