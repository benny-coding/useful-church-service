package kr.usefulService.church.Service;

import kr.usefulService.church.domain.BibleRepository;
import kr.usefulService.church.domain.QuantityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class QuantityService {
    private final QuantityRepository quantityRepository;
/*
    @Transactional
    public void select(QuantitySelectRequestDto requestDto){
        return quantityRepository.findAll(requestDto.toEntity());
    }
    */
}

