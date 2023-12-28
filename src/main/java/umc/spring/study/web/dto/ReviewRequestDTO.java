package umc.spring.study.web.dto;

import lombok.Getter;
import umc.spring.study.validation.annotation.ExistMembers;
import umc.spring.study.validation.annotation.ExistStores;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class ReviewRequestDTO {
    @Getter
    public static class ReviewDTO{
        @ExistMembers
        Long memberId;
        @ExistStores
        Long storeId;
        @NotNull
        Float score;
        @NotBlank
        String body;
    }
}
