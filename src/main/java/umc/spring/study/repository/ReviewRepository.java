package umc.spring.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.Review;
import umc.spring.study.domain.Store;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
