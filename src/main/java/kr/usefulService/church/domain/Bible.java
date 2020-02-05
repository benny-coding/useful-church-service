package kr.usefulService.church.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Bible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

    @Column(length = 2, nullable = false)
    private String type;

    @Column(length = 10, nullable = false)
    private String content;

    @Column
    private int chapter;

    @Builder
    public Bible(String type, String content, int chapter) {
        this.type = type;
        this.content = content;
        this.chapter = chapter;
    }
}
