package umc.spring.study.converter;

import umc.spring.study.domain.Region;
import umc.spring.study.web.dto.RegionAddStoreRequestDTO;
import umc.spring.study.web.dto.RegionAddStoreResponseDTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class RegionStoreConverter {

    public static RegionAddStoreResponseDTO.AddStoreResultDTO toAddStoreResultDTO(Region region){
        return RegionAddStoreResponseDTO.AddStoreResultDTO.builder()
                .regionId(region.getId())
                .createdAt(LocalDate.now())
                .build();
    }

    public static Region toRegionStore(RegionAddStoreRequestDTO.AddStoreDTO request){
        return Region.builder()
                .id(request.getStoreId())
                .name(request.getStoreName())
                .storeList(new ArrayList<>())
                .build();
    }
}
