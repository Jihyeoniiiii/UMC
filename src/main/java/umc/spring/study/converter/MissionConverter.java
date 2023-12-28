package umc.spring.study.converter;

import umc.spring.study.domain.Mission;
import umc.spring.study.domain.Region;
import umc.spring.study.domain.mapping.MemberMission;
import umc.spring.study.web.dto.MissionRequestDTO;
import umc.spring.study.web.dto.MissionResponseDTO;
import umc.spring.study.web.dto.RegionAddStoreRequestDTO;
import umc.spring.study.web.dto.RegionAddStoreResponseDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MissionConverter {
    public static MissionResponseDTO.MissionResultDTO toMissionResultDTO(Mission mission){
        return MissionResponseDTO.MissionResultDTO.builder()
                .missionId(mission.getId())
                .createdAt(LocalDate.now())
                .build();
    }

    public static Mission toMission(MissionRequestDTO.MissionDTO request){
        return Mission.builder()
                .reward(request.getReward())
                .deadline(request.getDeadline())
                .missionSpec(request.getBody())
                .build();
    }

    public static List<MemberMission> toMisisonList(List<String> missionList){
        return missionList.stream()
                .map(memberMission ->
                        MemberMission.builder()
                                .build())
                .collect(Collectors.toList());
    }
}
