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
    public List<QuantityListResponseDto> findThisMonthASC() {
        return quantityRepository.findThisMonthASC().stream()
                .map(QuantityListResponseDto::new)
                .collect(Collectors.toList());
    }
}

