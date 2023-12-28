package umc.spring.study.converter;

import umc.spring.study.domain.Store;

import java.util.List;
import java.util.stream.Collectors;

public class StoreConverter {
    public static List<Store> toStoreList(List<String> storeList){
        return storeList.stream()
                .map(store ->
                        Store.builder()
                                .name(String.valueOf(store))
                                .build()
                ).collect(Collectors.toList());
    }
}
