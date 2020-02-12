package kr.usefulService.church.web.dto;

import kr.usefulService.church.domain.Quantity;
import lombok.Getter;


@Getter
public class QuantityListResponseDto {
    private Long index;
    private int leapYear;
    private java.sql.Date date;
    private int purpose;
    private String content;
    private int totalCount;

    public QuantityListResponseDto(Quantity entity) {
        this.index = entity.getIndex();
        this.leapYear = entity.getLeapYear();
        this.date = entity.getDate();
        this.purpose = entity.getPurpose();
        this.content = entity.getContent();
        this.totalCount = entity.getTotalCount();
    }
}
