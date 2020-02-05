package kr.usefulService.church.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Quantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

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

    @Builder
    public Quantity(int leapYear, java.sql.Date date, int purpose, String content, int totalCount){
        this.leapYear = leapYear;
        this.date = date;
        this.purpose = purpose;
        this.content = content;
        this.totalCount = totalCount;
    }
}
