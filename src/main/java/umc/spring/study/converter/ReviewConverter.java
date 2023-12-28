package umc.spring.study.converter;

import umc.spring.study.domain.Region;
import umc.spring.study.domain.Review;
import umc.spring.study.web.dto.RegionAddStoreRequestDTO;
import umc.spring.study.web.dto.RegionAddStoreResponseDTO;
import umc.spring.study.web.dto.ReviewRequestDTO;
import umc.spring.study.web.dto.ReviewResponseDTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReviewConverter {
    public static ReviewResponseDTO.ReviewResultDTO toReviewResultDTO(Review review){
        return ReviewResponseDTO.ReviewResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDate.now())
                .build();
    }

    public static Review toReview(ReviewRequestDTO.ReviewDTO request){
        return Review.builder()
                .score(request.getScore())
                .title(request.getBody())
                .build();
    }
}
