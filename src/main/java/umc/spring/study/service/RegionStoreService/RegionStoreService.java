package umc.spring.study.service.RegionStoreService;

import umc.spring.study.domain.Region;
import umc.spring.study.web.dto.RegionAddStoreRequestDTO;

public interface RegionStoreService {
    public Region addStore(RegionAddStoreRequestDTO.AddStoreDTO request);
}
