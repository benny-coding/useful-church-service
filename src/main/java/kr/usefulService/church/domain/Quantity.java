package kr.usefulService.church.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

public class Quantity {

    @Column(length = 2, nullable = false)
    private int leapYear;

    @Column(name = "DATE_FIELD")
    private java.sql.Date date;

    @Column(length = 3, nullable = false)
    private int purpose;

    @Column(length = 20, nullable = false)
    private String content;

    @Column
    private int totalCount;
}
