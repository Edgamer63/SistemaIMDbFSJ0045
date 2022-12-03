package cl.infoclub.fsj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.infoclub.fsj.modelo.Rating;
import cl.infoclub.fsj.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
	private RatingRepository ratingRepository;

	public List<Rating> findAllRatings() {
		return ratingRepository.findAll();
	}

	public Rating findRatingById(Long id) {
		return ratingRepository.findRatingById(id);
	}

	public void addRating(Rating rating) {
		ratingRepository.save(rating);
	}
}