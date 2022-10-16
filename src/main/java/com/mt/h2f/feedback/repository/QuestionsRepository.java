package com.mt.h2f.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mt.h2f.feedback.model.QuestionsEntity;

@Repository
public interface QuestionsRepository extends JpaRepository<QuestionsEntity, Integer>{

}
