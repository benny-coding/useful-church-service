package kr.usefulService.church.domain;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BibleRepositoryTest {

    @Autowired
    BibleRepository bibleRepository;

    @After
    public void cleanup(){
        bibleRepository.deleteAll();
    }

    @Test
    public void 추가_불러오기() {
        // given
        String type = "신";
        String content = "창";
        int chapter = 1;

        bibleRepository.save(Bible.builder()
                .type(type)
                .content(content)
                .chapter(chapter)
                .build());

        // when
        List<Bible> bibleList = bibleRepository.findAll();

        // then
        Bible bible = bibleList.get(0);
        assertThat(bible.getType()).isEqualTo(type);
        assertThat(bible.getContent()).isEqualTo(content);
        assertThat(bible.getChapter()).isEqualTo(chapter);

    }
}
