package kr.usefulService.church.service.quantity;

import kr.usefulService.church.domain.QuantityRepository;
import kr.usefulService.church.web.dto.QuantityListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class QuantityService {
    private final QuantityRepository quantityRepository;

    @Transactional(readOnly = true)
    public List<QuantityListResponseDto> findThisMonthASC(String purpose) {
        System.out.println("Service : " + quantityRepository.findThisMonthASC(purpose).stream()
                .map(QuantityListResponseDto::new)
                .collect(Collectors.toList()));
        return quantityRepository.findThisMonthASC(purpose).stream()
                .map(QuantityListResponseDto::new)
                .collect(Collectors.toList());
    }
}

