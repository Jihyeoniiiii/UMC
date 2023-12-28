package umc.spring.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.study.apiPayload.ApiResponse;
import umc.spring.study.converter.MissionConverter;
import umc.spring.study.converter.RegionStoreConverter;
import umc.spring.study.domain.Mission;
import umc.spring.study.domain.Region;
import umc.spring.study.service.MissionService.MissionService;
import umc.spring.study.service.RegionStoreService.RegionStoreService;
import umc.spring.study.web.dto.MissionRequestDTO;
import umc.spring.study.web.dto.MissionResponseDTO;
import umc.spring.study.web.dto.RegionAddStoreRequestDTO;
import umc.spring.study.web.dto.RegionAddStoreResponseDTO;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class MissionController {
    private final MissionService missionService;
    @PostMapping("/mission")
    public ApiResponse<MissionResponseDTO.MissionResultDTO> join(@RequestBody @Valid MissionRequestDTO.MissionDTO request){
        Mission mission = missionService.addMission(request);
        return ApiResponse.onSuccess(MissionConverter.toMissionResultDTO(mission));
    }
}
