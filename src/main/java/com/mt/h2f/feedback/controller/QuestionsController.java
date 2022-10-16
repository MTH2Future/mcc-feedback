package com.mt.h2f.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mt.h2f.feedback.model.QuestionsEntity;
import com.mt.h2f.feedback.repository.QuestionsRepository;

@RestController
public class QuestionsController {

	@Autowired
	private QuestionsRepository questionsRepository;

	@GetMapping("/questions")
	public List<QuestionsEntity> getAllQustions() {
		return questionsRepository.findAll();
	}
}