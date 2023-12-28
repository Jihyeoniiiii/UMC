package umc.spring.study.service.ReviewService;

import umc.spring.study.domain.Review;
import umc.spring.study.web.dto.ReviewRequestDTO;

public interface ReviewService {
    public Review addReview(ReviewRequestDTO.ReviewDTO request);
}
