package umc.spring.study.service.MissionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.study.apiPayload.code.status.ErrorStatus;
import umc.spring.study.apiPayload.exception.handler.StoreHandler;
import umc.spring.study.converter.MissionConverter;
import umc.spring.study.domain.Mission;
import umc.spring.study.domain.Store;
import umc.spring.study.repository.MissionRepository;
import umc.spring.study.repository.StoreRepository;
import umc.spring.study.web.dto.MissionRequestDTO;

@Service
@RequiredArgsConstructor
public class MissionServiceImpl implements MissionService{
    private final MissionRepository missionRepository;
    private final StoreRepository storeRepository;

    public Mission addMission(MissionRequestDTO.MissionDTO request){
        Long storeId = request.getStoreId();

        Mission newMission = MissionConverter.toMission(request);
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new StoreHandler(ErrorStatus.STORE_NOT_FOUND));
        newMission.setStoreId(store);

        return missionRepository.save(newMission);
    }
}
