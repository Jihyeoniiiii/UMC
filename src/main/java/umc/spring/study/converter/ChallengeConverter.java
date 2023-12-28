package umc.spring.study.converter;

import umc.spring.study.domain.Mission;
import umc.spring.study.domain.mapping.MemberMission;
import umc.spring.study.web.dto.ChallengeRequestDTO;
import umc.spring.study.web.dto.ChallengeResponseDTO;
import umc.spring.study.web.dto.MissionRequestDTO;
import umc.spring.study.web.dto.MissionResponseDTO;

import java.time.LocalDate;

public class ChallengeConverter {
    public static ChallengeResponseDTO.ChallengeResultDTO toChallengeResultDTO(MemberMission memberMission){
        return ChallengeResponseDTO.ChallengeResultDTO.builder()
                .challengeId(memberMission.getId())
                .createdAt(LocalDate.now())
                .build();
    }

    public static MemberMission toMemberMission(ChallengeRequestDTO.ChallengeDTO request){
        return MemberMission.builder()
                .status(request.getStatus())
                .build();
    }
}
