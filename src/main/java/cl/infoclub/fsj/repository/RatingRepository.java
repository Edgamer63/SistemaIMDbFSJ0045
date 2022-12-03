package cl.infoclub.fsj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.infoclub.fsj.modelo.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
	List<Rating> findAll();

	Rating findRatingById(Long id);
}