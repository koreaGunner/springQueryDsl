package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
public class MemberDto {

    private String username;
    private int age;

    //@NoArgsConstructor
//    public MemberDto() {
//    }

    @QueryProjection //Dto도 Q파일로 생성됨
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
