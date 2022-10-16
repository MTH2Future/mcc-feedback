package com.mt.h2f.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mt.h2f.feedback.model.RatingEntity;
import com.mt.h2f.feedback.repository.RatingRepository;

@RestController
public class RatingController {

	@Autowired
	private RatingRepository ratingRepository;

	@GetMapping("/rating")
	public List<RatingEntity> getAllPartners() {
		return ratingRepository.findAll();
	}

	@GetMapping("/ratingbyBookingId")
	public List<RatingEntity> getratingByBookingId(@PathVariable(name = "id") String id) {
		return ratingRepository.findByBookingId(id);
	}
	
	@GetMapping("/ratingByCustomerId")
	public List<RatingEntity> getratingByCustomerId(@PathVariable(name = "id") long id) {
		return ratingRepository.findByCustomerId(id);
	}

	@PostMapping("/rating")
	public RatingEntity createPartner(@RequestBody com.mt.h2f.feedback.model.RatingEntity rating) {
		return ratingRepository.save(rating);
	}

	@PutMapping("/rating/{id}")
	public RatingEntity updatePartner(@RequestBody RatingEntity rating,
			@PathVariable(name = "id") String id) {
		rating.setBookingId(id);
		return ratingRepository.save(rating);
	}
}
