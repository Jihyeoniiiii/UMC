package umc.spring.study.web.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class RegionAddStoreRequestDTO {
    @Getter
    public static class AddStoreDTO{
        @NotNull
        Long storeId;
        @NotNull
        String storeName;
        List<String> storeListName;
    }
}
