package umc.spring.study.web.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

public class MissionRequestDTO {
    @Getter
    public static class MissionDTO{
        @NotNull
        Long storeId;
        @NotNull
        Integer reward;
        LocalDate deadline;
        @Size(min=10, max=200)
        String body;
    }
}
