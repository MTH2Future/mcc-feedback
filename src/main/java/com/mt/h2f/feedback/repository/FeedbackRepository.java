package com.mt.h2f.feedback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mt.h2f.feedback.model.FeedbackEntity;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackEntity, String>{

	public List<FeedbackEntity> findByCustomerId(long customerId);

	public List<FeedbackEntity> findByBookingId(String id);

}
