package umc.spring.study.web.dto;

import lombok.Getter;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.service.MissionService.MissionService;
import umc.spring.study.validation.annotation.ExistMembers;
import umc.spring.study.validation.annotation.ExistMissions;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class ChallengeRequestDTO {
    @Getter
    public static class ChallengeDTO{
        @ExistMembers
        Long memberId;
        @ExistMissions
        Long missionId;
        @Enumerated(EnumType.STRING)
        @Column(columnDefinition = "VARCHAR(15) DEFAULT 'CHALLENGE'")
        MissionStatus status;
    }
}
