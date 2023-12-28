package umc.spring.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.FoodCategory;
import umc.spring.study.domain.Member;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
}
