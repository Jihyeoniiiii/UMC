package umc.spring.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.study.apiPayload.ApiResponse;
import umc.spring.study.converter.RegionStoreConverter;
import umc.spring.study.domain.Region;
import umc.spring.study.service.RegionStoreService.RegionStoreService;
import umc.spring.study.web.dto.RegionAddStoreRequestDTO;
import umc.spring.study.web.dto.RegionAddStoreResponseDTO;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/region")
public class RegionAddStoreController {
    private final RegionStoreService regionStoreService;

    @PostMapping("/store")
    public ApiResponse<RegionAddStoreResponseDTO.AddStoreResultDTO> join(@RequestBody @Valid RegionAddStoreRequestDTO.AddStoreDTO request){
        Region region = regionStoreService.addStore(request);
        return ApiResponse.onSuccess(RegionStoreConverter.toAddStoreResultDTO(region));
    }
}
