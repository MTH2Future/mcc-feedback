package com.mt.h2f.feedback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mt.h2f.feedback.model.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, String>{

	public List<RatingEntity> findByBookingId(String id);

	public List<RatingEntity> findByCustomerId(long id);

}
