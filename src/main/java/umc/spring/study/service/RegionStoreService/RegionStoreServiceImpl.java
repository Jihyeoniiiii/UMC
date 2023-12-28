package umc.spring.study.service.RegionStoreService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.study.converter.RegionStoreConverter;
import umc.spring.study.converter.StoreConverter;
import umc.spring.study.domain.Region;
import umc.spring.study.domain.Store;
import umc.spring.study.repository.RegionRepository;
import umc.spring.study.web.dto.RegionAddStoreRequestDTO;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class RegionStoreServiceImpl implements RegionStoreService{
    public final RegionRepository regionRepository;

    public Region addStore(RegionAddStoreRequestDTO.AddStoreDTO request){

        Region regionAddStore = RegionStoreConverter.toRegionStore(request);
        List<String> storeList = request.getStoreListName().stream()
                .collect(Collectors.toList());

        List<Store> storeObjectList = StoreConverter.toStoreList(storeList);
        storeObjectList.forEach(store -> {store.setStore(regionAddStore);});

        return regionRepository.save(regionAddStore);
    }
}
