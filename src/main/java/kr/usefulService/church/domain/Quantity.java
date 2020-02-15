package kr.usefulService.church.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "quantity")
public class Quantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

    @Column(length = 2, nullable = false)
    private int leapYear;

    @Column
    private java.sql.Date date;

    @Column(length = 50, nullable = false)
    private String purpose;

    @Column(length = 20, nullable = false)
    private String content;

    @Column
    private int totalCount;

    @Builder
    public Quantity(int leapYear, java.sql.Date date, String purpose, String content, int totalCount){
        this.leapYear = leapYear;
        this.date = date;
        this.purpose = purpose;
        this.content = content;
        this.totalCount = totalCount;
    }
}
