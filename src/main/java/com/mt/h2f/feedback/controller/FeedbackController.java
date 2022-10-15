package com.mt.h2f.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mt.h2f.feedback.model.FeedbackEntity;
import com.mt.h2f.feedback.repository.FeedbackRepository;

@RestController
public class FeedbackController {

	@Autowired
	private FeedbackRepository feedbackRepository;

	@GetMapping("/feedback")
	public List<FeedbackEntity> getAllPartners() {
		return feedbackRepository.findAll();
	}

	@GetMapping("/feedbackByBookingId")
	public List<FeedbackEntity> getFeedbackByBookingId(@RequestParam String bookingId) {
		return feedbackRepository.findByBookingId(bookingId);
	}
	
	@GetMapping("/feedbackByCustomerId")
	public List<FeedbackEntity> getFeedbackByCustomerId(@RequestParam long customerId) {
		return feedbackRepository.findByCustomerId(customerId);
	}

	@PostMapping("/feedback")
	public FeedbackEntity createPartner(@RequestBody FeedbackEntity feedback) {
		return feedbackRepository.save(feedback);
	}

	@PutMapping("/feedback/{id}")
	public FeedbackEntity updatePartner(@RequestBody FeedbackEntity feedback,
			@PathVariable(name = "id") String id) {
		feedback.setBookingId(id);
		return feedbackRepository.save(feedback);
	}

}