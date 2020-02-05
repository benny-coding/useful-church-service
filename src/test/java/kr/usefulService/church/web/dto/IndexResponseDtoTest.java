package kr.usefulService.church.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class IndexResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        IndexResponseDto dto = new IndexResponseDto(name,amount);
        dto.getName();
        //then
        assertThat(dto.getName()).isEqualTo(name);
    }
}
